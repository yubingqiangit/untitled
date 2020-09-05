package auth;/**
 *
 * @author yubingqian
 * @date 2020-07-28 14:26
 *
 */

import com.sun.istack.internal.logging.Logger;

import java.util.Arrays;
import java.util.List;

/**
 * TODO 
 * @version 1.0
 * @author yubingqian
 * @date 2020/7/28 14:26 
 */
public interface AuthService {
    Object auth(AuthReqItem authReqItem);
}



class GWAuth implements  AuthService{
    public static final GWAuth instance = new GWAuth();

    private GWAuth() {

    }

    public static GWAuth getInstance() {
        return instance;
    }

    @Override
    public Object auth(AuthReqItem authReqItem) {
        System.out.println("GW auth do.");
        return null;
    }
}

class Personal implements  AuthService{

    public static final Personal instance = new Personal();

    public static Personal getInstance() {
        return instance;
    }

    @Override
    public Object auth(AuthReqItem authReqItem) {
        System.out.println("Personal auth do.");
        return null;
    }
}

class ChannelConfig{
    public static final Logger logger = Logger.getLogger(ChannelConfig.class);

    public static final Integer ORDER_CHANNEL_APP = 1;// e充电app
    public static final Integer ORDER_CHANNEL_WEB = 2;// e充电网站
    public static final Integer ORDER_CHANNEL_WXMP = 3;// 微信公众号
    public static final Integer ORDER_CHANNEL_STORE = 4;// 营业厅
    public static final Integer ORDER_CHANNEL_STAKE = 5;// 充电桩
    public static final Integer ORDER_CHANNEL_ECHECHENG = 30;// 30.e车城
    public static final Integer ORDER_CHANNEL_BY_LIANXING =2100 ;// 联行社会桩系统(自营业务)
    public static final Integer ORDER_CHANNEL_BY_LIANXING_CH =2101 ;// 联行社会桩系统(撮合业务)

    public static final Integer[]ORDER_CHANNEL_GW = {ORDER_CHANNEL_APP,ORDER_CHANNEL_STAKE,ORDER_CHANNEL_BY_LIANXING};
    public static final Integer[]ORDER_CHANNEL_CH = {ORDER_CHANNEL_BY_LIANXING_CH};



}

class ContextStrategy extends ChannelConfig{

    private static final List<Integer> CHANNEL_GW = Arrays.asList(ORDER_CHANNEL_GW);
    private static final List<Integer> CHANNEL_CH = Arrays.asList(ORDER_CHANNEL_CH);

    enum StrategyEnum{
        GW(CHANNEL_GW,"国网",GWAuth.getInstance()),
        PERSONAL(CHANNEL_CH,"撮合",Personal.getInstance());

        public List<Integer> channels;

        public String dsc;
        public AuthService authService;

        StrategyEnum(List<Integer> channels,String dsc,AuthService authService){
            this.channels = channels;
            this.dsc = dsc;
            this.authService = authService;
        }

        public List<Integer> getChannels() {
            return channels;
        }

        public AuthService getAuthService() {
            return authService;
        }

        public static AuthService getConnonEnum(Integer channel) {
            logger.info("getConnonEnum-channel [" + channel + "]");
            return Arrays.asList(StrategyEnum.values()).stream().filter(x->x.channels.contains(channel)).findFirst()
                    .orElseThrow(()->new RuntimeException("ConnonEnum not found")).getAuthService();
        }
    }
}


class Test{
    public static void main(String[] args) {
        AuthReqItem authReqItem = new AuthReqItem();
        authReqItem.setOrderChannel(5);
        Object result = ContextStrategy.StrategyEnum.getConnonEnum(authReqItem.getOrderChannel()).auth(authReqItem);
    }
}
package enumTest.preauthDemo;

import java.util.Arrays;

/**
 * ADD策略组合
 */

/**
 * ABD策略
 */
public class GWstake implements  StrategyService {

    @Override
    public boolean preAuth(String type) {
        boolean b = StrategyEnum.valueOf("PREAUTHA").service().preauth(type);
        boolean c = StrategyEnum.valueOf("PREAUTHB").service().preauth(type);
        boolean d = StrategyEnum.valueOf("PREAUTHD").service().preauth(type);
        StrategyEnum anEnum = StrategyEnum.valueOf("PREAUTHD");

        StrategyEnum[] values = StrategyEnum.values();
        Arrays.stream(values).forEach(x->{
            System.out.println(x.type());
        });
        System.out.println("============================");
        System.out.println("国网桩/社会桩鉴权结束");
        return false;
    }
}

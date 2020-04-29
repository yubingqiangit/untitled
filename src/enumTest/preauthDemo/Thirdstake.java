package enumTest.preauthDemo;

/**
 * BC策略组合
 */
public class Thirdstake implements StrategyService {

    @Override
    public boolean preAuth(String type) {
        boolean c = StrategyEnum.valueOf("PREAUTHB").service().preauth(type);
        boolean d = StrategyEnum.valueOf("PREAUTHC").service().preauth(type);
        System.out.println("第三方桩鉴权结束");
        return false;
    }
}

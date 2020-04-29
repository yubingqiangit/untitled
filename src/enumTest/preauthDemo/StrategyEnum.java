package enumTest.preauthDemo;

/**
 * 枚举策略
 */
public enum StrategyEnum {

    PREAUTHA("订单重复",StrategyInteface.preauthA()),
    PREAUTHB("账户鉴权",StrategyInteface.preauthB()),
    PREAUTHC("用户鉴权",StrategyInteface.preauthC()),
    PREAUTHD("花枝鉴权",StrategyInteface.preauthD());




    private String type;
    private StrategyInteface service;

    StrategyEnum(String type, StrategyInteface service) {
        this.type = type;
        this.service = service;
    }

    public String type(){
        return type;
    }

    public StrategyInteface service(){
        return service;
    }
}

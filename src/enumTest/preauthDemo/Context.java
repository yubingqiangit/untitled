package enumTest.preauthDemo;

/**
 * 上下文
 */
public class Context {
    StrategyService strategyService;

    public Context(StrategyService strategyService) {
        this.strategyService = strategyService;
    }

    public boolean preauth(String type){

        return  strategyService.preAuth(type);
    }
}

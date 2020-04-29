package enumTest.preauthDemo;

public class Context {
    StrategyService strategyService;

    public Context(StrategyService strategyService) {
        this.strategyService = strategyService;
    }

    public boolean preauth(String type){

        return  strategyService.preAuth(type);
    }
}

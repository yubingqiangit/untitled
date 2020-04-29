package enumTest.preauthDemo;

/**
 * 业务策略
 */
public interface StrategyInteface {

    boolean preauth(String type);

    static StrategyInteface preauthA(){
        return new StrategyInteface(){
            @Override
            public boolean preauth(String type){
                System.out.println("A-鉴权处理开始" + type);
                return true;
            }
        };
    }

    static StrategyInteface preauthB(){
        return new StrategyInteface(){
            @Override
            public boolean preauth(String type){
                System.out.println("B-鉴权处理开始" + type);
                return true;
            }
        };
    }

    static StrategyInteface preauthC(){
        return new StrategyInteface(){
            @Override
            public boolean preauth(String type){
                System.out.println("C-鉴权处理开始" + type);
                return false;
            }
        };
    }
    static StrategyInteface preauthD(){
        return new StrategyInteface(){
            @Override
            public boolean preauth(String type){
                System.out.println("D-鉴权处理开始" + type);
                return false;
            }
        };
    }

}

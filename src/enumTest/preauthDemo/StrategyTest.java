package enumTest.preauthDemo;

public class StrategyTest {

    public static void main(String[] args) {
       /* boolean b = StrategyEnum.valueOf("PREAUTHA").service().preauth("订单重复鉴权");
        boolean c = StrategyEnum.valueOf("PREAUTHB").service().preauth("账户鉴权");
        boolean d = StrategyEnum.valueOf("PREAUTHC").service().preauth("用户鉴权");
        System.out.println("鉴权结果1" + b);
        System.out.println("鉴权结果2" + c);
        System.out.println("鉴权结果3" + d);
        aaaab
        */

        Context context = new Context(new GWstake());
        context.preauth("请求参数对象");
        Context context1 = new Context(new Thirdstake());
        context1.preauth("请求参数对象");

    }
}

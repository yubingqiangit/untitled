package enumTest.preauthDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GitTest {

    public static void main(String[] args) {
       /* System.out.println("我是dev第一次提交");
        System.out.println("我是dev第二次提交");
         System.out.println("我是dev第三次提交");
        System.out.println("我是devpolye第二次提交");
        System.out.println("哈哈哈哈哈11111111");
        System.out.println("哈哈哈哈哈2222222");
        System.out.println("3333333333333333");
        System.out.println("4444444444444444444");
        System.out.println("5455555555555555");
        System.out.println("6666666666666666666");
        System.out.println("6666666666666666666");
        System.out.println("777777777777777");
        System.out.println("777777777777777");
        System.out.println("777777777777777");
        System.out.println("888888888888888888888");*/

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("344");
        list.add("555");

        StrategyEnum[] values = StrategyEnum.values();
        Arrays.stream(values).forEach(x->{
            System.out.println(x);
            System.out.println(x.type());
            System.out.println(x.name());
        });

        System.out.println("values = " + values);


        System.out.println("===========================");

        list.stream().forEach(x->{
            System.out.println(x);
        });

    }
}



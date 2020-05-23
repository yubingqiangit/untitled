package test;

import java.util.ArrayList;

public class Cat {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("2");
        list.add("3");
        String one = getOne(list);
              String one = getOne(list);
              String one = getOne(list);

    }


    /**
     * 获取集合第一个参数
     * @param list
     * @param <T>
     * @return
     */
    public static <T>T getOne(ArrayList<T> list){

        return list.get(0);
    }
}

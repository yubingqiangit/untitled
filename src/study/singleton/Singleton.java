package study.singleton;


/**
 * 饿汉加载
 * 加载类的时候就会初始化instance（推荐使用）
 * 线程安全的
 * 基于jvm类加载机制，一个类只能加载一次
 */
public class Singleton {
    private static final Singleton instance = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return instance;
    }
}

/**
 * 双重检查锁
 * 线程加锁
 */
class LazySingleton{
    public static LazySingleton instance;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class){
                if (instance == null){
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}

/**
 * 静态内部类实现
 * 线程安全
 */
class LazySingleton1{

    private LazySingleton1() {

    }

    public static LazySingleton1 getInstance() {
        return InnerClass.instance;
    }

    public static class InnerClass {
        public static LazySingleton1 instance = new LazySingleton1();

    }
}

interface Factory{
    abstract String getCar();
}


/**
 * 写法简单，线程安全(推荐使用)
 */
enum LazySingleton2{
    INSTANCE;

    public void doing() {
        System.out.println("12344567677");
    }

    public String getCar() {
        System.out.println("hhhhhh");
        return "红旗轿车";
    }}

class Test{
    public static void main(String[] args) {
        LazySingleton2.INSTANCE.getCar();
    }
}
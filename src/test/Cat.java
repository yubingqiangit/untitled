package test;

/**
 * singleton 单例模式
 * 1.单例类只能有一个实例
 * 2.单例类必须自己创建自己的唯一实例
 * 3.单例类必须给其他所有对象提供这一实例
 *
 *
 */
public class Cat {
    private String name;
    private Integer age;

    private Cat cat = null;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

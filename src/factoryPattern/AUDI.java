package factoryPattern;

public class AUDI implements CreateCar {
    @Override
    public void cateteCar(int status) {
        System.out.println("奥迪汽车创建完成");
    }
}

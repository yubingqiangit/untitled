package factoryPattern;

public class BAOMA implements CreateCar {
    @Override
    public void cateteCar(int status) {
        System.out.println("宝马汽车创建完成");
    }
}

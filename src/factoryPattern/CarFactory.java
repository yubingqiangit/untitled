package factoryPattern;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {
    private static Map<Integer,CreateCar> map = new HashMap<>();
    static {
        map.put(1, new AUDI());
        map.put(2, new BAOMA());
    }

    public static CreateCar getCar(int status) {
        return map.get(status);
    }


}

import java.util.HashMap;
import java.util.Map;

public class ParkingArea {
    Map<Driver, Car> map = new HashMap<>();

    public void addCar(Driver driver, Car car) {
            map.put(driver, car);
    }
}

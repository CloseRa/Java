import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ParkingArea {
    private Map<Driver, Car> map = new HashMap<>();

    public void addCar(Driver driver, Car car) {
            map.put(driver, car);
    }
    public void delCar(){
        for(Iterator<Map.Entry<Driver, Car>> it = map.entrySet().iterator(); it.hasNext();){
            Map.Entry<Driver, Car> entry = it.next();
            if (entry.getKey().equals("John")){
                it.remove();
            }
        }
    }
    public void setMap(){
        Set<Map.Entry<Driver, Car>> set = map.entrySet();
        Iterator<Map.Entry<Driver, Car>> iterator = set.iterator();
        if (iterator.hasNext()){
            Map.Entry<Driver, Car> entry = iterator.next();
            System.out.println(entry.getKey() + "" + entry.getValue());
        }
    }
}

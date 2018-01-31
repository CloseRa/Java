
import java.util.HashMap;
import java.util.Map;

public class Start {
    public static void main(String[] args) {
        Car sportCar = new SportCar("Audi v8", 3, 777);
        Car track = new Track("Mercedes IO", 5, 896);
        Car bus = new Bus("Toyota", 7, 903);

        Driver driver1 = new Driver("Pablo", 762312);
        Driver driver2 = new Driver("John", 893021);
        Driver driver3 = new Driver("Gog", 762312);

    }
}


public class Start {
    public static void main(String[] args) {
        ParkingArea parkingArea = new ParkingArea();

        Car sportCar = new SportCar("Audi v8", 3, 777, 2);
        Car track = new Track("Mercedes IO", 5, 896, 99);
        Car bus = new Bus("Toyota", 7, 903, 40);

        Driver driver1 = new Driver("Pablo", 762312);
        Driver driver2 = new Driver("John", 893021);
        Driver driver3 = new Driver("Gog", 762312);

        parkingArea.addCar(driver1, track);
        parkingArea.addCar(driver2, sportCar);
        parkingArea.addCar(driver3, bus);

        parkingArea.removeCar(driver1, track);
    }
}

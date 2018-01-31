
public class SportCar extends Car {
    public SportCar(String name, int size, int govNumber) {
        super(name, size, govNumber);
    }
    public String getInfo(){
        String sportCarInfo = super.getInfo();
        return sportCarInfo;
    }
}

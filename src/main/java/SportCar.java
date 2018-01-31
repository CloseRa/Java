
public class SportCar extends Car {
    int cheeks;
    public SportCar(String name, int size, int govNumber, int cheeks) {
        super(name, size, govNumber);
        this.cheeks = cheeks;
    }
    public String getInfo(){
        String sportCarInfo = super.getInfo();
        return sportCarInfo;
    }
}

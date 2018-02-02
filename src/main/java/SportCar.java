
public class SportCar extends Car {
    int cheeks;
    public SportCar(String name, int size, int govNumber, int cheeks) {
        super(name, size, govNumber);
        this.cheeks = cheeks;
    }

    @Override
    public void getInfo() {
        System.out.println("Это спорткар");
    }
}

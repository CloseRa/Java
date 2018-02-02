
public abstract class Car {

    private String name;
    private int size;
    private int govNumber;

    public Car(String name, int size, int govNumber){
        this.name = name;
        this.size = size;
        this.govNumber = govNumber;
    }

    public abstract void getInfo();
}

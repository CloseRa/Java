
public class Bus extends Car {
    int passSeat;

    public Bus(String name, int size, int govNumber, int passSeat) {
        super(name, size, govNumber);
        this.passSeat = passSeat;
    }


    @Override
    public void getInfo() {
        System.out.println("Это автобус");
    }
}

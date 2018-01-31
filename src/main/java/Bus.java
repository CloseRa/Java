
public class Bus extends Car {
    int passSeat;

    public Bus(String name, int size, int govNumber, int passSeat) {
        super(name, size, govNumber);
        this.passSeat = passSeat;
    }

    public String getInfo(){
        String BusInfo = super.getInfo();
        return BusInfo;
    }
}

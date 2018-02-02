
public class Track extends Car {
    int kills;
    public Track(String name, int size, int govNumber, int kills) {
        super(name, size, govNumber);
        this.kills = kills;
    }
    @Override
    public void getInfo() {
        System.out.println("Это грузовик");
    }
}

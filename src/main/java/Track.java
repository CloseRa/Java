
public class Track extends Car {
    int kills;
    public Track(String name, int size, int govNumber, int kills) {
        super(name, size, govNumber);
        this.kills = kills;
    }
    public String getInfo(){
        String trackInfo = super.getInfo();
        return trackInfo;
    }
}

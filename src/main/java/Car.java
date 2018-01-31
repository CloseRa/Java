
public class Car {

    private String name;
    private int size;
    private int govNumber;

    public Car(String name, int size, int govNumber){
        this.name = name;
        this.size = size;
        this.govNumber = govNumber;
    }

    public String getInfo(){
        return ("Название авто - "+ name +"Размер авто - "+ size +" м."  + "Номер"+ govNumber);
    }
}

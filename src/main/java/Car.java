
public class Car {
    private String name;
    private int size;
    private int govNumber;

    public Car(String name, int size, int price){
        this.name = name;
        this.size = size;
        this.govNumber = price;
    }

    public String getInfo(){
        return ("Название авто - "+ name +"Размер авто - "+ size +" м." + "Цена авто - "+ govNumber);
    }
    public String getName(){
        return name;
    }
    public int getSize(){
        return size;
    }
    public int getGovNumber(){
        return govNumber;
    }
}

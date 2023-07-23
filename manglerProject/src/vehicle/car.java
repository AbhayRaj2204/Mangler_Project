package vehicle;

public class car {
    public String color;
    public int wheels;

    public car(){}
    public car (String color , int wheels){
        this.color = color;
        this.wheels = wheels;
    }
    public static void main(String[] args) {
        car bluecar = new car("Blue", 4);
        System.out.println(bluecar.color);
        System.out.println(bluecar.wheels);

        bluecar.startEngine();
        bluecar.stopEngine();
    }

    protected void  startEngine(){
        System.out.println("Engine Started");
    }

    protected void  stopEngine(){
        System.out.println("Engine stopped");
    }


}

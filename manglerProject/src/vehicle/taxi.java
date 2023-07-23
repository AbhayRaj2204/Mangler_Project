package vehicle;

//    1.create a field called fare (taxi charge).
//    2. create appropiate constructor to set color , field and fare .

public class taxi extends car implements vehicleHelper {
    public int fare;

    public static boolean driver;

    public taxi(int wheels, int fare, String color) {

//        To use parent class as a constructor we use super.
        super(color, wheels);
        this.fare = fare;
//        this.color = color;
//        this.fare = fare;
//        this.wheels = wheels;
    }

    public ChngeDriverValue() {
        if (driver == true){ ;
        driver = false;
    }
    else
    {
        driver = true;
    }

}

//for taxi , when engine is started , meter is also turned on .
    public static void main(String[] args) {
        taxi taxi = new taxi(4,10,"blue");
        taxi.startEngine();
        System.out.println(taxi.getFare());
        System.out.println(taxi.getFare(100));

        System.out.println(taxi.wheels);
        System.out.println(taxi.fare);
        System.out.println(taxi.color);

        taxi taxi1 = new taxi(4,10,"blue");
        taxi1.driver = true;
        System.out.println(taxi1.color);

        taxi taxi2 = new taxi(4,100,"red");
        System.out.println(taxi2.color);
        taxi2.driver = false;

        System.out.println(taxi2.driver);
        System.out.println(taxi1.driver);

    }

//      Dynamic polymorphism: The method call for an object is decided the runtime
    @Override
    protected void startEngine(){
        super.startEngine();
        System.out.println("engine started");
        System.out.println("meter turned on");
    }

    @Override
    protected void stopEngine() {
        System.out.println("meter turned off");
        System.out.println("engine stoped");

    }
    public int getNumberofWheels(){

        return 4;
    }

//    function Overloading : Function with  same name but different parameters .

    public int getFare(){
        return 20;
    }
    public int getFare(int fare){
        return fare;
    }

}









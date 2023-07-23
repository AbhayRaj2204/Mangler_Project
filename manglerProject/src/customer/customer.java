package customer;

import vehicle.car;

public class customer {

    // customer.customer cannot chnage the  number  of wheels in a vehicle.car  object.
    //make sure  that customer.customer  change  wheels.
    public static void main(String[] args) {
        car newCar = new car("Red", 4);
        System.out.println(newCar.color);


    }
}

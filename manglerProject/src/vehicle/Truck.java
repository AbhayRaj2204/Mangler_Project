package vehicle;

public class Truck implements vehicleHelper{
 public static void main(String[] args) {
       Truck truck = new Truck();
       System.out.println(truck.getNumberofWheels());
     }
       public int getNumberofWheels(){
        return 8;
      }

}
//implement VehicleHelper
//Truck should return  8 wheels
import java.util.ArrayList;
import java.util.Collections;

import vehicle.car;

public class datastructure {

    public static boolean search(ArrayList<Integer> arrayList, int targetvalue){
        for (int i=0; i<arrayList.size(); i++){
            if(arrayList.get(i)==targetvalue){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(9);
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(6);
        arrayList.add(8);

        Collections.sort(arrayList);
        Collections.reverse(arrayList);
        for(int i=0; i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }




    }


}













//    public static void main(String[] args) {
//        ArrayList<car> Car =  new ArrayList<>();
//        car car1 = new car();
//        car car2 = new car();
//        Car.add(car1);
//        Car.add(car2);


//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(1);
//        arrayList.add(10);
//        arrayList.add(3);
//        arrayList.add(100);
//        arrayList.add(7);
//
//        for(int i=0;i<arrayList.size();i++){
//            System.out.println(arrayList.get(i));





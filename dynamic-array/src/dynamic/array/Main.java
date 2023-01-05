package dynamic.array;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
       DynamicArray dynamicArray = new DynamicArray();
       
       dynamicArray.add("A");
       dynamicArray.add("B");
       dynamicArray.add("C");
       
        System.out.println(dynamicArray);
        System.out.println("size: " + dynamicArray.size);
        System.out.println("capacity: " + dynamicArray.capacity);
        System.out.println("isEmpty: " + dynamicArray.isEmpty());
    }
    
}

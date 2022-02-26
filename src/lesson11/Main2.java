package lesson11;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        long startTimeArrayAdd = System.currentTimeMillis();
        for(int i = 0; i< 100000; i++){
            arrayList.add( i + "qwffa");
        }
        long endTimeArrayAdd = System.currentTimeMillis();
        System.out.println("ArrayList add: " + (endTimeArrayAdd - startTimeArrayAdd));


        long startTimeLinkedAdd = System.currentTimeMillis();
        for(int i = 0; i< 100000; i++){
            linkedList.add( i + "qwffa");
        }
        long endTimeLinkedAdd = System.currentTimeMillis();
        System.out.println("LinkedList add: " + (endTimeLinkedAdd - startTimeLinkedAdd));


        long startTimeArrayGet = System.currentTimeMillis();
        for(int i = 0; i< 100000; i++){
            arrayList.get(i);
        }
        long endTimeArrayGet = System.currentTimeMillis();
        System.out.println("ArrayList get: " + (endTimeArrayGet - startTimeArrayGet));


        long startTimeLinkedGet = System.currentTimeMillis();
        for(int i = 0; i< 100000; i++){
            linkedList.get(i);
        }
        long endTimeLinkedGet = System.currentTimeMillis();
        System.out.println("LinkedList get: " + (endTimeLinkedGet - startTimeLinkedGet));
    }
}

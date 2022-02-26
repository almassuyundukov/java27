package lesson12.DZ12;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(4,72,5,25,74));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4,59,72,75,5,74));
        Set set = new Set(list1);
        Set set2 = new Set(list2);
        ArrayList<Integer> list3 = set.intersection(list2);
        System.out.println(list3);

        ArrayList<Integer> list4 = set.symmetricDifference(list2);
        System.out.println(list4);

        ArrayList<Integer> list5 = set2.subtract(list1);
        System.out.println(list5);

        ArrayList<Integer> list6 = set.unionWithDuplicate(list2);
        System.out.println(list6);

        ArrayList<Integer> list7 = set.union(list2);
        System.out.println(list7);
    }
}

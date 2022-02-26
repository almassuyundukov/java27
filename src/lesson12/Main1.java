package lesson12;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main1 {
    public static void main(String[] args) {
        TreeSet<Integer> nums = new TreeSet<>();
        nums.add(1);
        nums.add(23);
        nums.add(4);
        nums.add(3);
        nums.add(1);

        System.out.println(nums);
    }
}

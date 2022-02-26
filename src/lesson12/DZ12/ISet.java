package lesson12.DZ12;

import java.util.ArrayList;

public interface ISet {
    // 1) пересечение множеств
    ArrayList<Integer> intersection(ArrayList<Integer> otherSet);

    // 2) Симметричная разность
    ArrayList<Integer> symmetricDifference(ArrayList<Integer> otherSet);

    // 3) разность
    ArrayList<Integer> subtract(ArrayList<Integer> otherSet);

    // 4) объединение с дублированием
    ArrayList<Integer> unionWithDuplicate(ArrayList<Integer> otherSet);

    // 5) объединение без дублирования
    ArrayList<Integer> union(ArrayList<Integer> otherSet);
}

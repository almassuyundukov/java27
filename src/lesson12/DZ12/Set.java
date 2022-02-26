package lesson12.DZ12;

import java.util.ArrayList;

public class Set implements ISet {

    private ArrayList<Integer> firstSet;

    public Set(ArrayList<Integer> firstSet) {
        this.firstSet = firstSet;
    }

    @Override
    public ArrayList<Integer> intersection(ArrayList<Integer> otherSet) {
        ArrayList<Integer> intersectionSet = new ArrayList<>();
        for (Integer f : firstSet) {
            if (otherSet.contains(f)) {
                intersectionSet.add(f);
            }
        }
        return intersectionSet;
    }

    @Override
    public ArrayList<Integer> symmetricDifference(ArrayList<Integer> otherSet) {
        ArrayList<Integer> symmetricDifferenceSet = new ArrayList<>();
        for (Integer f : firstSet) {
            if (!otherSet.contains(f)) {
                symmetricDifferenceSet.add(f);
            }
        }

        for (Integer s : otherSet) {
            if (!firstSet.contains(s)  && !symmetricDifferenceSet.contains(s)) {
                symmetricDifferenceSet.add(s);
            }
        }
        return symmetricDifferenceSet;
    }

    @Override
    public ArrayList<Integer> subtract(ArrayList<Integer> otherSet) {
        ArrayList<Integer> subtractSet = new ArrayList<>();
        for (Integer f : firstSet) {
            if (!otherSet.contains(f)) {
                subtractSet.add(f);
            }
        }
        return subtractSet;
    }

    @Override
    public ArrayList<Integer> unionWithDuplicate(ArrayList<Integer> otherSet) {
        ArrayList<Integer> unionWithDuplicateSet = new ArrayList<>();

        for(Integer s: otherSet){
            unionWithDuplicateSet.add(s);
        }
        for (Integer f : firstSet) {
            unionWithDuplicateSet.add(f);
        }

        return unionWithDuplicateSet;
    }

    @Override
    public ArrayList<Integer> union(ArrayList<Integer> otherSet) {
        ArrayList<Integer> unionSet = new ArrayList<>();

        for(Integer s: otherSet){
            unionSet.add(s);
        }

        for(Integer f : firstSet){
            if(!unionSet.contains(f)){
                unionSet.add(f);
            }
        }
        return unionSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Set set = (Set) o;

        return firstSet != null ? firstSet.equals(set.firstSet) : set.firstSet == null;
    }

    @Override
    public int hashCode() {
        return firstSet != null ? firstSet.hashCode() : 0;
    }
}

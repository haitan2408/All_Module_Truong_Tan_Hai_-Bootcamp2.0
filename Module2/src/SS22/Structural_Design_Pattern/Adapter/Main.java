package SS22.Structural_Design_Pattern.Adapter;

import SS22.Structural_Design_Pattern.Facade_Pattern.RandomList;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(12);
        set.add(2);
        set.add(1000);
        set.add(123435345);
        set.add(1323);

    }
}

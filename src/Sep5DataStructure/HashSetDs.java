package Sep5DataStructure;

import java.util.HashSet;
import java.util.Set;

public class HashSetDs {
    public void task1(){
        Set<Integer> set = new HashSet<>();
        set.add(90);
        set.add(78);
        set.add(76);
        //Duplicate will be ignored
        set.add(76);
        System.out.println("Set before removing: " + set);
        set.remove(90);
        System.out.println("Set after removing: " + set);
        System.out.println("contains 79? " + set.contains(76));
    }
}

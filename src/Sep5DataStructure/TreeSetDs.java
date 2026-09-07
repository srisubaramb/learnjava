package Sep5DataStructure;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDs {
    public void task1(){
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(90);
        treeSet.add(5);
        treeSet.add(16);
        treeSet.add(10);
        //Sorted
        System.out.println("Sorted and Tree set: " + treeSet);
        //Removed
        treeSet.remove(10);
        System.out.println("Removing elements: " + treeSet);
    }
}

package Sep5DataStructure;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListDs2 {
    public void task1(){
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(23,24));
        list.add(90);
        //using get to access elements based on index
        System.out.print(list.get(1) + " ");
        //removing the first element
        list.removeFirst();
        System.out.println(list);
        //Removing last element
        list.removeLast();
        System.out.println(list);
        //removing by index
        list.remove(0);
        list.add(21);
        System.out.println(list);
    }
}

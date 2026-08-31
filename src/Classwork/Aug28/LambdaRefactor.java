package Classwork.Aug28;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaRefactor {
    public static void main(String[] args) {
        demoRunnable();
        demoComparator();
    }
    private  static void demoRunnable() {
        System.out.println("---Runnable--");
        Runnable before = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running an unnamed task");
            }
        };

        Runnable after = () -> {
            System.out.println("Running an unnamed task using lambda");
        };
        after.run();
    }
    private static void demoComparator(){
        System.out.println("----Comparator----");
        Comparator<String> before = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareToIgnoreCase(s2);
            }
        };
        Comparator<String> after = (String s1 , String s2) ->  s1.compareToIgnoreCase(s2);
        List<String> products = new ArrayList<>(List.of("Apple" , "Mango" , "Banana"));
        products.sort(after);
        System.out.println(products);
    }
}

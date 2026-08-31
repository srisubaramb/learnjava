package Classwork.Aug28.Streams;

import java.util.Arrays;
import java.util.List;

public class StreamPipeline {
    public static void main(String[] args) {
        List<String> source = Arrays.asList("Apple" , "Orange" , "Apricot" , "Pineapple");
        source.stream()
                .filter(furit -> furit.startsWith("A"))
                .forEach(System.out::println);
    }
}

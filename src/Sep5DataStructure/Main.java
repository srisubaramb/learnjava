package Sep5DataStructure;

public class Main {
    public static void main(String[] args) {
        //Arrays -> storing homogenous data and accessing using index
        ArrayDs arrayDs = new ArrayDs();
        arrayDs.arrayDsTask1();
        //Linked list custom ds created implemented add
        LinkedListDs linkedListDs1 = new LinkedListDs();
        linkedListDs1.task1();
        //Linked list java.util
        LinkedListDs2 linkedListDs2 = new LinkedListDs2();
        linkedListDs2.task1();
        //Stack custom ds
        StackDs stackDs1 = new StackDs();
        stackDs1.task1();
        //Stack deque java.util
        StackDs2 stackDs2 = new StackDs2();
        stackDs2.task1();
        //Queue custom ds
        QueueDs queueDs = new QueueDs();
        queueDs.task1();
        //Queue java.util
        QueueDs2 queueDs2 = new QueueDs2();
        queueDs2.task1();
        //Set hashset unordered set
        HashSetDs hashSetDs = new HashSetDs();
        hashSetDs.task1();
        //Set LinkedHashSet ordered set
        LinkedHashSetDs linkedHashSetDs = new LinkedHashSetDs();
        linkedHashSetDs.task1();
        //Set TreeSet sorted set
        TreeSetDs treeSetDs = new TreeSetDs();
        treeSetDs.task1();
        //Map storing key(unique values) and value pair Hashmap unordered map
        HashMapDs hashMapDs = new HashMapDs();
        hashMapDs.task1();
        //Map LinkedHashMap ordered map
        LinkedHashMapDs linkedHashMapDs = new LinkedHashMapDs();
        linkedHashMapDs.task1();
        //Map TreeMap sorted based on key
        TreeMapDs treeMapDs = new TreeMapDs();
        treeMapDs.task1();
        //Tree Binary Tree ds
        BinaryTreeDs binaryTreeDs = new BinaryTreeDs();
        binaryTreeDs.task1();
    }
}

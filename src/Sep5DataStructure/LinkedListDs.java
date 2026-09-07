package Sep5DataStructure;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
class LinkedList{
    Node head;

    void add(int data){
        Node newElement = new Node(data);
        if(head == null) head = newElement;
        else {
            Node currentNode = head;
            //Finding the last element
            while(currentNode.next != null) currentNode = currentNode.next;
            //adding the new element
            currentNode.next = newElement;
        }
    }
    void print(){
        if(head == null) return;
        Node currentNode = head;
        System.out.println();
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

}
public class LinkedListDs {
    public void task1(){
        Node node1 = new Node(23);
        Node node2 = new Node(34);
        node1.next = node2;
        Node node3 = new Node(89);
        node2.next = node3;

        //head is used to store where the list gonna starts
        Node head = node1;
        //While loop for listnode untill null
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        //using add
        LinkedList linkedList = new LinkedList();
        linkedList.add(67);
        linkedList.add(97);
        linkedList.print();

    }
}

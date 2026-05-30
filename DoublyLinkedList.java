package Linked_List;

public class DL {

    Node head;
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }
    public void display(){
        Node node = head;
        while(node != null){
            System.out.println(node.val + "->");
            node = node.next;
        }
        System.out.println("END");
    }
    private class Node{...}



}

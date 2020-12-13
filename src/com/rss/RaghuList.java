package com.rss;

import org.w3c.dom.Node;

public class RaghuList {

    //inner class for storing the data
    class Node{
        int data;
        Node nextNode;
        public Node(int data){
            this.data = data;
        }
    }

    Node head; //first element of the RaghuList
    Node tail; //last element of the RaghuList

    int size = 0 ; //size of the RaghuList

    public void add(int data){
        //if RaghuList is empty we have to create one new node and assign passed data to Node
        // making sure about node head & tail of RaghuList
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            tail = newNode;
        } else {
            tail.nextNode = newNode; //assign the new node to next element of the RaghuList
            tail = newNode; //refer new node as tail of RaghuList
        }
        size ++; //we have to increase RaghuList size by one whenever we add elements to RaghuList

    }

    //printing the RaghuList in an array format
    @Override
    public String toString() {
        StringBuilder buil = new StringBuilder(); //to construct Array from RaghuList elements
        buil.append("[");
        Node currentNode = head;
        while (currentNode != null){
            buil.append(currentNode.data).append(",");
            currentNode = currentNode.nextNode;
        }
        if (buil.length()>1){
            buil.deleteCharAt(buil.length()-1);
        }
        buil.append("]");
        return buil.toString();
    }

    public static void main(String[] args) {
        RaghuList lst = new RaghuList();
        lst.add(12);
        lst.add(22);
        lst.add(32);
        System.out.println(lst);
    }
}

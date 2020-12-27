package com.rss;

public class ListRaga {
    //implementing custom LinkedList as ListRaga

    public class Node{
        int data;
        Node nextNode;

        public Node(int d) {
            this.data = d;
        }
    }

    Node headNode;
    Node tailNode;
    int size = 0;

    public void addToList(int da){
        Node newNode = new Node(da);
        if (headNode == null){
            headNode = newNode;
            tailNode = newNode;
        } else {
            tailNode.nextNode = newNode;
            tailNode = newNode;
        }
        size ++;
        System.out.println(this);
    }

    public void addToList(int data, int index){
        if (index < 0 || index > (size -1)){
            System.out.println("Please provide valid index");
            return;
        }
        //we need two node elements current node element and previous node element
        //by default our current node element will be head element and previous node element will be null
        Node currentNode = headNode;
        Node previousNode = null;
        int i = 0; //for tracking specific index value we got from the parameter
        //now we need to interate the list from the head node element to final element of the list
        while (currentNode != null && i != index){
            previousNode = currentNode;
            currentNode = currentNode.nextNode;
            i++;
        }

        //lets try to insert the new node based on the passed index
        Node newNode = new Node(data);
        if (previousNode == null){
            newNode.nextNode = headNode; //new node element next node element will be current element of head node element
            headNode = newNode;
        } else {
            previousNode.nextNode = newNode;
            newNode.nextNode = currentNode;
        }
        size++;
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder build = new StringBuilder();
        build.append("[");
        Node currentNode = headNode;
        while (currentNode != null){
            build.append(currentNode.data).append(",");
            currentNode = currentNode.nextNode;
        }
        if (build.length() > 0){
            build.deleteCharAt(build.length()-1);
        }
        build.append("]");
        return build.toString();
    }

    public static void main(String[] args) {
        ListRaga lr = new ListRaga();
        lr.addToList(34);
        lr.addToList(43);
        lr.addToList(24);
        lr.addToList(13);
        lr.addToList(55, 0);
        lr.addToList(32, 4);
        //System.out.println(lr);
    }
}

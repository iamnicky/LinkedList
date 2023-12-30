package com.example.workshop;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("LINKED LIST OPERATIONS");
        LinkedList<Integer> list=new LinkedList<>();


        list.addData(12);
        list.addData(15);
        list.addData(10);
        list.addData(11);
        list.addData(13);
        list.addData(6);
        list.addData(9);
        list.addData(3);

        System.out.println("Initial list");
        list.displayList();
        System.out.println();

        System.out.println("Reverse list");
        list.reverseList();
        list.displayList();

    }
}

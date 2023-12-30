package com.example.workshop;
//Car Rental System
//Design a Java program to manage a car rental system using a HashMap<String, Boolean>, where the key is the car registration number, and the value is a boolean indicating whether the car is available or not.
//Implement methods to add a new car, rent a car, return a car, and display the list of available cars.

public class LinkedList<T extends Comparable<T>> {
    Node<T> head;

    public LinkedList() {
        this.head = null;
    }

    public void addData(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    public void displayList() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
    }
    public void reverseList(){
        Node<T> prev=null;
        Node<T> curr=head;
        Node<T> nextNode;

        while(curr!=null){
            nextNode=curr.next;

            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        head=prev;
    }
}

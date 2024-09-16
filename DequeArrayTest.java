/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dequearray;

public class DequeArrayTest {
    public static void main(String[] args) {
        DequeArray deque = new DequeArray(5);

        // Test addFront and addRear with new numbers
        deque.addRear(10);
        deque.addRear(20);
        deque.addFront(5);
        System.out.println(deque.getFront()); // 5
        System.out.println(deque.getRear());  // 20

        // Test removeFront and removeRear with new numbers
        System.out.println(deque.removeFront()); // 5
        System.out.println(deque.removeRear());  // 20

        // Test size and clear with new numbers
        deque.addRear(30);
        deque.addRear(40);
        deque.addFront(25);
        deque.addFront(15);
        System.out.println(deque.size()); // 4
        deque.clear(); //clears the deque
        System.out.println(deque.size()); // 0

        // Test rotate with new numbers
        deque.addRear(50);
        deque.addRear(60);
        deque.addRear(70);
        deque.rotate(1);   //rotate by 1
        System.out.println(deque.getFront()); // 60

        // Test peekNth with new numbers
        System.out.println(deque.peekNth(1)); // 70

        System.out.println("All tests passed, you can go to sleep!");
    }
}

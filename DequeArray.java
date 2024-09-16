/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dequearray;
public class DequeArray {
    private int[] arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public DequeArray(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }
// Time complexity must be O(1) since it's a constant-time operation....
    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
// Time complexity should be O(1) since it's a constant-time operation
    public void addFront(int item) {
        if (isFull()) {
            throw new RuntimeException("Deque is full");
        }
        front = (front - 1 + capacity) % capacity;
        arr[front] = item;
        size++;
    }

    public void addRear(int item) {
        if (isFull()) {
            throw new RuntimeException("Deque is full");
        }
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        size++;
    }

    public int removeFront() {
        if (isEmpty()) {
            throw new RuntimeException("Deque is empty");
        }
        int item = arr[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    public int removeRear() {
        if (isEmpty()) {
            throw new RuntimeException("Deque is empty");
        }
        int item = arr[rear];
        rear = (rear - 1 + capacity) % capacity;
        size--;
        return item;
    }

    public int getFront() {
        if (isEmpty()) {
            throw new RuntimeException("Deque is empty");
        }
        return arr[front];
    }

    public int getRear() {
        if (isEmpty()) {
            throw new RuntimeException("Deque is empty");
        }
        return arr[rear];
    }

    public int size() {
        return size;
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
    }

// Time complexity is O(n) since it rotates k elements by recalculating front and rear, make sure to check it again.
public void rotate(int k) {
    if (isEmpty()) {
        return;
    }
    k = k % size;
    if (k < 0) {
        k += size;
    }
    front = (front + k) % capacity;
    rear = (front + size - 1) % capacity;
}

    public int peekNth(int n) {
        if (n >= size || n < 0) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        return arr[(front + n) % capacity];
    }
}

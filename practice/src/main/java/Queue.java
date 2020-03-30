package main.java;

public class Queue {
	
	private int arrQ[];
	private int capacity, count, front, rear;
	
	Queue(int size){
		arrQ = new int[size];
		capacity = size;
		front = 0;
		rear = -1;
		count = 0;	
		
	}
	public int getSize(){
		return count;
	}
	public boolean isEmpty() {
		if(getSize() > 0)
			return false;
		else
			return true;
	}
	public boolean isFull() {
		if(getSize() == capacity)
			return true;
		else
			return false;
	}
	public void enqueue(int data) {
		if(isEmpty())
			arrQ[0] = data;
		if (isFull())
			return;
		rear = (rear + 1) % capacity;
		arrQ[rear] = data;
		count ++;
	}
	public int dequeue() {
		if(isEmpty())
			return 0;
		front = (front + 1) % capacity;
		count--;
		return arrQ[front];
	}
}

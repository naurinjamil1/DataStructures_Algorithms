package main.java;

public class QueueList {
	
	private Node front, rear;
	private int count, size;
	
	public class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next = null;
		}	
	}
	
	QueueList(int qSize){
		front = null;
		rear = null;
		size = qSize;
	}
	
	public boolean isEmpty() {
		if (count == 0)
			return true;
		else
			return false;
	}
	
	public boolean isFull() {
		if (count == size)
			return true;
		else
			return false;
	}
	
	public void enqueue(int d) {
		Node oldRear = rear;
		Node rear = new Node(d);
		rear.next = null;
		
		if(isEmpty()) {
			front = rear;
		} else {
			oldRear.next = rear;
			count ++;
		}
	}
	public int dequeue() {
		if(isEmpty())
			rear = null ;
		if(front == rear) {
			front = rear = null;
		}
		else {
			front = front.next;
			count --;
			
		}
		return front.data;
	}
	
	public void printQList(QueueList qlist) {
		if(qlist.front == null && qlist.rear == null)
			System.out.println("Empty !!");
		else if(qlist.front == qlist.rear)
			System.out.println("One element : " + qlist.front.data);
		while(qlist.front != null) {
			System.out.println(qlist.front.data);
			qlist.front = qlist.front.next;
		}
	}
}

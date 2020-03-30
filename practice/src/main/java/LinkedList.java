package main.java;

public class LinkedList {

	Node head;

	static class Node
	{
		int data;
		Node next;

		Node(int d){
			data = d;
			next = null;
		}

	}

	public static LinkedList insert(int data, LinkedList list) {

		Node newNode = new Node(data);
		if(list.head == null) {
			list.head = newNode;
		}		
		else
		{
			Node last = list.head;
			while(last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}
		return list;
	}

	public static void printList(LinkedList list) {

		Node currentNode = list.head;
		System.out.println("LinkedList : ");
		if (currentNode == null) {
			return;
		}
		else {
			while(currentNode != null)
			{
				System.out.println(currentNode.data);
				currentNode = currentNode.next;					
			}
		}
	}

	public static LinkedList deleteByKey(LinkedList list, int dataSearched) {

		Node currentNode = list.head;
		Node previous = null;
		
		if(currentNode != null && currentNode.data == dataSearched) {
			list.head = currentNode.next;			
		}
		while(currentNode != null && currentNode.data != dataSearched) {
			previous = currentNode;
			currentNode = currentNode.next;
		}
		if(currentNode != null) {
			previous.next = currentNode.next;
		}
		else {
			System.out.println("Not found !! ");
		}

		return list;
	}
	
	public static LinkedList deleteByPosition(LinkedList list, int position) {
		
		Node currentNode = list.head;
		Node previous = null;
		if(position == 0 && currentNode != null) {
			list.head = currentNode.next;
		}
		int count = 0;
		while(currentNode != null) {
			if(count == position) {
				previous.next = currentNode.next;
			}
			else {
				count ++;
				previous = currentNode;
				currentNode = currentNode.next;
				
			}
		}
		if(currentNode == null)
			System.out.println("Not Found !!");
		return list;
			
	}
	
	public static LinkedList reverseList(LinkedList list) {
		Node previous = null;
		Node next;
		Node current = list.head;
		while(current != null) {
			next = current.next;
			// reversing link
			current.next = previous;
			// moving by 1
			previous = current;
			current = next;
			list.head = previous;
		}
		return list;
	}
}

package main.java;

import java.util.List;
import java.util.*;


public class Main {

	// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
	public List<Integer> cellCompete(int[] states, int days)
	{
		// WRITE YOUR CODE HERE
		int d = 0;
		while(d <= days){
			for(int i=0; i < states.length; i++){
				if(states[i-1] == states[i+1]){
					if(states[i] == 1)
						states[i] = 0;
					else
						states[i] = 1;
				}
			}
			d++;
		}
		List<Integer> listStates = new ArrayList<Integer>();
		for (int state: states) {
			listStates.add(state);
		}
		return listStates; 

	}
	 public static int generalizedGCD(int[] arr){
		 int result = arr[0];
		 for(int i = 1; i < arr.length; i++) {
			 
			 result = calcGCD(arr[i], result);
			 if(result == 1) {
				 return 1;
			 }
		 }
			 return result;
		 }
	  
	 private static int calcGCD(int a, int b) {
		 if(a == 0) {
			 return b;
		 }
		 return calcGCD(b%a, a);
	 }
    

	public static void main(String[] args) {

		System.out.println("Hello Data Structures !!"); 
		Arrays array = new Arrays();
		array.setCountries(); 
		array.getCountries(); 
		array.modifyCountry("USA");


		/*
		 * Operations operation = new Operations(); long factorial =
		 * operation.getFactorial(5); System.out.println("Factorial : " + factorial);
		 * operation.getFibonacciSequence(1, 2, 20);
		 */
		/*
		 * LinkedList list = new LinkedList(); list = LinkedList.insert(100, list); list
		 * = LinkedList.insert(200, list); list = LinkedList.insert(300, list); list =
		 * LinkedList.insert(400, list); list = LinkedList.insert(900, list); list =
		 * LinkedList.insert(40000, list); list = LinkedList.insert(874400, list); list
		 * = LinkedList.insert(1100, list); System.out.println("ORIGINAL : ");
		 * LinkedList.printList(list); LinkedList.deleteByKey(list, 500);
		 * LinkedList.deleteByKey(list, 300); LinkedList.printList(list);
		 * LinkedList.deleteByPosition(list, 2); LinkedList.printList(list);
		 * 
		 * 
		 * 
		 * System.out.println("REVERSING : "); LinkedList reversedList =
		 * LinkedList.reverseList(list); LinkedList.printList(reversedList); QueueList
		 * qList = new QueueList(10); qList.enqueue(10); qList.enqueue(20);
		 * qList.enqueue(30); System.out.println("Queue List : ");
		 * qList.printQList(qList);
		 */
		BinarySearch binarySrch = new BinarySearch();
		int arr[] = {22, 35, 79, 89, 110};
		int foundAt = binarySrch.performBinarySearch(arr, 0, arr.length - 1, 79);
		System.out.println("Element found at : " + foundAt);
		int notfoundAt = binarySrch.performBinarySearch(arr, 0, arr.length - 1, 44);
		System.out.println("Element found at : " + notfoundAt);

		int arr2[] = {100, 23, 89, 99, 20, 10, -1};
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(arr2, 0, 6);
		mergeSort.printArray(arr2);
		int arr3[] = {2, 4, 6, 9};
		//System.out.println(generalizedGCD(arr3));
		
		// PROBLEMS :
		Problems.printKLargest(arr2, 4);
		SpecialStack stackobj = new SpecialStack();
		stackobj.push(10);
		stackobj.push(20);
		stackobj.push(30);
		
		Problems.nextLargerElement(arr2, 7);


	}
}

package main.java;
import java.util.Arrays;


public class Problems {

	static void printKLargest(int arr[], int k) {
		
		Arrays.sort(arr);
		reverse(arr);
		for(int i = 0; i < k; i++) {
			System.out.println(arr[i]);
		}		
	}
	// reverse in place
	private static void reverse(int arr[]) {
		int last = arr.length - 1;
		int mid = arr.length/2;
		for(int i = 0; i<= mid; i++) {
			int temp = arr[i];
			arr[i] = arr[last - i];
			arr[last - i] = temp;
		}
	}
	
	static void reverseLinkedList(LinkedList list, int k) {
		list.reverseList(list);
	}
	
	public static void nextLargerElement(int arr[], int N) {		
		for(int i = 0; i < N; i++) {
			for(int j = i+1; j < N-1; j++) {
				if(arr[i] < arr[j]) {
					System.out.println("Element is : " + arr[i]);
					System.out.println("Larger is : " + arr[j]);
					break;
				}
			}
		}
	}
}

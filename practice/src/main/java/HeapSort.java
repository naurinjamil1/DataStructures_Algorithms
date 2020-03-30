package main.java;

public class HeapSort {
	
	public void sort(int arr[]) {
		
		int n = arr.length;
		// build heap from the array
		for(int i = n/2 - 1; i >= 0; i--)
			heapify(arr, n, i);
		
		// one by one extract each element from the heap
		for(int i = n-1; i >= 0; i--) {
			
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			heapify(arr, i , 0);
		}		
	}
	// heapify a subtree with root node i 
	// where i is an index in the array
	// n is the heap size
	void heapify(int arr[], int n, int i) {
		
		int largest = i;
		int left    = 2*i + 1;
		int right   = 2*i + 2;
		// construct heap for this subtree
		if(left < n  && arr[left] > arr[largest]) {
			largest = left;
		}
		if(right < n && arr[right] > arr[largest]) {
			right = largest;
		}
		if(largest != i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = arr[i];
			
			// recursively heapify the affected sub tree
			heapify(arr, n, largest);
		}			
	}
}

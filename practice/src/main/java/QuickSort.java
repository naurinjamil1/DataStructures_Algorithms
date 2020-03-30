package main.java;

public class QuickSort {
	// preferred for Arrays	
	public void sort(int arr[], int left, int right) {
		if(left < right) {
			
			int part = partition(arr, left, right);
			sort(arr, left, part - 1);
			sort(arr, part + 1, right);
		}
	}
	 /* This function takes last element as pivot, 
    places the pivot element at its correct 
    position in sorted array, and places all 
    smaller (smaller than pivot) to left of 
    pivot and all greater elements to right 
    of pivot */
	private int partition(int arr[], int left, int right) {
		int pivot = arr[right];
		int i = left - 1; // consider this as the index of the smaller element
		for(int j = 0; j<right; j++) {
			if(arr[j] < pivot) {
				i++;
				// swap arr[i] and arr[j]
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[right];
		arr[right] = temp;
		return i + 1;
	}

}

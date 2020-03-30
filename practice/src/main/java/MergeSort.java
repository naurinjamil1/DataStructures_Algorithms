package main.java;

public class MergeSort {
	
	// preferred for Linked Lists
	public void sort(int arr[], int left, int right) {
		
		if(left < right) {
			int mid = left +(right - left)/2;
			
			sort(arr, left, mid);
			sort(arr, mid+1, right);
			merge(arr, left, mid, right);
		}
	}
	
	private void merge(int arr[], int left, int mid, int right) {
		
		int n1 = mid - left + 1;
		int n2 = right - mid;
		
		int leftArr[] = new int[n1];
		int rightArr[] = new int[n2];
		
		for(int i =0; i<n1; i++) {
			leftArr[i] = arr[left + i];			
		}
		for(int j =0; j<n2; j++) {
			rightArr[j] = arr[mid + 1 +j];
		}
		// now merge 
		int i = 0, j = 0;
		int k = left;
		while(i < n1 && j < n2) {
			
			if(leftArr[i] < rightArr[j]) {
				arr[k] = leftArr[i];
				i++;
			}else {
				arr[k] = rightArr[j];
				j++;
			}			
			k++;			
		}
		// take care of remaining elements
		while(i < n1) {
			arr[k] = leftArr[i];
			k++;
			i++;
		}
		while(j < n2) {
			arr[k] = rightArr[j];
			k++;
			j++;
		}
	}	
	void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i] + "");
		}
		System.out.println();
	}
}

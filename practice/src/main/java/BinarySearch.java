package main.java;

public class BinarySearch {
	
	int performBinarySearch(int arr[], int left, int right, int search) {
		
		if(right >= left) {
			int mid = left + (right - left)/2;
			
			if(arr[mid] == search) {
				return mid;
			}else {
				if(search < arr[mid]) {
					return performBinarySearch(arr, left, mid-1, search);
				}else {
					return performBinarySearch(arr, mid+1, right, search);
				}
			}
		}
		return -1;
	}
}

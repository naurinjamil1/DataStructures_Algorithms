package main.java;

public class Sorting {
	
	public void selectionSort(int[] array, int length ) {
		
		for(int i=0; i<length-1; i++) {
			int iMin = i;
			for(int j = 0; j<length; j++) {
				if(array[j] < array[iMin]) {
					iMin = j;
				}
			}
			int temp = array[i];
			array[i] = array[iMin];
			array[iMin] = temp;
			
		}
	}

}

package com.gj.algos;

public class Quicksort {

	public static void main(String[] args) {
		int [] arr= {7,12,35,1,29,14};
		for (int i : arr) {
			System.out.print(i +",");
		}
		System.out.println("-----");
		quickSort(arr,arr.length-1,0,arr.length-1);
        
	}

	public static void quickSort(int [] array,int pivotPos, int low, int high) {

		if(low<high) {
	int i=low;
	
	while(i<=pivotPos) {
			if (array[i] > array[pivotPos]) {
				// swap
				if(pivotPos-i==1) {
					int temp = array[pivotPos];
					array[pivotPos] = array[i];
					array[i] = temp;
				}else {
				int temp = array[pivotPos - 1];
				array[pivotPos - 1] = array[pivotPos];
				array[pivotPos] = array[i];
				array[i] = temp;
				pivotPos = pivotPos - 1;
				i = low;
                continue;
				}
			}
			i++;
	}
	
	quickSort(array, pivotPos - 1, 0, pivotPos);
	quickSort(array, high - 1, pivotPos+1, high);
		}
		
	System.out.println();
	for (int i : array) {
		System.out.print(i +",");
	}
		
	}

}

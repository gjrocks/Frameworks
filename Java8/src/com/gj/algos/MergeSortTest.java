package com.gj.algos;

public class MergeSortTest {

	public static void main(String[] args) {
		int [] arr= {45,7,12,35};
		printArray(arr);
		
		mergeSort(arr,0,arr.length);
        

	}

	private static void mergeSort(int[] arr, int st, int en) {
		
		
		if(en-st<2) {
			return;
		}
			int mid=(en-st)/2;
			int start=st;
			int end=en;
			mergeSort(arr, st, mid);
			mergeSort(arr,mid+1,en);
			merge(arr,mid,start,end);
		
		
		
	}
	
	private static void merge(int[] arr, int middle, int start, int end) {
		
		int[] firstPart=new int[middle-start];
		int[]  secondPart=new int[end-middle];
		
		//copy the items
		int j=0;
		for(int i=start;i<middle;i++) {
		firstPart[j]=arr[i];
		j++;
		}
       printArray(firstPart);
		j=0;
		for(int i=middle;i<end;i++) {
		secondPart[j]=arr[i];
		j++;
		}
		printArray(secondPart);
		
		int arrIndex=start;
		int i=0,k=0;
				
				while(i<firstPart.length && k<secondPart.length) {
			
			if(firstPart[i]<=secondPart[k]) {
				arr[arrIndex]=firstPart[i];
				i++;
				
			}else {
				arr[arrIndex]=secondPart[k];
				k++;
			}
			arrIndex++;
			
		}
		
		while(i<firstPart.length) {
			arr[arrIndex]=firstPart[i];
			i++;
			arrIndex++;
		}
		
		while(k<secondPart.length) {
			arr[arrIndex]=secondPart[k];
			k++;
			arrIndex++;
		}
		printArray(arr);
		
	}

	private static void printArray(int[] arr) {
		System.out.println("---------------");
		for (int i : arr) {
			System.out.print(i +",");
		}
		System.out.println("");
	}
}

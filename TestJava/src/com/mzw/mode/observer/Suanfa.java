package com.mzw.mode.observer;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Suanfa {
	
	public static void main(String[] args) {
		int[] arr = new int[] {3,5,7,8,9,5,1,2,6};
		System.out.println(arr.length);
		int a = arr.length;
//		kuaisu(arr,0,a-1);
//		maopao(arr);
//		charu(arr);
		xuanze(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void maopao(int[] arr) {
		int swag = 0;
		for(int i = 0;i<arr.length-1;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					swag = arr[i];
					arr[i] = arr[j];
					arr[j] = swag;
				}
			}
		} 
		for(int x = 0;x<arr.length;x++) {
			System.out.println(arr[x]);
		}
	}
	
	public static void kuaisu(int[] arr,int start,int end) {
		if(start<end) {
		int stard = arr[start];
		int low = start;
		int high = end;
		while(low<high) {
			while(low<high&&arr[high]>=stard) {
				high--;
			}
			arr[low] = arr[high];
			while(low<high&&arr[low]<=stard) {
				low++;
			}
			arr[high] = arr[low];
		}
		arr[low] = stard;
		kuaisu(arr,start,low);
		kuaisu(arr,low+1,end);
		}
	}
	public static void charu(int[] arr) {
		for(int i = 1;i<arr.length;i++) {
			if(arr[i]<arr[i-1]) {
				int temp = arr[i];
				int j = 0;
				for(j = i-1;j>=0&&arr[j]>temp;j--) {
					arr[j+1] = arr[j];
				}
				arr[j+1] = temp;
		}
	}
}
	public static void xuanze(int[] arr) {
		for(int i = 0;i<arr.length -1;i++) {
			int min = i;
			int swap = 0;
			for(int j = i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			if(min!=i) {
				swap = arr[i];
				arr[i] = arr[min];
				arr[min] = swap;
			}
		}
	}
}
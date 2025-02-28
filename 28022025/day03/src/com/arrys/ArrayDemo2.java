package com.arrys;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

public class ArrayDemo2 {
	
	static List<Integer> findDuplicates(int arr[]){
		List<Integer> res = new ArrayList<>();
		for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                  
                    if (!res.contains(arr[i])) {
                        res.add(arr[i]);
                    }
                    break; 
                }
            }
        }

        return res;
		
	}
	public static void main(String[] args) {
//		Integer[] arr = {15, 22, 3, 43, 3 , 25, 6};
//		System.out.print("Before sorting the array: ");
//		for(int it:arr) {
//			System.out.print(it+" ");
//		}
//		System.out.println();
//		Arrays.sort(arr);
//		System.out.print("After sorting arrays: ");
//		for(int it:arr) {
//			System.out.print(it+" ");
//		}
//		System.out.println();
//		//arrays to list
//		List<Integer> list=Arrays.asList(arr);
//		System.out.println(Arrays.binarySearch(arr, 25));
//		
//		System.out.println();
//		System.out.print("After arrays to list arrays: ");
//		for(int it:arr) {
//			System.out.print(it+" ");
//		}
		int[] arr = {15, 22, 3, 43, 3 , 25, 6};
		List<Integer> duplicates = findDuplicates(arr);
		for(int x:duplicates) {
			System.out.println(x+ " ");
		}
	}
}

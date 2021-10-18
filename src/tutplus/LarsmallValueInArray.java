package tutplus;

import java.util.Arrays;

public class LarsmallValueInArray {

	public static void main(String[] args) {
		int[] arr = {2,4,3,12,64,421,43};
		
		int largestValue = arr[0];
		int smallestValue = arr[0];
		
		for(int i =1; i<arr.length; i++) {
			if(arr[i] > largestValue) {
				largestValue = arr[i];
			} else if(arr[i] < smallestValue) {
				smallestValue = arr[i];
			}
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("largest value is :" + largestValue);
		System.out.println("largest value is :" + smallestValue);
		 
	}

}

package tutplus;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatedArray {

	public static void main(String[] args) {
		int[] arr = {3,2,1,4,2,1,3};
		
//		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=i+1; j<arr.length; j++) {
//				if(arr[i] == arr[j]) {
//					count++;
//				}
//				
//				
//			}
//		}

		
		//First non-repeating element
//		for(int i = 0; i< arr.length; i++) {
//			for(int j=0; j<= arr.length; j++) {
//				if(j == arr.length) {
//					System.out.println("first non repeating element is: " + arr[i]);
//					return;
//				}
//				if(j != i && arr[i] == arr[j]) {
//					break;
//				}
//			}
//		}
//		
//		System.out.println("all the elements are repeating");
//	}

	 //First non-repeating with hashmap
	
	Map<Integer, Integer> map = new HashMap<>();
	
	for(int i=0; i<arr.length; i++) {
		Integer freq = map.get(arr[i]);
		map.put(arr[i], (freq == null) ? 1 : freq + 1);
	}
	
	for(int i=0; i<arr.length; i++) {
		if(map.get(arr[i]) == 1) {
			System.out.println("First non repeat element is: "+ arr[i]);
			return;
		}
	}
	
	}
}

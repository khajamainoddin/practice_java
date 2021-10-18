package tutplus;

public class SecondHighNoArray {

	public static void main(String[] args) {
		int[] arr = {44,333,553,522,43,44,22};
		int highest = 0;
		int second_highest = 0;
		for(int i=0; i< arr.length; i++) {
			if(highest < arr[i]) {
				second_highest = highest;
				highest = arr[i];
			} else if(second_highest < arr[i]) {
				second_highest = arr[i];
			}
		}
		
		System.out.println("second highest : " + second_highest);

	}

}

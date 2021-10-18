package tutplus;

import java.util.Arrays;

public class ArrayFix23 {

	public static void main(String[] args) {
		
		int[] nums = {2,3,5};
		fix23(nums);
		System.out.println("array value is: " + Arrays.toString(nums));
	}

	public static int[] fix23(int[] nums) {
		if(nums[0] == 2 && nums[1] == 3) {
			nums[1] = 0;
		} else if(nums[1] == 2 && nums[2] == 3) {
			nums[2] = 0;
		}
		//System.out.println("value is "+ nums);
		return nums;
		
	}
	
}

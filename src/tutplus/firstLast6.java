package tutplus;

import java.util.Arrays;

public class firstLast6 {

	public static void main(String[] args) {
		int[] nums = {6,52,6,63};
		firstlast6(nums);
      
	}
	
	public static boolean firstlast6(int[] nums) {
		if(nums[0] == 6 || nums[nums.length-1] == 6) {
			System.out.println(true);
			return true;
		} else {
			System.out.println(false);
		return false;
		}
	}

}

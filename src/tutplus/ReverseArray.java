package tutplus;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arry = {21,2,1,3,4,5};
		
		String str = arry.toString();
		System.out.println("string value" + str);
		for(int i=arry.length-1; i>=0; i--) {
			System.out.println("reverse no: "+ arry[i]);
		}
	
 
	}

}

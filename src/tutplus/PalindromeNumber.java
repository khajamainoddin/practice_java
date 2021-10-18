package tutplus;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num=153,a,c=0,temp;
		temp=num;
		while(num>0) {
			a = num%10;
			num = num/10;
			c = c+(a*a*a);
		}
		
		if(temp==c) {
			System.out.println("it is a palindrome number");
		} else {
			System.out.println("it is not a palindrome number");
		}

	}

}

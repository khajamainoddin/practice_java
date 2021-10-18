package tutplus;

public class ArmStrongNum {

	public static void main(String[] args) {
		int num = 153,temp,c = 0,a;
		temp = num;
		while(num>0) {
			a = num%10;
			num = num/10;
			c=c+(a*a*a);
		}
		if(temp==c) {
			System.out.println("it is armstrong number");
		} else { 
			System.out.println("it is not armstrong number");
		}
	}

}

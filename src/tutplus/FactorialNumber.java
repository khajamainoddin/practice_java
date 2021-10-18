package tutplus;

public class FactorialNumber {

	public static void main(String[] args) {
        
		int n=6,fact=1;
        for(int i =1; i<=n; i++) {
        	fact = fact * i;
        }
        
        System.out.println("Factorial of" + " n " + " is: "+fact);
	}

}

package tutplus;

public class FibnosiSeries {

	public static void main(String[] args) {
		int num=6,n1,n2=0,n3=1;
		for(int i=1; i<=num; i++) {
			
			n1 = n2;
			n2 = n3;
			n3 = n1+n2;
			System.out.println(" "+n3+" ");
		}
		
		

	}

}

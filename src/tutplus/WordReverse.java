package tutplus;

public class WordReverse {

	public static void main(String[] args) {
        String nameword = "khaja mainoddin";
		
        String[] name = nameword.split("\\s");
		String rev = "";
		
		
		for(int i = name.length-1; i>=0; i--) {
			rev = rev + " " + name[i];
			
			
		}
		
		System.out.println("Reverse string "+ rev);
	}

}



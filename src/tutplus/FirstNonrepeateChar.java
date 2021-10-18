package tutplus;


import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonrepeateChar {

	public static void main(String[] args) {
		String bank = "swiss";
		
		char[] ch = bank.toCharArray();
		int count = 1;
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < ch.length; i++) {
			if(map.containsKey(ch[i])) {
				map.put(ch[i], map.get(ch[i])+1);
			} else {
				map.put(ch[i], count);
			}
		}
		
		for(Character x:map.keySet()) {
			if(map.get(x) == 1) {
				System.out.println("non repeative character in the word: " + x);
			}
		}

	}

}

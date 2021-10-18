package tutplus;

import java.util.HashMap;
import java.util.Map;

public class DuplicateChar {

	public static void main(String[] args) {
		String str = "khajamainoddin";

		char[] ch = str.toCharArray();

		int count = 1;

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < ch.length; i++) {
			if (!map.containsKey(ch[i])) {
				map.put(ch[i], count);
			} else {
				map.put(ch[i], map.get(ch[i]) + 1);
			}
		}

		for (Character x : map.keySet()) {
			if (map.get(x) > 1) {
				System.out.println("Duplicate char count:" + x + " repeated " + map.get(x)+ " times");
			}

		}

	}

}

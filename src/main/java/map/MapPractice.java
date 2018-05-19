package map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//git commit test
		Map<Character, Integer> mp=new LinkedHashMap<Character,Integer>();
		String st="I will win the Interview";
		char[] stChar=st.toCharArray();
		for (char stc: stChar) {
			if (mp.containsKey(stc)) {
				mp.put(stc, mp.get(stc)+1);
			}
			else {
				mp.put(stc, 1);
			}	
		}
		for (Entry<Character, Integer> c : mp.entrySet()) {
			System.out.println(c);
		}
	}
}

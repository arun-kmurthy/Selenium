package map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapSort {

	public static void main(String[] args) {
		// 
		Map<Integer,String > unsorted=new LinkedHashMap<Integer,String>();
		unsorted.put(21, "Twenty One");
		unsorted.put(41, "Forty One");
		unsorted.put(31, "Thirty One");
		for (Entry <Integer,String> mp:unsorted.entrySet()) {

			System.out.println("The Unsorted Map is: "+mp.getKey()+" "+mp.getValue());
		}
		Map <Integer,String> sorted=new TreeMap<Integer,String>(unsorted);
		sorted.putAll(unsorted);

		for (Entry <Integer,String> mp:sorted.entrySet()) {

			System.out.println("The sorted Map is: "+mp.getKey()+" "+mp.getValue());
		}
	}
}

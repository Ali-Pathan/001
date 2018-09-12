package datastructure;

import java.util.LinkedHashMap;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		Map<String, String> CountryList = new LinkedHashMap<String, String>();
		CountryList.put("USA", "NY");
		CountryList.put("UK", "London");
		CountryList.put("bangladesh", "Dhaka");

		for(Map.Entry<String, String> state:CountryList.entrySet()){
			System.out.println(" Main city of " + state.getKey() + " = " + state.getValue());
		}
	}
}

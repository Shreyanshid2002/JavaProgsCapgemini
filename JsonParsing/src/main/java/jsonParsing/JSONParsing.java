package jsonParsing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONParsing {
	public static void main(String[] args) throws Exception{
		Map<Integer,List<String>> map = new HashMap();
		List<String> list = Arrays.asList("Hello","World","Demo");
		map.put(1, list);   // { "1" :["Hello","World","Demo", \n "2":[same as above]
		map.put(2, list);
		ObjectMapper om = new ObjectMapper();
		
		//Using value to tree
//		JsonNode node = om.valueToTree(map);
//		Iterator<String> fieldNames = node.fieldNames();
//		while(fieldNames.hasNext()) {
//			String key = fieldNames.next();
//			JsonNode list1 = node.get(key);
//			System.out.println("Key: "+key);
//			for(JsonNode json : list1) {
//				System.out.println(json.asText());
//			}
//			System.out.println("-------------------------------------------------------------------");
//		}
		
//	    Using readNode ----> 
		String data = om.writeValueAsString(map);
		JsonNode tree = om.readTree(data);
		Iterator<String> itr = tree.fieldNames();
		while(itr.hasNext()) {
			String key = itr.next();
			JsonNode value = tree.get(key);
			System.out.println("Key: "+key);
			for(JsonNode json : value) {
				System.out.println(json.asText());
				System.out.println("--------------------------------------------");
			}
		}
		System.out.println(data);
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println(tree.get("1"));
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println(tree.get("2"));
		
	}
}

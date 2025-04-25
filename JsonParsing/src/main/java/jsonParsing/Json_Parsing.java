package jsonParsing;

public class Json_Parsing {
	public static void main(String[] args) {
		String json = "{\"name\":\"Shreyanshi\",\"age\":22}"; //cannot use " " within another " " so we use \ before a "
		String parsed = json.replace("{", "").replace("}", "");
		String[] arr = parsed.split(",");
		
		for(String s : arr) {
			String[] keyValue = s.split(":");
			String key = keyValue[0].replace("\"", "").trim();
			String value = keyValue[1].replace("\"", "").trim();
			
			System.out.println(key+" => "+value);
		}
		String multiline = """
			{
					"name" : "Shreyanshi",
					"age" : "22"
			}
		""";
	}
}

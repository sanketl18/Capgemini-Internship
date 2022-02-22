package lambda_Assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class Q7Lambda {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("San", 42);
		map.put("Sum", 21);
		map.put("Sal", 45);

		Q7Lambda assignment8Q7 = new Q7Lambda();
		assignment8Q7.convertKeyValueToString(map);

	}

	public String convertKeyValueToString(HashMap<String, Integer> map) {

		StringBuilder str = new StringBuilder();
		Consumer<Map.Entry> consumer = (p) -> str.append(p.getKey()).append(p.getValue());
		Set set = map.entrySet();
		set.stream().forEach(consumer);

		System.out.println(str);
		return str.toString();

	}
}
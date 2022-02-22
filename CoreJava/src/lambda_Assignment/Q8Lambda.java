package lambda_Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Q8Lambda {

	private static void method1(List<Integer> number, Consumer consumer) {
		for (Integer i : number) {
			consumer.accept(i);
		}
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		Thread t = new Thread(() -> method1(list, (p) -> System.out.println(p)));
		t.run();

	}

}

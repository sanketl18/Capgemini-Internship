package lambda_Assignment;

import java.util.ArrayList;

public class Q4lambda {
	public ArrayList<String> removeOddLength(ArrayList<String> employeeList) {
		employeeList.removeIf(n -> (n.length() % 2 != 0));
		return employeeList;

	}

	public static void main(String[] args) {
		Q4lambda A1 = new Q4lambda();
		ArrayList<String> AL = new ArrayList<>();
		AL.add("Sanket");
		AL.add("Sumit");
		AL.add("Yash");
		AL.add("Sujal");
		AL.add("Suraj");

		System.out.println(A1.removeOddLength(AL));

	}
}

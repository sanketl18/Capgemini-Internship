package java11assignment;

public class Q1java11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Function Simple_interest=(var p,var r, var t)-> (p*r*t)/100;
System.out.println("Simple Interest="+Simple_interest.SI(10000, 5, 4));
	}

}
interface Function{
	int SI(int principal,int rate,int time);
}
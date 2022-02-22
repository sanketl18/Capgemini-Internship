package lambda_Assignment;
public class Q1lambda{
	public double Addition(int num1,int num2) {
	function add=(n1,n2)->n1+n2;
	return add.operation(13, 5);
	}
	public double Subtraction(int num1,int num2) {
		function sub=(n1,n2)->n1-n2;
		return sub.operation(13, 5);
	}
	public double Multiplication(int num1,int num2) {
		function mul=(n1,n2)->n1*n2;
		return mul.operation(num1, num2);
	}
	public double division(int num1,int num2) {
		function div=(n1,n2)->n1/n2;
		return div.operation(13, 5);
	}
	public static void main(String[] args) {
		Q1lambda a1=new Q1lambda();
		System.out.println(a1.Addition(13, 5));
		System.out.println(a1.Subtraction(13, 5));
		System.out.println(a1.Multiplication(13, 5));
		System.out.println(a1.division(13, 5));
	}
}
interface function
{
	public double operation(int a,int b);
		
	
}
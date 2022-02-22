package inter.oops.assign;
abstract /*final*/ /*static*/ class AbstDemo
{
	abstract void demo();	
}
class child extends AbstDemo
{
	void demo()
	{
		System.out.println("abstract method");
	}
abstract class absclass
{void display()
	{
	System.out.println("display");
	}
	
}
}
public class Q4assign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//AbstDemo a1=new Abstdemo();
		AbstDemo a1=new child();
		a1.demo();
	}

}

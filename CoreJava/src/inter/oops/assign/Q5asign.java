package inter.oops.assign;
abstract class shape
{
	abstract  public String draw();
}
class line extends shape
{public String draw()
	{String a="requires on line";
	return a;
	}	
}
class rectangle extends shape
{public String draw()
	{String a="requires four rays to draw rectangle";
	return a;
	}	
}
class cube extends shape
{public String draw()
	{String a="requires 12 rays to draw rectangle";
	return a;
	}
	
}
public class Q5asign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
shape s1;
s1= new line();
String q=s1.draw();
System.out.println(q);
s1=new rectangle();
String r=s1.draw();
System.out.println(r);
s1=new cube();
String d=s1.draw();
System.out.println(d);
	}

}

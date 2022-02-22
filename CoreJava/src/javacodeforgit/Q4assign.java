package javacodeforgit;
import java.util.Scanner;
public class Q4assign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter 1st subject marks");
int a=s.nextInt();
System.out.println("Enter 2nd subject marks");
int b=s.nextInt();
System.out.println("Enter 3rd subject marks");
int c=s.nextInt();
if(a+b+c>=60 && a<60 && b<60 &&c<60  )
{
	System.out.println("passed");
}
if((a+b>60||b+c>60||a+c>60) && (a<60 && b<60 &&c<60) )
{
	System.out.println("promoted");
}
else if(a>60||b>60||c>60 )
{
	System.out.println("failed");
}
else if( a+b+c<60)
{
	System.out.println("failed");
}
	}

}

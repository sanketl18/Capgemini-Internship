package javacodeforgit;
import java.util.*;
import java.lang.Math;
public class Q1ASSignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter a number");
Scanner s=new Scanner(System.in);
int n=s.nextInt();
s.close();
int temp=n,r,as=0,digit=0;
while(n>0)
{
	n=n/10;
	digit=digit+1;
}

n=temp;
while(n>0)
{r=n%10;
double a=Math.pow(r, digit);
int b=(int)a;
as=as+b;
n=n/10;
}
if(temp==as)
{System.out.println("Armstrong");
	
}
else
{
	System.out.println("not armstrong");
}	
}

}

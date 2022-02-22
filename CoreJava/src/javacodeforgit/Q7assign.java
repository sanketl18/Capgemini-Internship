package javacodeforgit;
import java.util.*;
public class Q7assign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println("enter a number to search");
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a=0;
int arr[]= { 5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
for(int i=0;i<arr.length;i++)
{ if(arr[i]==n)
{  a=a+1;
	break;
}
}
if(a==1)
{
	System.out.println("number is present in array");
}
else
{
	System.out.println("number is not present in array");
}
	}

}

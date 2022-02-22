package javacodeforgit;
import java.util.*;
public class Q8assign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a[]=new int [5];
System.out.println("Enter array elements");
for(int i=0;i<5;i++)
{
	a[i]=s.nextInt();
}
for(int j=0;j<5;j++)
{
	for(int k=j+1;k<5;k++)
	{
		if(a[j]>a[k])
		{int temp=a[j];
			a[j]=a[k];
			a[k]=temp;
		}
	}
	
}
for( int i=0;i<5;i++)
{
	System.out.print(a[i]);
}
	}

}

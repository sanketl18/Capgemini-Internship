package javacodeforgit;
import java.util.Scanner;

public class Q3assign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter Principal amount");
Double p=s.nextDouble();
System.out.println("enter Term of loan in years");
Double n=s.nextDouble();
System.out.println("enter Annual interest rate");
Double r=s.nextDouble();
System.out.println("enter number of years interest is applied");
Double t=s.nextDouble();
Double Simple_Interest=(p*r*n)/100;
System.out.println("Simple Interest:"+Simple_Interest);
double Compound_Interest=p*(Math.pow(1+r, t) -p);
System.out.println("Compound Interest:"+Compound_Interest);
	}

}

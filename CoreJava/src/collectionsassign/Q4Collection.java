package collectionsassign;

import java.time.LocalDate;
import java.util.LinkedList;
class Dates
{ LocalDate date;
boolean leap;
public Dates(LocalDate date, boolean leap) {
	super();
	this.date = date;
	this.leap = leap;
}	
}
public class Q4Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalDate ld1= LocalDate.of(2000, 1, 30);
boolean b1= ld1.isLeapYear();
LocalDate ld2= LocalDate.of(2004, 5, 25);
boolean b2= ld2.isLeapYear();
LocalDate ld3= LocalDate.of(2003, 5, 25);
boolean b3= ld3.isLeapYear();

Dates d1=new Dates(ld1, b1);
Dates d2=new Dates(ld2, b2);
Dates d3=new Dates(ld3, b3);
LinkedList<Dates> l1=new LinkedList<>();
l1.add(d1);
l1.add(d2);
l1.add(d3);

for (Dates dates : l1) {
	System.out.println("Your date of birth is"+dates.date+"\n"+"If it was leap year then True and False for not leap year:"+dates.leap+"\n");
}
	}

}

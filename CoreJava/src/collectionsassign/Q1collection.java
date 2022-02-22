package collectionsassign;

import java.util.Map.Entry;
import java.util.TreeMap;

import collectionsassign.Contacts.Gender;

class Contacts
{ 
String Name;
String Email;
Gender genderr;
enum Gender
{
	MALE,FEMALE
}
long PhoneNumber;
public Contacts(String name, String email,Gender genderr) {
	super();
	
	this.Name = name;
	this.Email = email;
	this.genderr=genderr;
}
Long Phone(long PhoneNumber)
{
	this.PhoneNumber=PhoneNumber;
	return PhoneNumber;
}
  
}

public class Q1collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
TreeMap<Long, Contacts> t1=new TreeMap<>();
Gender M=Gender.MALE;
Gender F=Gender.FEMALE;

Contacts c1=new Contacts("sumit","sumit@45",M);
Contacts c2=new Contacts("sanket","sanket@45",M);
Contacts c3=new Contacts("sujal","sujal@45",F);
Contacts c4=new Contacts("suraj","suraj@45",M);

t1.put( c1.Phone( 91922223), c1);
t1.put( c2.Phone( 99929835), c2);
t1.put( c3.Phone( 96929835), c3);
t1.put( c4.Phone( 97929835) , c4);

for(Entry<Long, Contacts> entry:t1.descendingMap().entrySet()){    
    Long key=entry.getKey();  
    Contacts b=entry.getValue();  
    
    System.out.println(key+" "+b.Name+" "+b.Email+" "+b.genderr);   
} 
/*EnumMap<Gender, Contacts> map = new EnumMap<Gender, Contacts>(Gender.class);  
map.put(Gender.MALE,c1 );
map.put(Gender.MALE,c1 );
map.put(Gender.MALE,c1 );
map.put(Gender.FEMALE,c1 );
for(Map.Entry m:map.entrySet()){    
    System.out.println(m.getKey()+" "+m.getValue());    
   }   
	*/
	}
}

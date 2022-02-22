package collectionsassign;

import java.util.HashSet;

class Brand {   
String name;  

public Brand( String name) {  
    this.name = name;  
 
}  
}  
public class Q2collection {

	public static void main(String[] args) {
    HashSet<Brand> set=new HashSet<Brand>();  
    //Creating Books  
    Brand b1=new Brand("Asus");  
    Brand b2=new Brand("Samsung");  
    Brand b3=new Brand("Apple");
    Brand b4=new Brand("Samsung");
    Brand b5=new Brand("HP");
    Brand b6=new Brand("Dell");
    Brand b7=new Brand("Acer");
    Brand b8=new Brand("Mac");
    Brand b9=new Brand("Nvidia");
    Brand b10=new Brand("Lenovo");
    Brand b11=new Brand("Samsung");
    //Adding Books to HashSet  
    set.add(b1);  
    set.add(b2);  
    set.add(b3);  
    set.add(b4);  
    set.add(b5);  
    set.add(b6);  
    set.add(b7);  
    set.add(b8);  
    set.add(b9);  
    set.add(b10);
    set.add(b1);  
    //Traversing HashSet  
    for(Brand b:set){  
    System.out.println( b.name);  
    }  


	}

}

package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Test
{int a() default 1;
	
}
class Annot1
{
@Test
void test1()
{System.out.println("Hello");
	
}
@Test 
static void test2()
{
	System.out.println("JAVA");
}
}

public class Q1Annotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Annot1 a1=new Annot1();
  a1.test1();
  a1.test2();
  
	}

}

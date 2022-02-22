package lambda_Assignment;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Q5lambda {
    List<String> list = Arrays.asList("klpha", "bravo", "charlie", "delta", "echo", "foxtrot");

    public static void main(String[] args) { 
    	
    	Q5lambda A5=new Q5lambda();
    	List<String> lis=A5.list;
    	processWords(lis, o->{
    		StringBuilder r = new StringBuilder();
    		r.append(o.charAt(0));
    		System.out.print(r);
    	});
 
    }

    public static void processWords(List<String> list, Consumer<String> consumer) {
		for(String i: list) {
			consumer.accept(i);	
		}
		
   
    }
}
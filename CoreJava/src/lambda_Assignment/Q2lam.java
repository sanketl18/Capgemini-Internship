package lambda_Assignment;

import java.util.Arrays;
import java.util.List;
interface Condition{
	boolean test(Q2lam v);
}
public class Q2lam{
	    private int totalPrice;
	    private String status;
	    
	public Q2lam(int totalPrice, String status) {
			super();
			this.totalPrice = totalPrice;
			this.status = status;
		}

   
	public static void main(String[] args) {
		List<Q2lam> V =  Arrays.asList(
				new Q2lam(20000,"ACCEPTED"),
				new Q2lam(14000,"COMPLETED"),
				new Q2lam(15000,"COMPLETED"),
				new Q2lam(9500,"ACCEPTED")
				);
		
      printConditionally(V, n->n.totalPrice>10000);
      
      }
	private static void printConditionally(List<Q2lam> V,Condition condition) {
  	  for(Q2lam n: V)
  		  if(condition.test(n)) {
  			  System.out.println(n.totalPrice+" "+n.status);
  		  }
	}

}

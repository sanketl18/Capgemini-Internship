package inter.oops.assign;

import java.util.ArrayList;

class currentAccount extends Q3assign
{ int totaldeposits=10000;
int creditLimit=2000;
public int getcash()
{int totalcash=totaldeposits+creditLimit;
	return totalcash;
}}
class savingsAccount extends Q3assign
{
	int totaldeposits=10000;
	int fd=5000;
	public int getCash()
	{int totalcash=totaldeposits+fd;
		return totalcash;
	}
}

public class Q3assign {
public int totalcashInBank(ArrayList<Integer>cash)
{int totalcash=0;
	for(int i:cash)
	{
		totalcash+=i;
	}
	return totalcash;
	/*public int getcash()
	{totalcash=0;
		return totalcash;
	}*/
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q3assign  q=new Q3assign ();
		currentAccount c=new currentAccount();
		int a=c.getcash();
		savingsAccount s=new savingsAccount();
		int b=s.getCash();
		
		ArrayList<Integer> cashList=new ArrayList<>();
		cashList.add(a);
		cashList.add(b);
		int d=q.totalcashInBank(cashList);
		System.out.println(d);
		
	}

}

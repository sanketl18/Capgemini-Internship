package javacodeforgit;
public class Q2assiggn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=100;i<=999;i++)
		{int temp=i,r,as=0;
			while(temp>0)
			{r=temp%10;
			double a=(Math.pow(r, 3));
			int b=(int)a;
			as=as+b;
			temp=temp/10;
			}
			if(as==i)
			{
				System.out.println(i);
			}
		}
	}

}

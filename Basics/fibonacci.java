import java.util.*;
class Solution {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int a=0,b=1,c=0;
		if(n==1)
		System.out.print(b);
		else if(n==2)
		System.out.print(b);
		else
		{
			for(int i=0;i<n;i++)
			{
				c=a+b;
				a=b;
				b=c;
			}
		    System.out.print(a);

		}
	}
}
import java.util.*;
public class Fibonacci
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int a = sc.nextInt();
		int n1,n2;
		System.out.println("Fibonacci Series upto "+a+" terms: ");
		if(a==1)
		{
			System.out.print(0);
		}
		else if(a==2)
		{
			System.out.print(0+" "+1);
		}
		else
		{
			System.out.print(0+" "+1+" ");
			n1=0;
			n2=1;
			int nexterm=0;
			int count=3;
			while(count<=a)
			{
				nexterm=n2+n1;
				System.out.print(nexterm+" ");
				count++;
				n1=n2;
				n2=nexterm;	
			}
		}

	}
}
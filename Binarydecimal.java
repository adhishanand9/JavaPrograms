import java.util.*;
import java.lang.Math;
public class Binarydecimal
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int t;
		int sum=0;
		int temp=a,i=0;
		while(a>0)
		{
			t=a%10;
			a/=10;
			sum+=t*Math.pow(2,i);
			i++;	
		}
		System.out.println("Decimal Number is "sum);
		
		
	}

}
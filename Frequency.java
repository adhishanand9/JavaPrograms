import java.util.*;
import java.lang.Math;
public class Frequency
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int t;
		int i=0; 
		int[] n=new int[20];
		while(a>0)
		{
			t=a%10;
			a/=10;
			n[i]=t;
			i++;	
		}
		int s=0;
		int[] count =new int[10];
		for(int j=0;j<i;j++)
		{
			for(int k=j+1;j<i;k++)
			if(n[j]==n[k])
			{
				count[s]++;
			}
		}
		
		
	}

}
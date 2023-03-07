import java.util.Scanner;
public class Check
{
	public static void main(String[]args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter your number");
		int n=in.nextInt();
		int flag=0;
		if(n<=1)
		{
			System.out.println(n+" is a prime number .");
		}
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
				
			{
				flag =0;
			}
			else
			{
				flag=1;
			}
		}
		if(flag==1)
		{
			System.out.println(n+" is prime number");
		}
		else
		{
			System.out.println(n+" is not prime number");
		}
	}
}

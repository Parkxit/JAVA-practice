import java.util.Scanner;
public class Prime {
	private int num;
	public void getnum()
	{
		
		System.out.println("Enter the range:");
		Scanner obj=new Scanner(System.in);
		num=obj.nextInt();
	
	}
	
	public void op()
	{
		System.out.println("The prime number from 2 to "+num+" are:");
	
		for(int n=2;n<=num;n++)  //note:debug for num=5
		{
			int flag=0;
			
			for(int i=2;i<n;i++)
			{
				
				if(n%i==0)
				{
					flag=1;
				}
			}
			
			if(flag==0)
			{
				System.out.println(n);
			}
		}
	}

}

import java.util.Scanner;

public class Transaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tranarraysize = 0;
		int nooftargets = 0;
		
		System.out.println("Enter size of transaction array");
		Scanner tsa = new Scanner(System.in);
		tranarraysize = tsa.nextInt();
		
		System.out.println("Enter the values of array");
		int tranarray[] = new int[tranarraysize];
		
		for(int i =0;i<tranarraysize;i++)
		{
			tranarray[i] = tsa.nextInt();
		}
		
		System.out.println("Enter no of targets to be achieved");
		Scanner not = new Scanner(System.in);
		nooftargets = not.nextInt();
		
		for(int j=1;j<=nooftargets;j++)
		{
			int target = 0;
			int targetachieved = 0;
			System.out.println("Enter the target value");
			Scanner trgt = new Scanner(System.in);
			target = trgt.nextInt();
			int count=0;
			int sum=0;
			for(int k=0;k<tranarraysize;k++)
			{
				sum = sum+tranarray[k];
				if(sum >= target)
				{
					count = k+1;
					targetachieved = 1;
					System.out.println("Target achieved after " + count+" transactions ");
					break;
				}
				
			}
			if (targetachieved == 0)
			{
				System.out.println("Given target is not achieved");
			}
		}
			
		

	}

}

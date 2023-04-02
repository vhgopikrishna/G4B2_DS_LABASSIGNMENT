import java.util.Scanner;

public class Denominations {
	
	 static int[] bubbleSort(int array[]) {
		int temp = 0;
		
		for (int i = 0;i<array.length;i++) 
		{
			for (int j=0;j<array.length-1;j++)
			{  
				if (array[j]>array[j+1])
				{
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}	
			
		}
		return array;
	 }	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int denomarraysize = 0;
		System.out.println("Enter the size of currency denominations");
		Scanner das = new Scanner(System.in);
		denomarraysize = das.nextInt();
		
		
		System.out.println("Enter the values of array");
		Scanner da = new Scanner(System.in);
		int denomination[] = new int[denomarraysize];
		for(int i =0;i<denomarraysize;i++)
		{
			denomination[i] = da.nextInt();
		}
		System.out.println();
		System.out.println("Sorted Denominations Array");
		denomination = bubbleSort(denomination);
		
		for(int k=0;k<denomination.length;k++)
		{
			System.out.print(denomination[k]+"\t");
		}
		
		
		int denmcount[] = new int[denomination.length];
		
		int payment = 0;
		System.out.println();
		System.out.println("Enter amount you want to pay");
		Scanner pay = new Scanner(System.in);
		payment = pay.nextInt();
		
		int balance = 0;
		int dnms = 0;
		for(int i = denomination.length-1; i>=0;i--)
		{
			if(payment >= denomination[i])
			{
				
				dnms = payment/denomination[i];
				payment = payment%denomination[i];
				denmcount[i] = dnms;
			}
		}
		System.out.println("Your payment approach in order to give min no of notes will be");
		for(int i=denomination.length-1;i>=0;i--)
		{
			
			System.out.println(denomination[i]+":"+denmcount[i]);
		}
	
	}
}	

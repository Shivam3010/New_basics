package basics;

import java.util.Scanner;

public class Highest_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int []a=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any 5 numbers :- ");
		for(int i=0;i<=4;i++)
		{
			a[i]=sc.nextInt();
			//[1][2][3][4][5]
		}
		int max=a[0];
		for(int j=0;j<=4;j++)
		{ 
			
			if(a[j]>max)
			{
				max=a[j];
			}
			
			}
		System.out.println(max);
	}

}

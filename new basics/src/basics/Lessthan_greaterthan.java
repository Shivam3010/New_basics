package basics;

import java.util.Scanner;

public class Lessthan_greaterthan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]=new int [5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any 5 inputs :- ");
		
		for(int i=0;i<=4;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int j=0;j<=4;j++)
		{
			if(a[j]<10)
			{
				System.out.println(a[j]+" is less than 10");
			}
			else if (a[j]>10&&a[j]<=50)
			{
				System.out.println(a[j]+" is less than 50 greater than 10");
			}
			else
			{
				System.out.println(a[j]+" is greater than 50");
			}
		}
	}

}

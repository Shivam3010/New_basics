package basics;

import java.util.Scanner;

public class Second_minimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:- ");
		for(int i=0;i<=4;i++)
		{
			a[i]=sc.nextInt();
		}
		int min=a[0];
		int min2=a[1];
		for(int j=2;j<=4;j++)
		{
			if(a[j]<min)
			{
				min2=min;
				min=a[j];
			}
			 if(a[j]<min2)
			{
				min2=a[j];
			}
		}
		System.out.println(min2);
	}

}

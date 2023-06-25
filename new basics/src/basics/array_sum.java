package basics;

import java.util.Scanner;

public class array_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int b=0;	
	int a[]= new int [5];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any 5 digits :- ");
	for (int i=0;i<=4;i++)
	{
		a[i]=sc.nextInt();
	}
	for (int j=0;j<=4;j++)
	{
		b=b+a[j];
	}
	System.out.println(b);
	}

}

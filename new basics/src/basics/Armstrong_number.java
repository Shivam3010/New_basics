package basics;

import java.util.Scanner;

public class Armstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any digit value :- ");
		int z =sc.nextInt();
		int input=z;
		int a=input%10; input=input/10;
		int b=input%10; input=input/10;
		int c=input%10; input=input/10;
		int d=0;
		int[]arr= {a,b,c};
		for(int i=0;i<=2;i++)
		{
			int out=arr[i]*arr[i]*arr[i];
			d=d+out;
		}
		if(z==d)
		{
			System.out.println("outcome is "+d+", "+z+" is armstrong");
		} 
		else
		{
			System.out.println("outcome is "+d+", "+z+" is not armstrong");
		}

	}

}

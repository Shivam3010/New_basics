package basics;

import java.util.ArrayList;
import java.util.Scanner;

public class array_armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number :- ");
		int a=sc.nextInt();
		int z=0;
		ArrayList arr=new ArrayList();
		while(a>0)
		{
			z=a%10;
			a=a/10;
			arr.add(z);
		}
		System.out.println(arr);
	}

}

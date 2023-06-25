package basics;

import java.util.Scanner;

public class Occurance_count {
	
	public void getdata ()
	{
		int count = 0;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter any name :- ");
		String name=sc.next();
		System.out.println("Enter an alphabet you wish to search the accurance of :- ");
		char out=sc.next().charAt(0);
		char[]c=name.toCharArray();
		
		for(int i=0; i<c.length;i++)
		{
			if(c[i]==out)
			{
				count=count+1;		
			}
		}
		System.out.println(count);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Occurance_count ob=new Occurance_count();
		ob.getdata();
		

	}

}

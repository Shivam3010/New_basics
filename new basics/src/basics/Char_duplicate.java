package basics;

import java.util.Scanner;

public class Char_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String out="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any name:- ");
		String name=sc.next();
		char[]c=name.toCharArray();
		for(int i=0;i<=c.length-1;i++)
			
		{	boolean flag=true;
			for (int j=i+1;j<=c.length-1;j++)
			{	
				if(c[i]==c[j])
				{	
					flag=false;
					break;
				}
			}
				if (flag==true)
				{
					out=out+c[i];
				}			
			}
		System.out.print(out);
		}

	}



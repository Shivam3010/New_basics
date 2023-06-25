package basics;

import java.util.Scanner;

public class same_position {

	public String getdata(String input)
	{
		String out="";
		String[] data=input.split(" ");
		for(int i=0;i<=data.length-1;i++)
		{
			char[]alp=data[i].toCharArray();
			for(int j=alp.length-1;j>=0;j--)
			{
				out=out+alp[j];
			}
			out=out+" ";
		}
		
		return out;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		same_position ob=new same_position();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any sentence you wish to reverse:- ");
		String input=sc.nextLine();
		String z=ob.getdata(input);
		System.out.println(z);
		

	}

}

package basics;

import java.util.Scanner;

public class Rev_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String out="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any name :- ");
		String name=sc.next();
		char[]alp=name.toCharArray();
		for(int i=alp.length-1;i>=0;i--)
		{
			out=out+alp[i];
		}
		System.out.println(out);

	}*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any name");
		String name=sc.next();
		StringBuffer sb=new StringBuffer(name);
		System.out.println(sb.reverse());
		

}
}

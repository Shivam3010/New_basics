package basics;

import java.util.Scanner;

public class new_new_reverse_string {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter any name:- ");
		String name=sc.nextLine();
		StringBuffer sb=new StringBuffer(name);
		System.out.println("Input "+sb);
		sb.reverse();
		System.out.println("Output "+sb);
		sb.reverse();
		System.out.println(sb);
	}

}


package string;

import java.util.Scanner;

public class reverse {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		StringBuffer str=new StringBuffer(sc.nextLine());
	
		int i=0,j=str.length()-1;
		while(i<j)
		{char temp=str.charAt(i);
		char temp1=str.charAt(j);
		str.setCharAt(i, temp1);
		str.setCharAt(j, temp);
		i++;
		j--;
		}
		System.out.println(str);
		
	}

}

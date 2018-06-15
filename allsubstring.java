package string;

import java.util.Scanner;

public class allsubstring {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++)
		{for(int j=i+1;j<=s.length();j++)
		{
			String str=s.substring(i, j);
			System.out.println(str);
		}
			
		}
	}

}

package string;

import java.util.Scanner;

public class remove_vowel {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	StringBuffer str=new StringBuffer(sc.nextLine());
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)=='a'||str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
			str.deleteCharAt(i);
	}
	System.out.println(str);
}
}

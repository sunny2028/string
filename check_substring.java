package string;

import java.util.Scanner;

public class check_substring {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	StringBuffer str=new StringBuffer(sc.nextLine());
	StringBuffer str1=new StringBuffer(sc.nextLine());
	int k=str.length()-str1.length();
	int j;
	boolean flag=false;
for(int i=0;i<=k;i++)
{
	for(j=0;j<str1.length();j++)
	{
		if(str.charAt(i+j)==str1.charAt(j))
		continue;
		break;
	}
	if(j==str1.length())
	{flag=true;
		break;
	}
}
if(flag==true)
{
	System.out.println("yes it is present");
}
else
	System.out.println("No it is not present");
}
}

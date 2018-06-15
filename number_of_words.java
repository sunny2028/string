package string;

import java.util.Scanner;

public class number_of_words {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	StringBuffer str=new StringBuffer(sc.nextLine());
	int state =1;
	int count=0;
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)==' '||str.charAt(i)=='\n'||str.charAt(i)=='\t')
		{
			state=1;
		
		}
		else if(state==1)
		{state=0;
		count++;
		}
	}
	System.out.println(count);
	}
}

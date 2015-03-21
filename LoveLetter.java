import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution{

	static int palindromeCount(String text)
	{
		int i,j;
		int countOperation = 0;
		i=0;
		j=text.length() - 1;

		while(i<j)
		{
			
			
			if(text.charAt(i) > text.charAt(j))
			{
			
				int temp1 = text.charAt(i);
				int temp2 = text.charAt(j);

				while(temp1 > temp2)
				{

					temp1 --;
					countOperation += 1;
				}	
			}

			else if(text.charAt(i) < text.charAt(j))
			{
				//System.out.println("=====");
				int temp3 = text.charAt(j);
				int temp4 = text.charAt(i);
				//System.out.println("Temp4 i->"+temp4+" Temp3 j->"+temp3+text.charAt(j));
				while(temp3 > temp4)
				{
					temp3 --;
					countOperation += 1;
					//System.out.println("T="+text.charAt(j)+" "+temp3);
				}	
				
			}
	
			i++;
			j--;

			//System.out.println("<"+i+"><"+j+">");
		}

		return countOperation;
	}

	public static void main(String [] args){

		Scanner scan = new Scanner(System.in);
		int T=0; //# of testcases

		T = Integer.parseInt(scan.nextLine());
		String[] text= new String[T];

		for(int i=0; i<T; i++)
		{
			text[i] = scan.nextLine();
		}

		for(int i=0; i<T; i++)
		{
			int count = palindromeCount(text[i]);
			System.out.println(count);
		}




	}
}
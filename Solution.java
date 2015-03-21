import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	// n is the Number of Cycles in the particular testcase
	static void HeightOfUtopianTree(int n){
		int height = 1;
		if(n == 0)
			System.out.println(height);
		else if(n%2 == 0)
		{
			for(int i=0; i<(n/2) ; i++)
			{
				height *= 2;
				height += 1;
			}

			System.out.println(height);	
		}

		else
		{
			int newN = n-1;
			for(int i=0; i<(newN/2); i++)
			{
				height *= 2;
				height += 1;
			}	
			height *= 2;
			System.out.println(height);

		}	

	}

    public static void main(String[] args) {

    	Scanner scan = new Scanner(System.in);
    	int x=0;
    	int T = Integer.parseInt(scan.nextLine()); // # of Testcases
    	int[] testCase = new int[T];

    	//scan the Testcases array

    	for(int i=0;i<T;i++)
    	{
    		testCase[i] = Integer.parseInt(scan.nextLine());
    	}	


	     for(int i=0;i<T;i++)
	     {
	     	x = testCase[i];
	     	HeightOfUtopianTree(x);

	     }   

	       
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    }
}
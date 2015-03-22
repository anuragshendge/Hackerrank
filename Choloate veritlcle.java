import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
 
    	Scanner scan = new Scanner(System.in);

    	int T = Integer.parseInt(scan.nextLine());
    	long[] testcase = new long[T];

    	for(int i=0;i<T;i++)
    		testcase[i] = Long.parseLong(scan.nextLine());

    	for(int i=0;i<T;i++)
    	{
    		long horizontal = 0;
    		long vertical = 0;

    		if(testcase[i]%2 == 0)
    		{
    			horizontal = vertical = testcase[i]/2;
    			System.out.println(horizontal*vertical);
    		}
    		else
    		{
    			horizontal = (testcase[i]+1)/2;
    			vertical = horizontal -1;
    			System.out.println(horizontal*vertical);	
    		}

    	}



        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
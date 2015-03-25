import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		int[] n = new int[t];
				
		for(int i=0; i<t; i++)
		{
			n[i]=scan.nextInt();
			
		}
		
		for(int i=0;i<t;i++)
		{
			
			int number = n[i];
			int count = 0;
			int rem=0;
			while(number>0)
			{
				rem = number%10;
				number = number / 10;
				if( rem!=0 && n[i] % rem ==0 )
					count++;
				
			}
			System.out.println(count);
			
			
		}
		
		
		
		
		
		
		

	}

}

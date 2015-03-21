	import java.util.*;
	import java.io.*;
	import java.text.*;
	import java.math.*;

	public class Solution{

		public static void main(String[] args){
			Scanner scan = new Scanner(System.in);
			int T = Integer.parseInt(scan.nextLine());	
			
			int[] a = new int[T];
			int[] b = new int[T];

			for(int i=0; i<T; i++)
			{
				String str = scan.nextLine();
				String[] temp = str.split(" ");
				a[i] = Integer.parseInt(temp[0]);
				b[i] = Integer.parseInt(temp[1]);
			}

		
		for(int i=0; i<T; i++)
		{
            int tempB = (int) Math.floor(Math.sqrt(b[i]));
            int tempA = (int) Math.ceil(Math.sqrt(a[i]));
            
			//int answer = ( - );
			
            System.out.println(tempB-tempA+1);
		}


		}
	}
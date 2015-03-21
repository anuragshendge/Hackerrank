		import java.util.*;
	import java.io.*;
	import java.text.*;
	import java.math.*;


	public class Solution {

		public static void main(String[] args){

	// Scanning the first ilne of the input of N anf M
			Scanner scan = new Scanner(System.in);
			
			int N, M;
			int countMax = 0;
			int count = 0;
			int teamCount=0;
			int countTemp =0;
			String str = scan.nextLine();
			String[] text = str.split(" ");
			N = Integer.parseInt(text[0]);
			M = Integer.parseInt(text[1]);

			// Scanning N persons

			String[] personArray = new String[N];

			for(int i=0; i<N; i++)
			{
				personArray[i] = scan.nextLine();
			}


			for(int i=0;i< N-1; i++)
			{
				for(int j=i+1; j<N; j++)
				{
					count = 0;
					for(int k=0;k<M;k++)
					{

						if(personArray[i].charAt(k) =='1'| personArray[j].charAt(k)=='1')
						{
							count++;
						}
					}

					if(count > countMax)
						countMax = count;

				}
			}

			

			for(int i=0;i< N-1; i++)
			{
				for(int j=i+1; j<N; j++)
				{
					countTemp = 0;
					for(int k=0;k<M;k++)
					{

						if(personArray[i].charAt(k) =='1'| personArray[j].charAt(k)=='1')
						{
								countTemp++;
						}
					}

					if(countTemp == countMax)
						teamCount++;

				}
			}		

		System.out.println(countMax);
		System.out.println(teamCount);	
		
		}
	}



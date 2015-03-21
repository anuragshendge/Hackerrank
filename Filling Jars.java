import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;


public class Solution{

	static long FillingJars(int N,int M,long[] a,long[] b,long[] k){

		long sum = 0;

		for(int i=0;i<M;i++)
		{
			sum = sum + (b[i] - a[i] + 1)*k[i];
		}



		long average = sum/N;

		return average;

	}


	public static void main(String[] args){

		int N=0;
		int M=0;
		
		Scanner scan = new Scanner(System.in);

		// Scan M and N and tokenise them
		String tempStr = scan.nextLine();
		String[] tempMN = new String[2];
		tempMN = (tempStr.split(" "));
		M = Integer.parseInt(tempMN[1]);
		N = Integer.parseInt(tempMN[0]);
		//System.out.println(M+N);
		long[] a = new long[M];
		long[] b = new long[M];
		long[] k = new long[M];

		// Scan a b k M times

		for(int i=0; i<M;i++)
		{
			String tempStr2 = scan.nextLine();
			String[] tokenStringArray = new String[3];
		
			tokenStringArray = tempStr2.split(" ");

					
			 a[i] = Long.parseLong(tokenStringArray[0]);
			 b[i] = Long.parseLong(tokenStringArray[1]);
			 k[i] = Long.parseLong(tokenStringArray[2]);
		
		}			


		long average = FillingJars(N,M,a,b,k);

		System.out.println(average);


	}


}
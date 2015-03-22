
import java.util.*;
import java.io.*;

public class Solution {

	public static void attendance(int N, int K, int [] test){

		int count = 0;

		for(int i=0; i<N; i++)
		{
			if(test[i] <= 0)
				count++;

		}

		if(count < K)
			System.out.println("YES");
		else
			System.out.println("NO");

	}

	public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);

			int T = Integer.parseInt(scan.nextLine());

			for(int i=0; i<T; i++){
			

			String text = scan.nextLine();
			String[] textInt = text.split(" ");

			int N = Integer.parseInt.textInt[0];
			int K = textInt[1];
			int[] test = new int(N);

			String temp = scan.nextLine();
			String[] tempInt = text.split(" ");					
			
			for (int i=0; i< N;i++ ) 
			{
			
				test[i] = Integer.parseInt(tempInt[i]);

			}


			attendance(N,K,test);	


		}

	}

}

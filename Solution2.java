import java.util.*;
import java.io.*;
public class Solution2{
	public static void main(String[] args){

		Scanner in = new Scanner(System.in); // scanner class for scanning the input from args i.e command line

		System.out.println("Enter the number of elements you want to put");
		int N = in.nextInt(); // taking size of the aray from command line
		int j;
		int res=0;
		int flag[] = new int [1000];
		int[] a = new int[N];
		
		if(N%2 ==0)
			return;

		for(int k=0;k<N;k++)
		{

					a[k] = in.nextInt();
		}

		/*for(int i=0 ; i<N ;i++)
		{
			for(j=i+1; j<N ;j++)
			{
				if(a[i] == a[j] && flag[a[i]]!=1)
				{
					//System.out.println("Pair found "+a[i]+"<->"+a[j]+"<->"+j+);
					flag[a[i]] = 1;
					count++;
					break;

				}


			}

			if(j==N && flag[a[i]]!=1)
			{
				flag[a[i]] = 2;
			}
			
		}
		
		for(int i=0;i<1000;i++)
		{
			if(flag[i] == 2)
				{
					System.out.println("Lonely Integer="+i);
					break;
				}
		} */


		for(int i=0;i<N; i++)
		{
			res = res^a[i];
		}

		System.out.println("Lonely Integr="+res);


	}

}
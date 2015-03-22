
import java.util.*;
import java.io.*;


public class Solution{

	public static int ServiceLane(int N,int startPoint,int endPoint,int[] width){

		int m = startPoint;
		int n = endPoint;
		int answer = 0;
		
		//for (int i = m; i<=n; i++)
			//System.out.println(width[i]);
		
		for(int i=m; i<=n; i++)
		{
			if(width[i] == 1)
			{				
				answer = 1;
				break;
			}
			
			else if(width[i] == 2 && answer !=1)
			{
				answer = 2;
								
			}
			else if(width[i]==3 && answer!=1 && answer!=2)
			{
				//System.out.println(width[i]);
				answer = 3;

			}

		}

		//System.out.println(answer);
		return answer;


	}
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		int N;
		int T;
		String tempStr = scan.nextLine();

		String[] tempStrArray = tempStr.split(" ");
		N = Integer.parseInt(tempStrArray[0]);
		T= Integer.parseInt(tempStrArray[1]);
		int[] width = new int[N];
		
		String tempStr2 = scan.nextLine();
		String[] tempStrArray2 = tempStr2.split(" ");

		for(int i=0; i<N; i++)
		{
			width[i] = Integer.parseInt(tempStrArray2[i]);
		}


		for(int i=0; i<T; i++)
		{

			String tempStr3 = scan.nextLine();
			String[] tempStrArray3 = tempStr3.split(" ");

			int startPoint = Integer.parseInt(tempStrArray3[0]);
			int endPoint = Integer.parseInt(tempStrArray3[1]);

			int k = ServiceLane(N,startPoint,endPoint,width);

			System.out.println(k);

		}



	}
}
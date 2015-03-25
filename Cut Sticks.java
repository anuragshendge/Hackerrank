import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		ArrayList<Integer> sticks = new ArrayList<>(n);
		
		for(int i=0; i<n; i++)
		{
			sticks.add(scan.nextInt());
		}
		
	
		while(sticks.size()>0) {
			
			int count=0;
			int min = findMin(sticks, sticks.size());
			
			 for (int i = 0; i < sticks.size(); i++) {

				 int temp=sticks.get(i);
				 sticks.set(i,temp-min);
				 
			}
			 
			 //System.out.println("After reduction=>"+sticks);
			
			 System.out.println(sticks.size());
	
			 for(int i=0;i<sticks.size();i++)
			{
				 if(sticks.get(i)==0)
				 {
					 System.out.println("Before->"+sticks);
					 sticks.remove(i);
					 i=0;	
					 System.out.println("After->"+sticks);
				 }
			}
			 
		
		}
			 
		  
			 
			 
		}
		
		
	

	


	public static int findMin(ArrayList sticks, int n){
		
		int min = (int) sticks.get(0);
		
	for(int i =0; i<n;i++)
	{
		int temp = (int) sticks.get(i);
		if(min > temp)
		{
			min = temp;
		}
		
	}
	return min;

	}

}

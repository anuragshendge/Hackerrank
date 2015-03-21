import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.math.*;
// The part of the program involving reading from STDIN and writing to STDOUT has been provided by usdgsdfg

public class Solution {
    
   public static void main(String[] args) throws NumberFormatException, IOException {

BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(in.readLine());
      int K = Integer.parseInt(in.readLine());
      int[] list = new int[N];

      for(int i = 0; i < N; i ++)

         list[i] = Integer.parseInt(in.readLine());
      
      int unfairness = Integer.MAX_VALUE;
      

      /*
       * Write your code here, to process numPackets N, numKids K, and the packets of candies
       * Compute the ideal value for unfairness over here
      */
      Arrays.sort(list);

      for(int i=0; i< N-K+1; i++)
      {
        unfairness = Math.min(unfairness,list[K-1+i] - list[i]);
      }
      
      System.out.println(unfairness);

   }
}
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); // Scanning thr total # of testcases

        for(int i = 0; i < t; i++){
            System.out.println(Solve(in.nextInt(), in.nextInt(), in.nextInt()));
        }
    }
    
    private static long Solve(int N, int C, int M){
        
        long totalChocolate = 0;
        long wrapperTotal = 0;
        
        long discountedTotalChocolates = 0;

        totalChocolate = N/C;

        wrapperTotal = totalChocolate;


        return totalChocolate  + (long) WrapperFunction(totalChocolate , M);



       /* while(wrapperTotal >= wrapperPrice)
        {
            discountedTotalChocolates += (wrapperTotal/wrapperPrice);
            wrapperTotal = wrapperTotal - wrapperPrice + (wrapperTotal/wrapperPrice);
        }

            totalChocolate += discountedTotalChocolates;

            return totalChocolate;*/

        //Write code to solve each of the test over here
    }
    

    private static int WrapperFunction(long numberOfWrappers, int WrappersNeededM){
            int sum =0;

            if(numberOfWrappers >= WrappersNeededM)
            {
                sum = sum + WrapperFunction(numberOfWrappers- WrappersNeededM +1, WrappersNeededM) +1;

                }

            System.out.println(sum);
            return sum;

    }
    
}       
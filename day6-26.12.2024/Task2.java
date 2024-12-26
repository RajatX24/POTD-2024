//POTD-2024
//-----------
//DAY:6
//DATE:26/12/2024
//TASK2:Trailing Zeros
//PROBLEM LINK:https://cses.fi/problemset/task/1618/

//CODE:

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class TrailingZeroes {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        System.out.println(findTrailingZeroes(n));
    }
 
    static int findTrailingZeroes(int n)
    {
        int zeroes=0;
 
        for(int i=5;i<=n;i=i*5)
        {
            zeroes+=n/i;
        }
 
        return zeroes;
    }
}

//TIME COMPLEXITY:O(log(n)/log(5))
//SPACE COMPLEXITY:O(1)
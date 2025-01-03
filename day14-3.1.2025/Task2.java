//POTD-2024
//-----------
//DAY:14
//DATE:3/12/2025
//TASK1:Luntik and Subsequences
//PROBLEM LINK:https://codeforces.com/problemset/problem/1582/B

//CODE:
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LuntikAndSubsequences {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for (int i=1;i<=t;i++)
        {
            int n=Integer.parseInt(br.readLine());
            String[] tokens=br.readLine().split(" ");
            long countOf1=0;
            long countOf0=0;
            for(int j = 0; j <tokens.length; j++)
            {
                int a=Integer.parseInt(tokens[j]);
                if(a==1)
                    countOf1++;
                else if(a==0)
                    countOf0++;
            }

            long res=countOf1*(long)Math.pow(2,countOf0);
            System.out.println(res);
        }
    }
}

//TIME COMPLEXITY:O(N)
//SPACE COMPLEXITY:O(1)
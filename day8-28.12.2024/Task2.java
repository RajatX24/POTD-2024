//POTD-2024
//-----------
//DAY:8
//DATE:28/12/2024
//TASK2:Permutation Swap
//PROBLEM LINK:https://leetcode.com/problems/convert-1d-array-into-2d-array/description/

//CODE:
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PermutationSwap {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=1;i<=t;i++)
        {
            int n=Integer.parseInt(br.readLine());
            String[] tokens=br.readLine().split(" ");
            int[] permutation=new int[n];
            for(int j=0;j<n;j++)
            {
                permutation[j]=Integer.parseInt(tokens[j]);
            }
            System.out.println(maxKToMakeSorted(permutation));
        }
    }

    private static int maxKToMakeSorted(int[] permutation) {
        int hcfOfAll=0;

        for(int i=1;i<=permutation.length;i++)
        {
            int diff=Math.abs(permutation[i-1]-i);
            hcfOfAll=hcf(hcfOfAll,diff);
        }

        return hcfOfAll;
    }

    static int hcf(int a,int b)
    {
        while(b!=0)
        {
            int rem=a%b;
            a=b;
            b=rem;
        }

        return a;
    }
}

//let M be the largest number amongst the n input values
//TIME COMPLEXITY:O( n(logM) )
//SPACE COMPLEXITY:O(n)
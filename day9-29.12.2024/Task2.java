//POTD-2024
//-----------
//DAY:9
//DATE:29/12/2024
//TASK1:Long Long
//PROBLEM LINK:https://codeforces.com/problemset/problem/1843/B

//CODE:
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongLong {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());

        for(int i=1;i<=t;i++)
        {
            int n=Integer.parseInt(br.readLine());
            String[] tokens=br.readLine().split(" ");
            int[] arr=new int[n];
            for(int j=0;j<n;j++)
            {
                arr[j]=Integer.parseInt(tokens[j]);
            }
            findMaxSumAndMinOps(arr);
        }
    }

    static void findMaxSumAndMinOps(int[] arr)
    {
        long sum=0;
        long ops=0;
        boolean seq=false;
        for(int i=0;i<arr.length;i++)
        {
            sum+=Math.abs(arr[i]);

            if(arr[i]<0)
            {
                if(!seq)
                {
                    ops++;
                    seq=true;
                }
            }
            else if(arr[i]>0)
                seq=false;
        }

        System.out.println(sum+" "+ops);
    }
}

//TIME COMPLEXITY:O(n)
//SPACE COMPLEXITY:O(1)
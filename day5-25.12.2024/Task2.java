//POTD-2024
//-----------
//DAY:5
//DATE:25/12/2024
//TASK1:New Year and Hurry
//PROBLEM LINK:https://codeforces.com/problemset/problem/750/A

//CODE:
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NewYearHurry {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] tokens=br.readLine().split(" ");
        int n=Integer.parseInt(tokens[0]);
        int k=Integer.parseInt(tokens[1]);

        int remTime=240-k;
        int ans=0;
        int left=0;
        int right=n;

        while(left<=right)
        {
            int mid=left+(right-left)/2;

            if(canDoProblems(mid,remTime))
            {
                ans=mid;
                left=mid+1;
            }
            else
                right=mid-1;
        }

        System.out.println(ans);
    }

    private static boolean canDoProblems(int mid, int remTime) {
        int summ=mid*(mid+1)/2;
        summ*=5;
        return summ<=remTime;
    }
}

//TIME COMPLEXITY:O(log(n))
//SPACE COMPLEXITY:O(1)
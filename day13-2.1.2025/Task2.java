//POTD-2024
//-----------
//DAY:13
//DATE:2/12/2025
//TASK2:Next Round
//PROBLEM LINK:https://codeforces.com/problemset/problem/158/A

//CODE:
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NextRound {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] parts = line.split(" ");
        int n=Integer.parseInt(parts[0]);
        int k=Integer.parseInt(parts[1]);
        line = br.readLine();
        parts =line.split(" ");
        int[] scores=new int[n];
        for(int i=0;i<n;i++)
        {
            scores[i]=Integer.parseInt(parts[i]);
        }

        System.out.println(howManyAdvance(n,k,scores));
    }

    private static int howManyAdvance(int n, int k, int[] scores) {
        int count=0;
        int score=scores[k-1];
        for(int i=0;i<n;i++)
        {
            if(scores[i]<=0)
                break;

            if(i<=k-1)
                count++;
            else if(scores[i]==score)
                count++;
            else
                break;
        }
        return count;
    }
}


//TIME COMPLEXITY:O(N)
//SPACE COMPLEXITY:O(N)
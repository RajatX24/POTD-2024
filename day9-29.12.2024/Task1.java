//POTD-2024
//-----------
//DAY:9
//DATE:29/12/2024
//TASK1:Almost Prime
//PROBLEM LINK:https://codeforces.com/problemset/problem/26/A

//CODE:
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class AlmostPrime {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        System.out.println(countAlmostPrimeTill(n));
    }

    static int countAlmostPrimeTill(int n)
    {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(hasExactTwoDistinctPrimeDivisors(i))
                count++;
        }
        return count;
    }

    static boolean hasExactTwoDistinctPrimeDivisors(int x)
    {
        Set<Integer> st=new HashSet<>();
        for(int i=2;i*i<=x;i++)
        {
            if(x%i==0)
            {
                if(isPrime(i))
                {
                    st.add(i);
                    if(st.size()>2)
                        return false;
                }

                if(isPrime(x/i))
                {
                    st.add(x/i);
                    if(st.size()>2)
                        return false;
                }
            }
        }

        return st.size()==2;
    }

    static boolean isPrime(int n)
    {
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
                return false;
        }

        return true;
    }
}

//TIME COMPLEXITY:O(n^2)
//SPACE COMPLEXITY:O(1)
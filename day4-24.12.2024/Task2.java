//POTD-2024
//-----------
//DAY:4
//DATE:24/12/2024
//TASK1:Panagrams
//PROBLEM LINK:https://codeforces.com/problemset/problem/520/A

//CODE:

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Panagrams {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String str=br.readLine();
        if(n<26)
            System.out.println("NO");
        else
            System.out.println(checkPanagram(str));
    }

    static String checkPanagram(String str)
    {
        boolean letters[]=new boolean[26];

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch<=90)
                letters[ch-65]=true;
            else
                letters[ch-97]=true;
        }

        for(boolean b:letters)
        {
            if(!b)
                return "NO";
        }

        return "YES";
    }
}

//TIME COMPLEXITY:O(n)
//SPACE COMPLEXITY:O(1)
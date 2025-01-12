//POTD-2024
//-----------
//DAY:22
//DATE:12/12/2025
//TASK2:Allocate Minimum Pages
//PROBLEM LINK:https://www.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937
//CODE:


// User function Template for Java
import java.util.*;
public class Solution {
    static int sumOfAll(ArrayList<Integer> arr)
    {
        int s=0;
        for (Integer a : arr) {
            s+=a;
        }
        return s;
    }

    static int numberOfStudents(ArrayList<Integer> books,int maxPages)
    {
        int student=1;
        int booksWithCurrentStudent=0;

        for(Integer bookPages:books)
        {
            if(booksWithCurrentStudent+bookPages<=maxPages)
            {
                booksWithCurrentStudent+=bookPages;
            }
            else
            {
                booksWithCurrentStudent=bookPages;
                student+=1;
            }
        }

        return student;
    }

    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        // Write your code here.
        if (m > n)
            return -1;

        int low=Collections.max(arr);
        int high=sumOfAll(arr);

        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int students=numberOfStudents(arr,mid);

            if(students>m)
            {
                low=mid+1;
            }
            else
                high=mid-1;
        }

        return low;
    }
}

//m-max of array
//s-sum of all elements of array
//b-books.length
//TIME COMPLEXITY:O(blog(s-m))
//SPACE COMPLEXITY:O(1)
//POTD-2024
//-----------
//DAY:14
//DATE:3/12/2025
//TASK1:Minimum Platforms
//PROBLEM LINK:https://www.geeksforgeeks.org/problems/minimum-platforms-1587115620/1

//CODE:
class Solution {
    static int findPlatform(int arr[], int dep[]) {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int i=0;
        int j=0;
        int n=arr.length;
        int platforms=0;
        int maxPlatforms=0;
        
        while(i<n && j<n)
        {
            if(arr[i]<=dep[j])
            {
                platforms++;
                i++;
            }
            else
            {
                platforms--;
                j++;
            }
                
            maxPlatforms=Math.max(maxPlatforms,platforms);
        }
        
        return maxPlatforms;
    }
}

//TIME COMPLEXITY:O(NlogN)
//SPACE COMPLEXITY:O(N)
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

class Solution {
    public int findNumbers(int[] nums) {
        int num = 0;
       
        int ans=0;
        for (int i =0;i<nums.length;i++){
             int count=0;
            num = nums[i];
            while(num>0){
                if (num%10 >=0){
                    count++;
                }
                num = num/10;
            }
            if (count % 2==0){
                ans++;
            }
          
        }
    return ans ;
    }}

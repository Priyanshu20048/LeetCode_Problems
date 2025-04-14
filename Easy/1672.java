// https://leetcode.com/problems/richest-customer-wealth/

class Solution {
    public int maximumWealth(int[][] accounts) {
        int [] ans = new int [accounts.length];
        for (int i =0; i <accounts.length;i++){
            int sum =0;
            for (int j =0; j <accounts[i].length;j++){
                  sum += accounts[i][j];

            }
            ans [i] = sum;
        }
            int great = ans[0];
        for (int k =0; k<ans.length;k++){
            if (ans[k]>great){
                great = ans[k];
            }
            
        }
        return great;
        
    }
}
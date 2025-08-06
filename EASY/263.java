// https://leetcode.com/problems/ugly-number/

class Solution {
    public boolean isUgly(int n) {
        if (n <=0){
            return false;
        }
        if (n == 1){
            return true ;
        }
        else {
            for (int i = 0;i<n;i++){
            if (n % 2 ==0){
                n = n/2;
            }
            else if (n%3 ==0){
                n = n /3;
            }
            else if (n%5 == 0 ){
                n = n/5;
            }
            else {
                return false;
            }
        }
        
    }
    return true;
}}
package com.maokg;

public class solution_5 {

    public String longestPalindrome(String s) {

        String ans = "";
        for(int i = 0; i < s.length(); i++){
            int l = i - 1, r = i + 1;
            while( l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
                l --;
                r ++;
            }
            if(ans.length() < r - l - 1){
                ans = s.substring(l + 1, r );
            }
            l = i;
            r = i + 1;
            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
                l --;
                r ++;
            }

            if(ans.length() < r - l - 1){
                ans = s.substring(l + 1, r );
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        solution_5 solution5 = new solution_5();
        System.out.println(solution5.longestPalindrome("cabac"));
    }
}

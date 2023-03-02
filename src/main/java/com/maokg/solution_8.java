package com.maokg;

public class solution_8 {

    public int myAtoi(String s) {
        s = s.strip();
        int begin = 0,end = 0,tag = 0;
        StringBuilder temp = new StringBuilder();
        for(int i = 0; i< s.length();i++){
            if(s.charAt(i)=='+'||s.charAt(i)=='-'){
                temp.append(s.charAt(i));
                begin = i;
                continue;
            }
            if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                if(temp.length()==0){
                    begin = i;
                }
                temp.append(s.charAt(i));
            }else {
                if(temp.length()==0){
                    return 0;
                }
            }
        }
        if(tag==0){
            end = s.length();
        }
        s = s.substring(begin,end);
        if(s.charAt(0)=='-'){
            return 0-Integer.parseInt(s.substring(1,s.length()));
        }else if(s.charAt(0)=='+'){
            return Integer.parseInt(s.substring(1,s.length()));
        }else {
            return Integer.parseInt(s);
        }

    }


    public static void main(String[] args) {
        String s ="words and 987";
        solution_8 solution8 = new solution_8();
        System.out.println(solution8.myAtoi(s));

    }
}

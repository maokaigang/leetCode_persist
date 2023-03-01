package com.maokg;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.BinaryOperator;

public class solution_67 {

    public String addBinary(String a, String b) {
        int[] aa = new int[a.length()];
        int[] bb = new int[b.length()];
        for(int i = a.length()-1;i>=0;i--){
            aa[i] = a.charAt(a.length()-i-1) - '0';
        }
        for(int i = b.length()-1;i>=0;i--){
            bb[i] = b.charAt(b.length()-i-1) - '0';
        }
        StringBuilder str = new StringBuilder();
        int cf = 0;
        int len = aa.length >= bb.length ? bb.length : aa.length;

        for(int i = 0; i <len; i++){
            if(aa[i]+bb[i] + cf  == 1){
                str.append("1");
                cf = 0;
            }else if(aa[i]+bb[i] + cf  == 2){
                str.append("0");
                cf = 1;
            }else if(aa[i]+bb[i] + cf  == 3){
                str.append("1");
                cf = 1;
            }else {
                str.append("0");
                cf = 0;
            }
        }

        if(aa.length == bb.length){
            if(cf == 1){
                str.append("1");
            }
        }else {
            if(cf == 0){
                if(aa.length > len){
                    StringBuilder temp = new StringBuilder(a.substring(0,a.length()-len));
                    temp = temp.reverse();
                    str.append(temp);
                }else {
                    StringBuilder temp = new StringBuilder(b.substring(0,b.length()-len));
                    temp = temp.reverse();
                    str.append(temp);
                }
            }else {
                if(aa.length > len){
                    for(int i = len;i<aa.length;i++){
                        if(aa[i] + cf == 1){
                            cf = 0;
                            str.append("1");
                        }else if(aa[i] + cf == 0){
                            cf = 0;
                            str.append("0");
                        }else {
                            cf = 1;
                            str.append("0");
                        }
                    }
                    if(cf == 1){
                        str.append("1");
                    }
                }else {
                    for(int i = len;i<bb.length;i++){
                        if(bb[i] + cf == 1){
                            cf = 0;
                            str.append("1");
                        }else if(bb[i] + cf == 0){
                            cf = 0;
                            str.append("0");
                        }else {
                            cf = 1;
                            str.append("0");
                        }
                    }
                    if(cf == 1){
                        str.append("1");
                    }

                }
            }
        }


        return  str.reverse().toString();
    }

    public static void main(String[] args) {
        solution_67 solution67 = new solution_67();

        String a = "1010", b = "1011";

        System.out.println(solution67.addBinary(a,b));

    }
}

package com.maokg;

public class solution_43 {

    public String multiply(String num1, String num2) {
        if(num1.equals("0")||num2.equals("0")){
            return "0";
        }
        num1 = new StringBuilder(num1).reverse().toString();
        num2 = new StringBuilder(num2).reverse().toString();
        StringBuilder ans = new StringBuilder();
        int n = num1.length(), m= num2.length();


        return null;
    }

    public static void main(String[] args) {

        solution_43 solution43 = new solution_43();
        String num1 = "123", num2 = "456";
        solution43.multiply(num1,num2);

    }
}

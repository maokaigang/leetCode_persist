package com.maokg;

public class solution_05_02 {

    public String printBin(double num) {
        StringBuilder s = new StringBuilder("0.");
        while(num != 0){
            num = num * 2;
            if(num >= 1){
                num = num -1;
                s.append(1);
            }else if(num < 1){
                s.append(0);
            }
            if(s.length() > 32){
                return "ERROR";
            }
        }
        return s.toString();
    }

    public static void main(String[] args) {
        double num = 0.953125;
        solution_05_02 solution0502 = new solution_05_02();
        System.out.println(solution0502.printBin(num));
    }
}

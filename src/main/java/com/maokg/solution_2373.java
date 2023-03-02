package com.maokg;

public class solution_2373 {

    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] ans = new int[n-2][n-2];
        int[] maxtriI = {-1,-1,-1,0,0,0,1,1,1};
        int[] maxtriJ = {-1,0,1,-1,0,1,-1,0,1};
        int newI = 0, newJ = 0, temp = 0;
        for(int i = 0; i < n - 2; i++){
            for(int j = 0; j < n - 2; j++){
                newI = i + 1; newJ = j + 1; temp = 0;
                for(int k = 0; k < 9; k++){
                    if(grid[newI + maxtriI[k]][newJ + maxtriJ[k]] > temp){
                        temp = grid[newI + maxtriI[k]][newJ + maxtriJ[k]];
                    }
                }
                ans[i][j] = temp;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        solution_2373 solution2373 = new solution_2373();
        solution2373.largestLocal(new int[][]{

        });
    }
}

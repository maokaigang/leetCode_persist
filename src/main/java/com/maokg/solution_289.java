package com.maokg;

public class solution_289 {

    public void gameOfLife(int[][] board) {

        int[] maxtriJ = {-1,0,1,-1,1,-1,0,1};
        int[] maxtriI = {-1,-1,-1,0,0,1,1,1};

        int m = board.length,n = board[0].length;
        int[][] temp =new int[m][n];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                temp[i][j] = board[i][j];
            }
        }
        for(int i = 0;i < m; i++){
            for(int j = 0; j < n; j++){

                if(board[i][j] == 0){
                    int cnt = 0;
                    for(int k = 0;k<8;k++){
                        int newJ = j+maxtriJ[k];
                        int newI = i+maxtriI[k];
                        if(newI>=0&&newI<m&&newJ>=0&&newJ<n){
                            if(board[newI][newJ] == 1){
                                cnt++;
                                //System.out.println(i+","+j+" cnt="+cnt);
                            }
                        }
                    }
                    if(cnt == 3){
                        temp[i][j] =1;
                    }
                }else {
                    int cnt = 0;
                    for(int k = 0;k<8;k++){
                        int newJ = j+maxtriJ[k];
                        int newI = i+maxtriI[k];
                        if(newI>=0&&newI<m&&newJ>=0&&newJ<n){
                            if(board[newI][newJ] == 1){
                                cnt++;
                                //System.out.println(i+","+j+" cnt="+cnt);
                            }
                        }
                    }
                    if(cnt >3||cnt<2){
                        temp[i][j] =0;
                    }
                }
            }
        }
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                board[i][j] = temp[i][j];
            }
        }

    }

    public static void main(String[] args) {
        int[][] board = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        //int[][] board = {{1,1},{1,0}};


    }
}

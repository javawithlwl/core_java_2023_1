package com.careerit.jfs.basics.day8;

public class ArrayExample2 {

  public static void main(String[] args) {
        int[][] arr = new int[][]{
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
              System.out.print(arr[i][j]+" ");
            }
          System.out.println();

        }
    printPattern();
  }
  public static void printPattern(){
        int[][] arr = new int[][]
            {
                {1,1,1,1},
                {1,0,0,1},
                {1,0,0,1},
                {1,1,1,1},
                {1,0,0,1},
                {1,0,0,1},
                {1,0,0,1}
            };
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==1){
                  System.out.print("* ");
                }else{
                  System.out.print("  ");
                }
            }
          System.out.println();
        }
  }
}

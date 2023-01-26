package com.careerit.jfs.basics.day8;

import java.util.Arrays;

public class MedianOfArray {

  public static void main(String[] args) {
    System.out.println(median(new int[]{1,2,3,4,5}));
    System.out.println(median(new int[]{2,3,4,5,6,1}));
    System.out.println(Arrays.toString(columnSum(new int[][]{{1,2,3,4},{1,2,3,4},{2,1,1,1}}))); // [4,5,7,9]
  }

  public static double median(int[] arr) {
    Arrays.sort(arr);
    double res = 0;
    if (arr.length % 2 == 0) {
      res = (arr[arr.length / 2 - 1] + arr[arr.length / 2]) / 2.0;
    } else {
      res = arr[arr.length / 2];
    }
    return res;
  }
  public static int sum(int[][] arr){
      int res = 0;
      for(int i=0;i<arr.length;i++){
          for(int j=0;j<arr[i].length;j++){
              if(i==j){
                  res += arr[i][j];
              }
          }
      }
      return res;
  }
  public static int[] columnSum(int[][] arr){
        int[] res = new int[arr[0].length];
        int c = 0;
        for(int i=0;i<arr[0].length;i++){
          int sum = 0;
          for(int j=0;j<arr.length;j++){
               sum += arr[j][i];
          }
          res[c++] = sum;
        }
        return res;
  }
  public static int[] rowSum(int[][] arr) {
      return null;
  }
}

package com.company;

public class SummeGegendiagonale {
    public static void main(String[] args) {
        System.out.println(summeGegendiagonale(new int[][]{{1,2,3,4},{5,6,7,8},{9,1,2,3},{4,5,6,7}}));
    }

    public static int summeGegendiagonale(int [][] arr){
        int summe=0;
        for(int i=0;i<arr.length;i++){
                summe=summe+arr[i][arr.length-1-i];
            }
        return summe;
    }
}

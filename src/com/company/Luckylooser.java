package com.company;

import java.util.Arrays;

public class Luckylooser {
    public static void main(String[] args) {
        String[] arr1={"Sam", "Jack","Robert","Ken"};
        String[] arr2={"Sam","Jack","Ken"};
        System.out.println(Arrays.toString(luckyLooserList(arr1, arr2)));
    }
    public static String[] luckyLooserList(String[] arr1, String[] arr2){
        int len=arr1.length;
        if(arr1.length<arr2.length){
            len=arr2.length;
        }
        String[] arr3=new String[len];
        boolean found=false;
        int k=0;
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length && !found;j++){
                if(arr1[i]==arr2[j]){
                    found=true;
                    arr3[k]=arr1[i];
                    k++;
                }
            }

            found=false;
            }

        return arr3;

    }
}

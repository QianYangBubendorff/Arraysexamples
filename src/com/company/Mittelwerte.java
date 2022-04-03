package com.company;

import java.util.Arrays;

public class Mittelwerte {
    public static void main(String[] args) {
        double[][] double1= {{1.0,2.0,3.0},{1.0,2.0,3.0,4.0}};
        System.out.println(Arrays.toString(mittelwerteArrays(double1)));
    }
    public static double[] mittelwerteArrays(double[][] arrs){
        double[] arr1=new double[arrs.length];
        double mittewerte=0;
        for(int i=0; i<arrs.length;i++){
            double summe=0;
            for(int j=0;j<arrs[i].length;j++){
                summe=summe+arrs[i][j];
                mittewerte=summe/arrs[i].length;
                arr1[i]=mittewerte;
            }
        }

        return arr1;
    }
}

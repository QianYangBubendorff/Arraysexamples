package com.company;

import java.util.Arrays;

public class Smartphonesales {
    public static void main(String[] args) {
        int[][] resultArray = {{9, 50}, {2, 40}, {3, 50}, {3, 50}, {4, 70}, {1, 50}, {2, 40}, {3, 50}, {3, 50}, {4, 70}, {5, 50}, {6, 40}, {3, 50}, {5, 50}, {6, 70}, {7, 50}, {8, 40}, {9, 50}, {7, 50}};
        System.out.print(Arrays.deepToString(smartphoneSales(resultArray)));
    }

    public static int[][] smartphoneSales(int[][] arr) {

        int lange=0;
        for(int i=1; i<arr.length;i++){
            lange=arr[0][0];
            if(lange<arr[i][0]){
                lange=arr[i][0];
            }
        }
        int[][] resultArray = new int[lange][2];

//        method 1

//        for (int model = 1; model <= lange; model++) {
//            resultArray[model - 1][0] = model;
//            for (int i = 0; i < arr.length; i++) {
//                if (model == arr[i][0]) {
//                    resultArray[model - 1][1] = arr[i][1] + resultArray[model - 1][1];
//                }
//            }
//        }

//        method 2 with only one loop


        for(int i = 0;i <arr.length;i++) {
            resultArray[arr[i][0]-1][0] = arr[i][0];
            resultArray[arr[i][0]-1][1] = resultArray[arr[i][0]-1][1] + arr[i][1];
        }

        return resultArray;

    }

}

package lesson3;

import java.util.Random;

public class HomeWorkApp {

    public static void main(String[] args) {

        invertArr();
        fillArr();
        diagFillArray();
        System.out.println(arrLen(7, 7));
        maxMinArr();


    }

    public static void invertArr() {
        int arr[] = {0, 1, 1, 1, 0, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
        }
    }

    public static void fillArr() {
        int arr[] = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
    }

    public static void changeNumArr() {
        int arr[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
    }

    public static void diagFillArray() {
        int arr[][] = new int[4][4];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = rand.nextInt(100);
                }
            }

        }
        for (int k=0;k< arr.length; k++) {
            for (int n=0; n< arr.length; n++) {
                if ((k+n)%2==0) {
                    arr[k][n]=1;
                }
            }
        }
    }

    public static int[] arrLen(int len, int initialValue) {
        int arr[]=new int[len];
        for (int i=0; i< arr.length; i++) {
            arr[i]=initialValue;
        }
        return arr;
    }

    public static void maxMinArr() {
        int arr[]={10, 89, -7, 0, 11, 666, -8};
        int max=0;
        int min=0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i]< min) {
                min=arr[i];
            }
            if (arr[i]>max) {
                max=arr[i];
            }
        }
    }


}

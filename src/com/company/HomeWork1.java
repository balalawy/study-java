package com.company;
import java.util.Scanner;
public class HomeWork1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入数组中的长度：");
            int a = sc.nextInt();
            int [] arr = new int[a];
            for (int i = 0; i <arr.length ; i++) {
                System.out.println("请输入数组中第"+(i+1)+"个数字");
                arr[i] = sc.nextInt();
            }
            changeArr(arr);
            String str ="";
            for (int i = 0; i <arr.length ; i++) {
                str += arr[i]+" ";
            }
            System.out.println("调换后的数组为："+str);
        }


        public static int[] changeArr(int []arr){
            for (int i = 0; i <arr.length/2 ; i++) {
                int temp = arr[i];
                arr[i] = arr[arr.length-i-1];
                arr[arr.length-i-1]=temp;
            }
            return arr ;
        }
    }


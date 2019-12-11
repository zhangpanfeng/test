package com.darren.test;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {

        byte[] b = intToByteArray(10000000);
        System.out.println(Arrays.toString(b));
        
        binaryToDecimal(10);
    }

    public static void test(int a) {
        System.out.println(a);
    }

    public static void test1(byte[] a) {
        System.out.println(Arrays.toString(a));
    }

    public static byte[] intToByteArray(int i) {
        byte[] result = new byte[4];
        // 由高位到低位
        result[0] = (byte) ((i >> 24) & 0xFF);
        result[1] = (byte) ((i >> 16) & 0xFF);
        result[2] = (byte) ((i >> 8) & 0xFF);
        result[3] = (byte) (i & 0xFF);

        return result;
    }
    
    public static void binaryToDecimal(int n){
              for(int i = 31;i >= 0; i--)
                  System.out.print(n >>> i & 1);
         }
}

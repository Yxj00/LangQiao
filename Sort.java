package Tjise.LangQiao.day06;

import java.util.Arrays;
import java.util.Scanner;

/**
 *根据冒泡排序 找出交换100次的最小的字符串
 */
public class Sort {
    public static void main(String[] args) {
//        String a="lan";abcdefghijklmn
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        char[] c=a.toCharArray();
        char tem='0';
        int count=0;
        for (int i = 0; i < c.length-1; i++) {
            for (int j = 0; j < c.length-1-i; j++) {
                if (c[j]>c[j+1]){
                    tem=c[j];
                    c[j]=c[j+1];
                    c[j+1]=tem;
                    count++;
                }
            }
        }

        String s = new String(c);
        System.out.println(s);
        System.out.println(count);
    }
}

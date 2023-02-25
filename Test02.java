package Tjise.LangQiao.day01;

import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Test02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 在此输入您的代码...
        int n = scan.nextInt();// 表示考试人数
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int b = scan.nextInt();
            arr[i] = b;
        }
        int max = arr[0], min = arr[0];
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            sum += arr[i] * 1.0;
        }
        double aver = sum / n;
        System.out.println(max);
        System.out.println(min);
        System.out.println(aver);
        scan.close();
    }
}

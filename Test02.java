package Tjise.LangQiao.day01;

import java.util.Scanner;
// 1:����package
// 2: ��������Main, �����޸�

public class Test02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // �ڴ��������Ĵ���...
        int n = scan.nextInt();// ��ʾ��������
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

package Tjise.LangQiao.day03;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class PaoBu {
    public static void main(String[] args) {
//        Calendar instance = Calendar.getInstance();
//        instance.set(2000, 0, 1);
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("������ѧ������:");
//        int N= scan.nextInt();
//        int[] arr=new int[N];
//        for (int i = 1; i <= N; i++) {
//            System.out.print("�������"+i+"��ѧ���ɼ�:");
//            int score=scan.nextInt();
//            arr[i-1]=score;
//        }
//        Arrays.sort(arr);
//        System.out.println("��߳ɼ�:"+arr[N-1]);
//        System.out.println("��ͳɼ�:"+arr[0]);
//
//        int[] arr={0,31,28,31,30,31,30,31,31,30,31,30,31};
//        int month=0,day=1,week=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("�����������ĳɼ���");
        int score = scan.nextInt();
        System.out.print("���������������ֳɼ�:");
        int yscore = scan.nextInt();
        if (score > 90 && yscore > 80 || score == 100 && yscore > 70) {
            System.out.println("��ϲ�㣬����һ����Ƴ���");
        }
    }
}

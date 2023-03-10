package aboutObject01.object02.march9th;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String s="ABCDEF";
//        int i=Integer.parseInt(s,16);
//        System.out.printf("%d",i);
//
        /**
         * excel 列名称
         */
        Scanner sc = new Scanner(System.in);
        int col=sc.nextInt();
        StringBuffer str = new StringBuffer();
        while (col>0){
            col--;
            str.append((char)(col%26+'A'));
            col/=26;
        }
        System.out.println(str.reverse().toString());
        /**
         * 给定一天是一周中的哪天，请问 n 天后是一周中的哪天
         */
//        Scanner sc = new Scanner(System.in);
//        int w= sc.nextInt();
//        int n= sc.nextInt();
//        int z=(w+n)%7;
//        if (z==0)z=7;// 要细节
//        System.out.println(z);
//        sc.close();
        /**
         * 清除水草
         * 差分矩阵(懵懵的)
         */
//        Scanner sc = new Scanner(System.in);
//        int n= sc.nextInt();
//        int m= sc.nextInt();
//        int t= sc.nextInt();
//        int[][] a = new int[n+10][m+10];
//        while (t-->0){
//            int r1= sc.nextInt();
//            int c1= sc.nextInt();
//            int r2= sc.nextInt();
//            int c2= sc.nextInt();
//            a[r1][c1]++;
//            a[r2+1][c1]--;
//            a[r1][c2+1]--;
//            a[r2+1][c2+1]++;
//        }
//        int count=0;
//        for (int i = 1; i <=n; i++) {
//            for (int j = 1; j <=m ; j++) {
//                a[i][j]+=a[i-1][j]+a[i][j-1]-a[i-1][j-1];
//                if (a[i][j]==0)count++;
//            }
//        }
//        System.out.println(count);
    }
}

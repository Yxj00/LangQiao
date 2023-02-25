package Tjise.LangQiao.day02;

import java.util.Scanner;

public class HuiWen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        huiwenriqi(data);
        ABhuiwenriqi(data);
        sc.close();
    }
    public static void huiwenriqi(int n) {
        for (int i = n+1; i <= 89991231; i++) {
            String str = i+"";
            char[] ch = str.toCharArray();
            char a = ch[0], b = ch[1], c = ch[2], d = ch[3],e = ch[4],f = ch[5],g = ch[6],h = ch[7];
            if(a==h&&b==g&&c==f&&d==e) {
                System.out.println(ch);
                break;
            }
        }
    }
    public static void ABhuiwenriqi(int n) {
        for (int i = n+1; i <= 89991231; i++) {
            String str = i+"";
            char[] ch = str.toCharArray();
            char a = ch[0], b = ch[1], c = ch[2], d = ch[3],e = ch[4],f = ch[5],g = ch[6],h = ch[7];
            if(a==c&&c==f&&f==h&&b==d&&d==e&&e==g) {
                System.out.println(ch);
                break;
            }
        }

    }
}

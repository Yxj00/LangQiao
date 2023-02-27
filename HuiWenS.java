package Tjise.LangQiao.day06;

public class HuiWenS {
    public static void main(String[] args) {
        System.out.println(isPalindrome(20211202));
    }
    public static boolean isPalindrome(int x) {
        if(x<0)return false;
        else{
            String s=x+"";
            char[] c=s.toCharArray();
            int c1=c.length;
            for (int i = 0; i < c.length; i++) {
                c[i]=c[--c1];
            }
            String s1 = new String(c);
            if (s1.equals(s))return true;
        }
        return false;
    }


}

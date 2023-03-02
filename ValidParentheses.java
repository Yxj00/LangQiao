package Tjise.LangQiao.day07;

/**
 * ����һ��ֻ���� '('��')'��'{'��'}'��'['��']'���ַ��� s ���ж��ַ����Ƿ���Ч��
 *
 * ��Ч�ַ��������㣺
 *
 * �����ű�������ͬ���͵������űպϡ�
 * �����ű�������ȷ��˳��պϡ�
 * ÿ�������Ŷ���һ����Ӧ����ͬ���͵������š�
 *
 * ��Դ�����ۣ�LeetCode��
 * ���ӣ�https://leetcode.cn/problems/valid-parentheses
 * ����Ȩ������������С���ҵת������ϵ�ٷ���Ȩ������ҵת����ע��������
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        char[] arr=s.toCharArray();
        int index=-1;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(index>=0&&((arr[index]=='{'&&c=='}')||(arr[index]=='('&&c==')')||(arr[index]=='['&&c==']'))){
                index--;
            }else{
                if(c=='}'||c==']'||c==')'){
                    return false;
                }
                index++;
                arr[index]=c;
            }
        }
        return index<0;
    }
}

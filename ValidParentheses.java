package Tjise.LangQiao.day07;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']'的字符串 s ，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 每个右括号都有一个对应的相同类型的左括号。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
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

package Tjise.LangQiao.day05;



/**
 * 1 2 6 7 15
 * 3 5 8 14
 * 4 9 13
 * 10 12
 * 11
 * ��֪�ڶ��еڶ��е�����5
 * ���20�е�20�е���
 */
public class SerpentineFilling {
    static int[][] arr=new int[80][80];
    static int i=1,j=1;//��������
    static int result=1;
    public static void main(String[] args) {
        arr[1][1]=1;
        leftXia();
        System.out.println(arr[20][20]);
    }
    static void leftXia(){
        if (i==40||j==40){
            return;
        }
        j++;
        arr[i][j]=++result;
        while (j!=1){
            i++;
            j--;
            arr[i][j]=++result;
        }
        rightShang();
    }

    /**
     * ��������
     */
    static void rightShang(){
        if (i==40||j==40){
            return;
        }
       i++;
        arr[i][j]=++result;
        while (i!=1){
            i--;
            j++;
            arr[i][j]=++result;
        }
        leftXia();
    }
}

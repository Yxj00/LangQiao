package Tjise.LangQiao.day05;



/**
 * 1 2 6 7 15
 * 3 5 8 14
 * 4 9 13
 * 10 12
 * 11
 * 已知第二行第二列的数是5
 * 求第20行第20列的数
 */
public class SerpentineFilling {
    static int[][] arr=new int[80][80];
    static int i=1,j=1;//控制走向
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
     * 向右上走
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

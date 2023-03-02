package Tjise.datastructure;

/**
 * ���ֲ���
 * ����һ�����������һ��Ŀ��ֵ�����������ҵ�Ŀ��ֵ����������������
 * ���Ŀ��ֵ�������������У����������ᱻ��˳������λ�á�
 */
public class BinarySearch {
    public static int searchInsert(int[] nums,int target){
        int i=0,j= nums.length;//j�Ǳ߽�
        while (i<j){
            int m=(i+j)>>>1;// mȡ�м�ֵ  ʹ���޷������� ��ֹmֵ���
            if (nums[m]==target)return m;
            else if (target<nums[m])j=m; //��С�߽�
            else i=m+1;
        }
        return j; // ����û���ҵ�target  ���������ᱻ��˳������λ��
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5,6};
        int target1=5;
        int target2=2;
        int target3=7;
        System.out.println(searchInsert(nums,target1));
        System.out.println(searchInsert(nums,target2));
        System.out.println(searchInsert(nums,target3));
    }
}

package Tjise.datastructure;

/**
 * 二分查找
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
 * 如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 */
public class BinarySearch {
    public static int searchInsert(int[] nums,int target){
        int i=0,j= nums.length;//j是边界
        while (i<j){
            int m=(i+j)>>>1;// m取中间值  使用无符号右移 防止m值溢出
            if (nums[m]==target)return m;
            else if (target<nums[m])j=m; //缩小边界
            else i=m+1;
        }
        return j; // 这是没有找到target  返回它将会被按顺序插入的位置
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

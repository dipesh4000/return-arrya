import java.util.Arrays;
public class Search {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        System.out.println(searchInsert(arr,5));
        System.out.println(searchInsert(arr,2));
        System.out.println(searchInsert(arr,7));}
    public static int searchInsert(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        if(nums[s] > target){
            return 0;
        }
        if(nums[e] < target){
            return nums.length;
        }
        while(e >= s){
            int m = s + (e-s)/2;
            if (nums[m] == target) return m;
            else if(nums[m] > target) e = m-1;
            else if( nums[m] < target ) s = m +1;
        }
        return s;
    }
}































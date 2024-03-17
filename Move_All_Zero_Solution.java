import java.util.Arrays;

public class Move_All_Zero_Solution {
    
        public static void moveZeroes(int[] nums) {
            int start=0;
            int end=0;
            while(end<nums.length){
                if(nums[end]!=0){
                    int temp=nums[start];
                    nums[start]=nums[end];
                    nums[end]=temp;
                    start++;
                }
                end++;
            }
        }
    public static void main(String[] args) {
        int arr[]={1,2,0,9,8,7};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}

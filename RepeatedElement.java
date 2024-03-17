public class RepeatedElement {

        public static int singleNumber(int[] nums) {
            int sum=0;
            for(int i=0;i<nums.length;i++){
                sum^=nums[i];
            }
            return sum;
        }
    
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,4,4,5,5};
        System.out.println(singleNumber(arr));
    }
    
}

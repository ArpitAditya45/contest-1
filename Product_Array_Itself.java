import java.util.Arrays;

public class Product_Array_Itself {
        public static int[] productExceptSelf(int[] nums) {
            int ans[]=new int[nums.length];
            int prefix=1;
            int suffix=1;
            int i=0;
            int j=nums.length-1;
            for(int p=0;p<nums.length;p++){
                ans[p]=1;
            }
            while(j>=0 && i<nums.length){
                ans[i]=ans[i]*suffix;//calculating suffix
                ans[j]=ans[j]*prefix;//calculating prefix
                prefix=prefix*nums[j];//multiplying prefix with suffix
                suffix=suffix*nums[i];//multiplying suffix with prefix
                i++;
                j--;
    
            }
            return ans;
        }
        public static void main(String[] args) {
            int arr[]={1,2,3,5,6,7};
            System.out.println(Arrays.toString(productExceptSelf(arr)));
        }
    }
    


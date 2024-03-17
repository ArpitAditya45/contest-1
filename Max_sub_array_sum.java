import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Max_sub_array_sum {
    public static int maxLen(int arr[], int n)
    {
        Map<Integer,Integer>map=new HashMap<>();
        int sum=0;
        int max=0;
        map.put(0,-1);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(map.containsKey(sum)){
                max=Math.max(i-map.get(sum),max);
            }else{
                map.put(sum,i);
            }
        }
        return max;
        
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            System.out.println(maxLen(arr, n));
    }
}

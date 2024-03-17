import java.util.Scanner;

public class PowerSum_Solution{
    public static int func(int pow, int sum ,int idx){
        if(sum==0){
            return 1;
        }
        if(sum<0){
            return 0;
        }
        if(idx>=1000){
            return 0;
        }
        int take=0;
        int not_take=func(pow,sum,idx+1);
        if((int)Math.pow(idx,pow)<=sum){
            take=func(pow,sum-(int)Math.pow(idx,pow),idx+1);
        }
        return take+not_take;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(func(n, x, 1));
    }
}
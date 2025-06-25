
//Wap to find if a number is a circular prime 
import java.util.Scanner;
class circular_prime{
    static int isprime(int n){
        int k=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                k++;
            }
        }
        if(k==2)
        return 1;
        else 
        return 0;
    }
    static boolean isCircular(int x){
        int d=x;
        int digit=0;
        for(int i=d;i>0;i/=10){
            digit++;
        }
        while(isprime(d)==1){
            int lnum=d%10;
            int fnum=d/10;
            d=(lnum*(int)Math.pow(10,digit-1))+fnum;
            if(d==x){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        if(isCircular(num)){
            System.out.println("Circular prime");
        }
        else
        System.out.println("Not a circular prime");
    }
}
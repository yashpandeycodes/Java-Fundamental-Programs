
//WAP to check if a number is a happy number or not
//A happy no.is one whose sum of squares of its digit is 1
import java.util.Scanner;
class Happy{
    static int n;
    static int sq;
    static int sum_sq_digit(int n){
        if(n==1){
            sq=1;
        }
        while(n>9){
            sq=0;
         while(n>0){
            int d=n%10;
            sq=sq+(d*d);
            n/=10;
        }
        n=sq;
    }
        return n;
    }
    static void isHappy(){
        if(sum_sq_digit(n)==1){
            System.out.println("Happy number");
        }
        else
        System.out.println("Not a Happy number");
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        Happy obj=new Happy();
        obj.isHappy();
        
    }
}
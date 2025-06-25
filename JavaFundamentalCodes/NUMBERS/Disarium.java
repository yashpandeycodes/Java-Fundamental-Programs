
//WAP to check if a number is diarium or not
//A disarium no.is one which is equal to the sum of its digit
//raised to the power of their respective position
import java.util.Scanner;
class Disarium{
    static int num;
    static int size;
     Disarium(int nn){
       num=nn;
      
    }
    static int countDigit(int n){
    String s=Integer.toString(num);
    int l=s.length();
    return l;
    }
    static int sumofDigits(int n){
        int dig=countDigit(n);
        if(n==0)
        return 0;
        else{
            return (int)Math.pow(n%10,dig)+sumofDigits(n/10);
        }
    }
    static void check(int n){
        int s=sumofDigits(n);
        if(n==s){
            
            System.out.println("Disarium");
        }
            else
            System.out.println("Not Disarium");
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int n=num;
        Disarium obj=new Disarium(num);
        obj.check(n);
    }
}
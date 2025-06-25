
//WAP to find gcd of two entered numbers
import java.util.Scanner;
class gcd{
    static int d=0;
    static int hcf(int n,int p){
        if(p==0){
           return n; 
        }
        return hcf(p,n%p);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        gcd obj=new gcd();
        if(num1>num2){
            System.out.println("The hcf is "+hcf(num1,num2));
        }
        else{
            System.out.println("The hcf is "+hcf(num2,num1));
        }
    }
}
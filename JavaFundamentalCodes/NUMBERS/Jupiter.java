
//WAP to find if a number is a jupiter number
import java.util.Scanner;
class Jupiter{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int dig=0;
        for(int i=num;i>0;i/=10){
            dig++;
        }
        int last=num%10;
        int start=num/(int)Math.pow(10,dig-1);
        int sum=start+last;
        if(num%sum==0){
            System.out.println("Jupiter number");
        }
        else 
        System.out.println("Not a jupiter number");
    }
}
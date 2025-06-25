import java.util.Scanner;
class Kaprekar{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int sq=n*n;
        int dig=0;
        for(int i=n;i>0;i/=10){
            dig++;
        }
        int q=sq/(int)Math.pow(10,dig);
        int r=sq%(int)Math.pow(10,dig);
        if((q+r)==n)
        System.out.println("Kaprekar");
        else
        System.out.println("Not a Kaprekar");
    }
}
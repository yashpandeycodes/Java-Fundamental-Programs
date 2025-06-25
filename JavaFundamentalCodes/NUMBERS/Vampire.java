
//WAP to find if a number is a vampire number
import java.util.Scanner;
class Vampire{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int c=0;
        int f=0;
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int num=n;
        for(int i=num;i>0;i/=10){
            c++;
        }
        if(c%2!=0){
            f=1;
        }
        else{
            int j;int k;
            int x=(int)Math.pow(10,c/2-1);
            int y=(int)Math.pow(10,c/2);
            for(int i=x;i<y;i++){
                if(num%i==0){
                 j=num/i;
                 if((j>x&&j<y)){
                     k=i*j;
                     if(k==n){
                         f=0;
                         break;
                     }
                     else
                     f=1;
                 }
                 
                }
                else
                f=1;
            }
        }
        if(f==1)
        System.out.println("Not a vampire");
        else
        System.out.println("Vampire");

                 
}
}

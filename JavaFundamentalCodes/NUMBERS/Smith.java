
//WAP to check if a number is a smith number
//A smith no. is one whose sum of digit is equal to the sum of its prime factorw
import java.util.Scanner;
class Smith{
    static int n;
    static void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
    }
    static int isPrime(int n){
        int flag=1;
        int t=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                t++;
                break;
            }
        }
        if(t!=0){
            flag=0;
        }
        return flag;
    }
    static int sum_of_dig(int n){
        int s=0;
        while(n>0){
            int d=n%10;
            s=s+d;
            n/=10;
        }
        return s;
    }
    static int sum_of_prime_fac(int n){
        int sum=0;
        int k=2;
        while(n>1){
            if((isPrime(k)==1)&&(n%k==0)){
                sum=sum+(sum_of_dig(k));
                n=n/k;
            }
            else{
                k++;
            }
        }
        return sum;
    }
    static void isSmith(){
        if((sum_of_dig(n))==(sum_of_prime_fac(n))){
         System.out.println("Smith number");   
        }
        else{
        System.out.println("Not a Smith number");
    }
    }
public static void main(String args[]){
    Smith obj=new Smith();
    obj.accept();
    obj.isSmith();
}
}
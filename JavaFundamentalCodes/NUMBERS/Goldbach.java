
//WAP to check if a number is a goldbach number
//and also print the odd prime pairs of number
import java.util.Scanner;
class Goldbach{
    static boolean isPrime(int x){
        int k=0;
        for(int i=1;i<=x;i++){
            if(x%i==0){
                k++;
            }
        }
        if(k==2){
            return true;
        }
        else
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int x=sc.nextInt();
        
        int b=0;
        if(x<3||x>99||x%2!=0){
            System.out.println("Invalid input");
        }
        else{
            for(int i=3;i<=x/2;i++){
            b=x-i;
            if(isPrime(i)&&isPrime(b)&&(i%2!=0)&&(b%2!=0)){
                System.out.println("Prime pairs are:"+i+"+"+b);
            }
            
        }
    }
}
}
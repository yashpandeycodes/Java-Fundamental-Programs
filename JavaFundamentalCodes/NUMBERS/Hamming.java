import java.util.Scanner;
class Hamming{
   static boolean isPrime(int n){
        int k=2;
        if(n==k)
        return true;
        else{
            if(n%k==0)
            return false;
            else{
                k=k+1;
                return isPrime(n);
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        boolean flag=true;
        for(int i=2;i<=num;i++){
            if(num%i==0 && isPrime(num)){
                if(i!=2&& i!=3&& i!=5){
                    flag=false;
                    break;
                }
            }
        }
        if(flag==true)
        System.out.println("Hamming number");
        else
        System.out.println("Not a hamming number");
    }
}
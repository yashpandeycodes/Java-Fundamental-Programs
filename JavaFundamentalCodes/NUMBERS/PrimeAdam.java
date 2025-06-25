
//To print all the prime adam no. b/w the entered range
//A Prime Adam is a no.whose square and the square of its reverse 
//are reverse of each other
import java.util.Scanner;
class PrimeAdam{
    static int prime(int num){
        int temp=0;
        for(int k=1;k<=num;k++){
           if(num%k==0){
               temp++;
           }
        }
        if(temp==2){
        return 1;
    }
        else{
        return 0;
    }
    }
    static int reverse(int n){
        int remp=0;
        while(n>0){
            remp=remp*10+(n%10);
            n/=10;
        }
        return remp;
    }
    static int adam(int num){
        int n=num;
        int rev=reverse(num);
        int reversen=rev*rev;
        int sqrt=n*n;
        if(sqrt==reverse(reversen)){
            return 1;
        }
        else {
        return 0;
    }
    }
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the lower limit");
       int lm=sc.nextInt();
       System.out.println("Enter the upper limit");
       int ul=sc.nextInt();
       for(int j=lm;j<=ul;j++){
           if(prime(j)==1 && adam(j)==1){
               System.out.println(+j+" is prime adam");
           }
           else
           System.out.println(+j+" is not prime adam");
       }
    }
}
       
       
       
    

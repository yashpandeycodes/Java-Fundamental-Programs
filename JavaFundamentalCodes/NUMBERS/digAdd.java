import java.util.Scanner;
class digAdd{
    static long digSum(long n){
        long sum=0;
        while(n>0){
            sum=sum+(n%10);
            n/=10;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of M");
        int M=sc.nextInt();
        System.out.println("Enter value of N");
        int N=sc.nextInt();
        if(M>99 && M<10000 && N<100){
            long i=(long)M;
            while(digSum(i)!=N){
               i++; 
            }
            System.out.println("The smallest no.whose digit sum="+N+"is:"+i);
            int dig=0;
            while(i>0){
                i/=10;
                ++dig;
            }
            System.out.println("The number of digits are:"+dig);
        }
        else
        System.out.println("INVALID");
        
    }
}
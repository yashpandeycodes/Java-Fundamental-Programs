import java.util.Scanner;
class Keith{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int N=sc.nextInt();
        int temp=N;
        int dig=0;
        for(int i=N;i>0;i/=10){
            dig++;
        }
        int A[]=new int[dig];
        for(int i=dig-1;i>=0;i--){
            A[i]=temp%10;
            temp/=10;
        }
        int Sum=0;
        while(N>Sum){
            Sum=A[0];
            for(int i=0;i<dig-1;i++){
                A[i]=A[i+1];
            
            Sum+=A[i];
        }
        A[dig-1]=Sum;
        }
        if(Sum==N)
        System.out.println("Keith number");
        else
        System.out.println("Not a keith number");
    }
}
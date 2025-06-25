
//WAP to find the freqency of each number in an array
import java.util.Scanner;
class num_freq{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int A[]=new int[10];
        System.out.println("Enter 10 numbers");
        for(int i=0;i<10;i++){
            A[i]=sc.nextInt();
        }
        int largest=A[0];
        for(int i=0;i<10;i++){
            if(largest<A[i]){
                largest=A[i];
            }
        }
        int c=0;
        for(int i=0;i<=largest;i++){
            for(int j=0;j<10;j++){
                if(A[j]==i){
                    c++;
                }
            }
            if(c>0){
                System.out.println(+i+":"+c);
            }
            c=0;
        }
    }
}

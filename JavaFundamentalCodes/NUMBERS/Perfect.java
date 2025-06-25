
//To check if a no. is a perfect no.or not
//A number which is equal to the sum of its factors is a perfect no.
import java.util.Scanner;
class Perfect{
    int num;
    int f;
    Perfect(int nn){
        num=nn;
        f=1;
    }
    int SumOfFactors(int i){
       if(i==f)
       return 0;
       else if(i%f==0){
           return f++ + SumOfFactors(i);
       }
       else{
           f++;
           return SumOfFactors(i);
       }
    }
    void check(){
        if(num==SumOfFactors(num)){
            System.out.println(num+" is a perfect number");
        }
        else{
            System.out.println(num+" is not a perfect number");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        Perfect obj=new Perfect(num);
        obj.check();
    }
}

//WAP to check if a number is a armstrong no.or not
//An armstrong no.is one which is equal to sum of its digit
//raised to the power of the size of number
import java.util.Scanner;
class ArmNum{
    int n;
    int l;
    ArmNum(int num){
        n=num;
        l=0;
        for(int i=n;i!=0;i/=10){
            l++;
        }
    }
    int sum_pow(int i){
        if(i==0){
            return 0;
        }
        else if(i<10){
            return (int)Math.pow(i,l);
        }
        else{
        return (int)Math.pow(i%10,l) + sum_pow(i/10);
    }
    }
    void isArmStrong(){
        if(n==(sum_pow(n))){
            System.out.println("ARMSTRONG NUMBER");
        }
        else{
        System.out.println("Not a ARMSTRONG NUMBER");
    }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        ArmNum obj=new ArmNum(num);
        obj.isArmStrong();
    }
}

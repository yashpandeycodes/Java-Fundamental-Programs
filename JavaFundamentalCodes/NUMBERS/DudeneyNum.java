import java.util.Scanner;
class NumDude{
    int num;
    NumDude(){
        num=0;
    }
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();
    }
    int SumDigits(int x){
        if(x==0)
        return 0;
        else{
            return x%10 + SumDigits(x/10);
        }
    }
    void isDude(){
        int x=SumDigits(num);
        int y=(int)Math.pow(x,3);
        if(y==num)
        System.out.println("Dudeney number");
        else
        System.out.println("Not a Dudeney number");
    }
    public static void main(String args[]){
        NumDude obj=new NumDude();
        obj.input();
        obj.isDude();
    }
}
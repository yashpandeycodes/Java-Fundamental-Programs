import java.util.Scanner;
class fibonacci{
    int m;
    fibonacci(){
        m=0;
    }
    void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value ");
        m=sc.nextInt();
    }
    int fibo(int n){
        if(n==1||n==0)
        return 0;
        else if(n==2)
        return 1;
        else{
            return fibo(n-1)+fibo(n-2);
        }
    }
    void check(){
        int c=1;int f=0;
        while(m>=f){
            f=fibo(c);
            if(f==m){
                System.out.println("THE NUMBER IS A PART OF FIBONACCI SERIES");
                System.out.println("The position is:"+c);
                return;
            }
            else{
                c++;
            }
        }
        System.out.println("DO NOT BELONG TO FIBONACCI SERIES");
        return;
        
    }
    public static void main(String args[]){
        fibonacci obj=new fibonacci();
        obj.accept();
        obj.check();
    }
}
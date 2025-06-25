import java.util.Scanner;
class Emrip{
    int n,rev,f;
    Emrip(int nn){
        n=nn;
        rev=0;
        f=2;
    }
    int isprime(int x){
        if(f==x)
        return 1;
        else{
            if(x%f==0||x<2)
            return 0;
            else{
                f=f+1;
                return isprime(x);
            }
            
        }
    }
    int reverse(int x){
        if(x==0)
        return rev;
        else{
        rev=(rev*10) + (x%10);
        return reverse(x/10);
    }
    }
    void isEmrip(){
        if(isprime(n)==1&&isprime(rev)==1)
        System.out.println("Emrip");
        else
        System.out.println("Not emrip");
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        Emrip obj=new Emrip(num);
        obj.reverse(num);
        obj.isEmrip();
    }

}
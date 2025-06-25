import java.util.Scanner;
class calcSeries{
    int x;
    int n;
    int sum;
    calcSeries(){
        n=0;
        x=0;
        sum=0;
    }
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        x=sc.nextInt();
        System.out.println("Enter the power");
        n=sc.nextInt();
    }
    int power(int p,int q){
        if(q==0)
        return 1;
        else{
            return p*power(p,q-1);   //recursion
        }
    }
    void cal(){
        for(int i=0;i<=n;i++){
            sum+=power(x,i);
        }
        System.out.println("The sum of the series is "+sum);
    }
    public static void main(String args[]){
        calcSeries obj=new calcSeries();
        obj.input();
        obj.cal();
    }
}
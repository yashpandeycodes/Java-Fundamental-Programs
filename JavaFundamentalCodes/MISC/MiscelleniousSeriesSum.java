import java.util.Scanner;
class SeriesSum{
    int x;
    int n;
    double sum;
    SeriesSum(int xx,int nn){
        x=xx;
        n=nn;
        sum=0.0;
    }
    double findfact(int m){
        if(m==1)
        return 1.00;
        else{
            return (double)m * findfact(m-1);
        }
    }
    double findpower(int x,int y){
        if(y==0)
        return 1;
        else{
            return (double)x*findpower(x,y-1);
        }
    }
    void calculate(){
        for(int i=2;i<=n;i+=2){
            sum+=(findpower(x,i)/findfact(i-1));
        }
    }
    void display(){
        System.out.println("The sum of series is "+sum);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int nn=sc.nextInt();
        System.out.println("Enter the number of terms");
        int ss=sc.nextInt();
        SeriesSum obj=new SeriesSum(nn,ss);
        obj.calculate();
        obj.display();
    }
}
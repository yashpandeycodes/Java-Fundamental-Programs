import java.util.Scanner;
class box{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in); 
        System.out.println("Emter the number of boxes");
        int X=sc.nextInt();
        int N=X;
        if(N>1000){
            System.out.println("INVALID");
            System.exit(0);
        }
        int a=N/48;
        if(a>0){
            System.out.println("48*"+a+"="+(48*a));
            N%=48;
        }
        int b=N/24;
        if(b>0){
            System.out.println("24*"+b+"="+(24*b));
            N%=24;
        }
        int c=N/12;
        if(c>0){
            System.out.println("12*"+c+"="+(12*c));
            N%=12;
        }
        int d=N/6;
        if(d>0){
            System.out.println("6*"+d+"="+(6*d));
            N%=6;
        }
        int r=N;
        int B=X;
        int C=a+b+c+d;
        if(N==0)
        System.out.println("REMAINING BOXES:"+N);
        else{
        System.out.println("REMAINING BOXES:"+N+"*1="+N);
        C++;
    }
        System.out.println("Total boxes:"+B);
        System.out.println("Total Cartons:"+C);
    }
}
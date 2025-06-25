import java.util.Scanner;
class EvilNum{
    int num;
    int bin;
    EvilNum(){
        num=0;
        bin=0;
    }
    void acceptNum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the decimal number");
        num=sc.nextInt();
    }
    void rec_bin(int x){
        if(x==0)
        bin=0+bin;
        else{
        int d=x%2;
        bin=d+10*bin;
        rec_bin(x/2);
        }
        }
        void check(){
            int z=0;int c=0;
            rec_bin(num);
            while(bin>0){
                c=bin%10;
                if(c==1)
                z++;
                bin/=10;
            }
            if(z%2==0)
            System.out.println("Evil");
            else
            System.out.println("Not evil");
        }
        public static void main(String args[]){
            EvilNum obj=new EvilNum();
            obj.acceptNum();
            obj.check();
        }
    }
    

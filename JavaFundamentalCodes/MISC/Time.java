
//WAP to print the difference between two entered times
import java.util.Scanner;
class Time{
    int HH,MM,Sec;
    Time(){
        HH=0;
        MM=0;
        Sec=0;
    }
    void readTime(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter hour");
        HH=sc.nextInt();
        System.out.println("Enter minutes");
        MM=sc.nextInt();
        System.out.println("Emter secomds");
        Sec=sc.nextInt();
    }
    Time difftime(Time T1,Time T2){
       Time T3=new Time();
       int sec1=(T1.HH*3600)+(T1.MM*60)+T1.Sec;
       int sec2=(T2.HH*3600)+(T2.MM*60)+T2.Sec;
       int secdiff=sec1-sec2;
       T3.HH=(secdiff/3600);
       T3.MM=(secdiff%3600)/60;
       T3.Sec=(secdiff%3600)%60;
       return T3;
    }
    void disTime(){
        System.out.println("The time diff is:");
        System.out.print(+HH+":");
        System.out.print(+MM+":");
        System.out.print(+Sec);
    }
    public static void main(String args[]){
        Time A=new Time();
        Time B=new Time();
        Time C=new Time();
        A.readTime();
        B.readTime();
        C=C.difftime(A,B);
        C.disTime();
    }
    
}

//WAP to find the midpoint of two entered points
import java.util.Scanner;
class point{
    int x;
    int y;
    point(){
        x=0;
        y=0;
    }
    void readpoint(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the x and y coordinates");
        x=sc.nextInt();
        y=sc.nextInt();
    }
    point midpoint(point A,point B){
        point C=new point();
        C.x=(A.x+B.x)/2;
        C.y=(A.y+B.y)/2;
        return C;
    }
    void displaypoint(){
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String args[]){
        point A=new point();
        point B=new point();
        point C=new point();
        A.readpoint();
        B.readpoint();
        C=C.midpoint(A,B);
        A.displaypoint();
        B.displaypoint();
        C.displaypoint();
        
    }
}
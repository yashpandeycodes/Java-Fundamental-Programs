
//WAP to find the dot and cross product of two vectors
import java.util.Scanner;
class Vectors{
    int x;
    int y;
    int z;
    Vectors(){
        x=0;
        y=0;
        z=0;
    }
    void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the x coordinate");
        x=sc.nextInt();
        System.out.println("Enter the y coordinate");
        y=sc.nextInt();
        System.out.println("Enter the z coordinate");
        z=sc.nextInt();
    }
    Vectors dot(Vectors A,Vectors B){
        Vectors C=new Vectors();
        C.x=A.x*B.x;
        C.y=A.y*B.y;
        C.z=A.z*B.z;
        return C;
    }
    Vectors cross(Vectors A,Vectors B){
        Vectors D=new Vectors();
        D.x=(A.y*B.z)-(A.z*B.y);
        D.y=-(A.x*B.z)+(A.z*B.x);
        D.z=(A.x*B.y)-(A.y*B.x);
        return D;
    }
    void display(){
        System.out.print(+x+"^i"+"+");
         System.out.print(+y+"^j"+"+");
          System.out.println(+z+"^k");
    }
    public static void main(String args[]){
        Vectors A=new Vectors();
        Vectors B=new Vectors();
        Vectors C=new Vectors();
        Vectors D=new Vectors();
        A.accept();
        B.accept();
        System.out.println("The dot product is:");
        C=C.dot(A,B);
        C.display();
        System.out.println("The cross product is:");
        D=D.cross(A,B);
        D.display();
        
    }
}
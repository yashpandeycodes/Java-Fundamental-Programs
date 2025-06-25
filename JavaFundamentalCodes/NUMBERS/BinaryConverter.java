import java.util.Scanner;
class BinaryConverter{
    int number;
    long binNumber;
    BinaryConverter(int n){
        number=n;
        binNumber=0;
    }
    long convert(int n){
        if(n==0)
        return 0;
        else
        return n%2+(10*convert(n/2));
    }
    void display(){
        System.out.println("The original number"+number);
        System.out.println("The binary eq"+convert(number));
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        BinaryConverter obj=new BinaryConverter(num);
        obj.display();
    }
}
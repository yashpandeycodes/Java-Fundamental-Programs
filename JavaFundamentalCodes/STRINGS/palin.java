
//WAP to check if the entered no. is a palindrome number
//A palindrome number which is equal to the rerevse of itself
import java.util.Scanner;
class Palin{
    int num;
    int revnum;
    Palin(){
        num=0;
        revnum=0;
    }
    void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();
    }
    int reverse(int y){
        if(y<10){
            return y;
        }
            revnum=((y%10)*10) + reverse(y/10);
            return revnum;
    }
    void check(){
        if(num==(reverse(num))){
            System.out.println("Palindrome number");
    }
    else{
        System.out.println("Not a palindrome number");
    }
}
public static void main(String args[]){
    Palin obj=new Palin();
    obj.accept();
    obj.check();
}
}
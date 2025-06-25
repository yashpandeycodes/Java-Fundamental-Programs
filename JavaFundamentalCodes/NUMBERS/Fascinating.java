
//To check for a fascinating number
//A number which when multiplied by 2 and 3,and them the products
//after being concatenated contains all digits from 0 to 9,is a fascinating number
import java.util.Scanner;
class Fasci{
    static int num;
    void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();
    }
    static int isFascinating(int num){
        int flag=1;
        if(num<100){
            flag=0;
        }
        int n2=num*2;
        int n3=num*3;
        String str=""+num+n2+n3;
        for(char i='1';i<='9';i++){
            int indx1=str.indexOf(i);
            int indx2=str.lastIndexOf(i);
            if(indx1==-1||indx1!=indx2){
                flag=0;
            }
        }
        if(flag==1){
            return 1;
        }
        else{
            return 0;
        }
    }
    void display(){
        System.out.println("Fasinating number");
    } 
    public static void main(String args[]){
       Fasci obj=new Fasci();
       obj.accept();
       if(isFascinating(num)==1){
           obj.display();
       }
       else
       System.out.println("Not Fascinating");
    }
}
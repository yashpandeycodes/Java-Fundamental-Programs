import java.util.Scanner;
class Pronic{
    int num;
    Pronic(){
        num=0;
    }
    void acceptnum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();
    }
    int i=1;
    boolean ispronic(int v){
        
        int k=i+1;
        if(i>v/2)
        return false;
        else if(i*k==v)
        return true;
        else{
            i++;
            return ispronic(v);
        }
        
    }
    void check(){
        if(ispronic(num))
        System.out.println("Pronic");
        else
        System.out.println("Not Pronic");
    }
    public static void main(String args[]){
        Pronic obj=new Pronic();
        obj.acceptnum();
        obj.check();
    }
}
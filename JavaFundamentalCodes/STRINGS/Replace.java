import java.util.Scanner;
class Replace{
    String text;
    int len;
    Replace(){
        text="";
        len=0;
    }
    void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the text");
        text=sc.next();
    }
    char change(char ch){
        int x;
        x=ch;
        if(x>64&&x<91){
            x=x+33;
            if(x>122)
            x=x-26;
            return (char)x;
        }
        else if(x>96&&x<123){
            x=x-31;
            if(x>90)
            x=x-26;
            return (char)x;
        }
        else{
            return (char)x;
        }
    }
    void display(){
        String s="";String snew="";
        s=text;
        for(int i=0;i<s.length();i++){
            char z=s.charAt(i);
            snew=snew+change(z);
        }
        System.out.println("The replaced text is:"+snew);
    }
    public static void main(String args[]){
        Replace obj=new Replace();
        obj.accept();
        obj.display();
    }
}
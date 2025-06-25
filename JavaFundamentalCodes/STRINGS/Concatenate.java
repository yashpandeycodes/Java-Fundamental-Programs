import java.util.Scanner;
class Concatenate{
    String Txt;
    String Cxt;
    int len;
    Concatenate(){
        Txt="";
        Cxt="";
        len=0;
    }
    void readword(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word");
        Txt=sc.nextLine().toUpperCase();
        len=Txt.length();
    }
    void convert(){
        int c=-1;
        for(int i=0;i<len;i++){
            char ch=Txt.charAt(i);
            
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                c=i;
                break;
            }
        }
        if(c==0){
            Cxt=Txt.substring(0,len)+"Y";
        }
        else if(c==-1){
            Cxt=Txt.substring(0,len)+"N";
        }
        else{
            Cxt=Txt.substring(c,len)+Txt.substring(0,c)+"C";
        }
    }
    void display(){
        System.out.println("The original word is "+Txt);
        System.out.println("The changed word is "+Cxt);
    }
    public static void main(String args[]){
        Concatenate obj=new Concatenate();
        obj.readword();
        obj.convert();
        obj.display();
    }
}
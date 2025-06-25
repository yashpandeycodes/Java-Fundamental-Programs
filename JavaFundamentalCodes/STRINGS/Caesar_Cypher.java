
//WAP to encrypt as a caesar cypher
import java.util.Scanner;
class Caesar_Cypher{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String s=sc.nextLine();
        int l=s.length();
        if(l>=3&&l<=100){
            System.out.println(ciapher(s));
        }
        else
        System.out.println("Invalid statement");
    }
    static String ciapher(String s){
        String f="";
        int a;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetter(ch)){ 
            a=ch+13;
            if((Character.isUpperCase(ch)&&a>90)||(Character.isLowerCase(ch)&&a>122)){
                a=a-26;
            }
            ch=(char)a;
            f=f+ch;
        }
        else
        f=f+ch;
        }
        return f;
    }
}

//WAP to encrypt all vowels in a sentence with their after
//vowels
import java.util.Scanner;
class Encrypt{
    String wrd;
    int len;
    String newwrd;
    Encrypt(){
       wrd="";
       newwrd="";
       len=0;
    }
    void acceptwrd(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word");
        wrd=sc.nextLine();
        wrd=wrd.toUpperCase();
    }
    void freqvowcon(){
        int c=0;
        int d=0;
        for(int i=0;i<wrd.length();i++){
            char ch=wrd.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            c++;
            else
            d++;
        }
        System.out.println("The no of vowels are:"+c);
        System.out.println("The no of onsonents are:"+d);
    }
    void nextVowel(){
        for(int i=0;i<wrd.length();i++){
            char ch=wrd.charAt(i);
            if(ch=='A') newwrd=newwrd+'E';
            else if(ch=='E') newwrd=newwrd+'I';
            else if(ch=='I') newwrd=newwrd+'O';
            else if(ch=='O') newwrd=newwrd+'U';
            else if(ch=='U') newwrd=newwrd+'A';
            else newwrd=newwrd+ch;
        }
    }
    void display(){
        System.out.println("The original word is:"+wrd);
        System.out.println("The enrypted word is:"+newwrd);
    }
    public static void main(String args[]){
       Encrypt obj=new Encrypt();
       obj.acceptwrd();
       obj.freqvowcon();
       obj.nextVowel();
       obj.display();
    }
}
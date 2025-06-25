
//WAP to rearrange a word in such a way that all the vowels in the word appears first
//followed by the remaining consonants
import java.util.Scanner;
class Rearrange{
   String wrd;
   String newwrd;
   int v,c;
   Rearrange(){
       v=0;
       c=0;
   }
   void readword(){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the word");
       wrd=sc.next();
       wrd=wrd.toUpperCase();
   }
   void freq_vow_cons(){
       for(int i=0;i<wrd.length();i++){
           char ch=wrd.charAt(i);
           if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
              v++; 
           }
           else{
               c++;
           }
        }
           System.out.println("No of vowels are:"+v);
           System.out.println("No of consonants are:"+c);
   }
   void arrange(){
       String newwrd1="";
       String newwrd2="";
       for(int i=0;i<wrd.length();i++){
           char ch=wrd.charAt(i);
           if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
               newwrd1=newwrd1+ch;
   }
   else{
       newwrd2=newwrd2+ch;
   }
}
newwrd=newwrd1+newwrd2;
}
void display(){
    System.out.println("The original word is:"+wrd);
    System.out.println("The rearranged word is:"+newwrd);
}
public static void main(String args[]){
    Rearrange obj=new Rearrange();
    obj.readword();
    obj.freq_vow_cons();
    obj.arrange();
    obj.display();
}
}
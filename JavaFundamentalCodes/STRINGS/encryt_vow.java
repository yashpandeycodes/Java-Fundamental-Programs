import java.util.Scanner;
class encryptvow{
    String wrd;
    int len;
    String newwrd;
    encryptvow(){
        wrd="";
        len=0;
        newwrd="";
    }
    void acceptword(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word");
        wrd=sc.nextLine().toUpperCase();
        len=wrd.length();
    }
    void freqvowcount(){
        int v=0;
        int c=0;
        for(int i=0;i<len;i++){
            char ch=wrd.charAt(i);
            if(Character.isLetter(ch)){
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            v++;
            }
            else
            c++;
            }
        }
        System.out.println("The total vowels are "+v);
        System.out.println("The total consonents are "+c);
    }
    void nextVowel(){
        for(int i=0;i<len;i++){
            char ch=wrd.charAt(i);
            if(ch=='A')
            newwrd=newwrd+'E';
            else if(ch=='E')
            newwrd=newwrd+'I';
            else if(ch=='I')
            newwrd=newwrd+'O';
            else if(ch=='O')
            newwrd=newwrd+'U';
            else if(ch=='U')
            newwrd=newwrd+'A';
            else{
                newwrd=newwrd+ch;
            }
        
        }
    }
    void display(){
        System.out.println("The rearranged word "+newwrd);
    }
    public static void main(String args[]){
        encryptvow obj=new encryptvow();
        obj.acceptword();
        obj.freqvowcount();
        obj.nextVowel();
        obj.display();
    }
}
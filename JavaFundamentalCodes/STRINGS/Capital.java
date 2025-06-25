import java.util.Scanner;
class Capital{
    String sent;
    int freq;
    Capital(){
        sent="";
        freq=0;
    }
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        sent=sc.nextLine();
    }
    boolean isCap(String w){
        char c=w.charAt(0);
        
        if(Character.isLetter(c)&&Character.isUpperCase(c))
        return true;
        else
        return false;
    }
    void display(){
        sent=sent+" ";
        String str="";
        int counter=0;
        for(int i=0;i<sent.length();i++){
            char ch=sent.charAt(i);
            if(ch==' '){
                 str=sent.substring(counter,i);
                if(isCap(str))
                freq++;
                counter=i+1;
            }
        }
        System.out.println("Original "+sent);
        System.out.println(freq);
    }
    public static void main(String args[]){
        Capital obj=new Capital();
        obj.input();
        obj.display();
    }
}
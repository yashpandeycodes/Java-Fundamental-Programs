import java.util.Scanner;
class NoRepeat{
    String word;
    int len;
    NoRepeat(String wd){
        word=wd;
        len=word.length();
    }
    boolean check(){
        int ind1,ind2;
        for(int i=0;i<len;i++){
            char ch=word.charAt(i);
             ind1=word.indexOf(ch);
             ind2=word.lastIndexOf(ch);
             if(ind1!=ind2){
                 return false;
             }
            }
            return true;
    }
    void prn(){
        if(check())
        System.out.println("No repeated letter");
        else
        System.out.println("Repeated letters");
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word");
        String str=sc.nextLine();
        NoRepeat obj=new NoRepeat(str);
        obj.check();
        obj.prn();
    }
}
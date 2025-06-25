
//WAP to rotate a string anticlockwise until
//it gets the original string
import java.util.Scanner;
class Rotate_string{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String s=sc.nextLine();
        String t=s;
        System.out.println(t);
         do{
            int pos=t.indexOf(' ');
            String l1=t.substring(0,pos);
            String f=t.substring(pos+1,t.length());
            t=f + " " + l1;
            System.out.println(t);
        } while(!s.equals(t));
    }
}
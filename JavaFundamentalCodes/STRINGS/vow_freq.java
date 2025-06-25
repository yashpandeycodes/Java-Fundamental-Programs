

//WAP to calculate the frequency of words starting with a vowel in a sentence
import java.util.Scanner;
class vow_freq{
    static String str;
    static String temp;
    static int freq;
    vow_freq(){
        str="";
        temp="";
        freq=0;
    }
    static void readstr(){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the sentence");
      str=sc.nextLine();
    }
    static void calc_freq(){
        for(int i=0;i<((str.length())-1);i++){
            temp=' '+str;
            temp=temp.toUpperCase();
            char ch=temp.charAt(i);
            char ch1=temp.charAt(i+1);
            if(ch==' '){
                if(ch1=='A'||ch1=='E'||ch1=='I'||ch1=='O'||ch1=='U'){
                    freq++;
                }
            }
        }
    }
    static void display(){
        System.out.println("The original string is:"+str);
        System.out.println("Number of words starting with vowel are:"+freq);
    }
    public static void main(String args[]){
        vow_freq obj=new vow_freq();
        obj.readstr();
        obj.calc_freq();
        obj.display();
    }
}
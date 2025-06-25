
//WAP to print only those words which starts and ends
//with vowel
import java.util.Scanner;
class w_vowel{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s[]=new String[10];
        System.out.println("Enter the words");
        for(int i=0;i<10;i++){
            s[i]=sc.nextLine();
        }
        System.out.println("The word starting and ending with vowel are:");
        for(int i=0;i<10;i++){
            String word=s[i];
            word=word.toUpperCase();
            int l=word.length();
            char ch=word.charAt(0);
            char chl=word.charAt(l-1);
            if((ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            && (chl=='A'||chl=='E'||chl=='I'||chl=='O'||chl=='U')){
                System.out.println(word);
            }
        }
    }
}
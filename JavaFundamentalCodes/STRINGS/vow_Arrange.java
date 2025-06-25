
//WAP to print the first letter of each sentence
//and arrange them by printing vowels first
import java.util.Scanner;
class Arrange{
    public static void Rearrange(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String s=sc.nextLine();
        s=" "+s;
        s=s.toUpperCase();
        String s1="";
        String s2="";
        int c=0;
        int d=0;
        char ch;
        char ch1;
        int l=s.length();
        char last=s.charAt(l-1);
        if(last=='@'||last=='?'||last==';'){
            System.out.println("Invalid statement");
            return;
        }
        else{
        for(int i=0;i<l-1;i++){
            ch=s.charAt(i);
            ch1=s.charAt(i+1);
            if(ch==' '){
               if(ch1=='A'||ch1=='E'||ch1=='I'||ch1=='O'||ch1=='U'){
                 s1=s1+" "+ch1;
                 c++;
                }
                else{
                    s2=s2+" "+ch1;
                    d++;
                }
               }
            }
            String snew=s1+s2;
            System.out.println("Rearranged word:"+snew);
            System.out.println("The number of words starting with vowels are "+c);
            System.out.println("The number of words starting with consonents are "+d);
        }
    }
    public static void main(String args[]){
        Arrange obj=new Arrange();
        obj.Rearrange();
    }
    }
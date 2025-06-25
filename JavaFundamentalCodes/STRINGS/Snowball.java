import java.util.Scanner;
import java.util.StringTokenizer;
class Snowball{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String s=sc.nextLine();
        char ch=s.charAt(s.length()-1);
        if(ch=='?'||ch=='!'||ch=='.'){
            if(isSnowball(s)){
                System.out.println("Snowball string");
            }
            else
            System.out.println("Not a snowball");
        }
        else{
            System.out.println("INVALID");
            System.exit(0);
        }
    }
    static boolean isSnowball(String n){
        StringTokenizer st=new StringTokenizer(n," .,?!");
        boolean result=true;
        int wordCount=st.countTokens();
        int count=0;
        for(int i=1;i<=wordCount;i++){
         String word=st.nextToken();
         if(i==1){
             count=word.length();
         }
         if(count!=word.length()){
             result=false;
         }
         count++;
        }
        return result;
    }
}
import java.util.Scanner;
import java.util.StringTokenizer;
class potential{
    static int calcP(String w){
        int sum=0;
        for(int i=0;i<w.length();i++){
        char ch=w.charAt(i);
        sum=sum+(int)ch;
    }
    return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String s=sc.nextLine();
        s.toUpperCase();
        char z=s.charAt(s.length()-1);
        if(z=='?'||z=='!'||z=='.'){
            StringTokenizer st=new StringTokenizer(s," ,.!?");
            int count=st.countTokens();
            String words[]=new String[count];
            int P[]=new int[count];
            for(int i=0;i<count;i++){
                String x=st.nextToken();
                words[i]=x;
                P[i]=calcP(x);
                
                System.out.println(words[i]+"="+P[i]);
            }
            for(int i=0;i<(count-1);i++){
                for(int j=0;j<(count-i-1);j++){
                    if(P[j]>P[j+1]){
                        String t=words[j];
                        words[j]=words[j+1];
                        words[j+1]=t;
                        int y=P[j];
                        P[j]=P[j+1];
                        P[j+1]=y;
                    }
                }
            }
            for(int i=0;i<count;i++){
                System.out.print(words[i]+" ");
            }
        }
        else
        System.out.println("INVALID");
    }
}
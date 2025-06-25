import java.util.Scanner;
import java.util.StringTokenizer;
class WArrange{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String s=sc.nextLine();
        char z=s.charAt(s.length()-1);
        if(z=='.'||z=='!'||z=='?'){
            StringTokenizer st=new StringTokenizer(s," .?!,");
            int count=st.countTokens();
            String str[]=new String[count];
            for(int i=0;i<count;i++){
                str[i]=st.nextToken();
            }
            for(int i=0;i<count-1;i++){
                for(int j=0;j<count-i-1;j++){
                    if(str[j].length()>str[j+1].length()){
                        String t=str[j];
                        str[j]=str[j+1];
                        str[j+1]=t;
                    }
                    if((str[j].length()==str[j+1].length())&& 
                    (str[j].compareTo(str[j+1])>0)){
                        String k=str[j];
                        str[j]=str[j+1];
                        str[j+1]=k;
                    }
                }
            }
            for(int i=0;i<count;i++){
                System.out.print(str[i]+" ");
            }
        }
        else{
            System.out.println("INVALID");
            System.exit(0);
        }
    }
}
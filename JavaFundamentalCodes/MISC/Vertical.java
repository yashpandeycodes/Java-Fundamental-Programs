import java.io.*;
class Vertical{
    public static void main(String args[])throws IOException 
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of teams");
        int N=Integer.parseInt(br.readLine());
        if(N<3||N>7){
            System.out.println("INVALID");
            System.exit(0);
        }
        String T[]=new String[N];
        int largest=0;
        System.out.println("Enter team names");
        for(int i=0;i<N;i++){
            T[i]=br.readLine();
            int l=(T[i].length());
            if(l>largest)
            largest=l;
        }
        for(int i=0;i<largest;i++){
            for(int j=0;j<N;j++){
                try{
                System.out.print(T[j].charAt(i)+"   ");
            }
            catch(Exception e){
                System.out.print("    ");
            }
        }
            System.out.println();
        }
    }
        
    }

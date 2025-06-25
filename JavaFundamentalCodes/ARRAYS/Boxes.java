import java.util.Scanner;
class octal{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int M=sc.nextInt();
        System.out.println("Enter number of columns");
        int N=sc.nextInt();
        if(M<1||M>10||N<2||N>6){
            System.out.println("Invalid input");
            System.exit(0);
        }
        int A[][]=new int[M][N];
        for(int i=0;i<M;i++){
            System.out.println("Enter elements for Row "+(i+1)+":");
            for(int j=0;j<N;j++){
                A[i][j]=sc.nextInt();
                if(A[i][j]<0||A[i][j]>7){
                    System.out.println("Invalid input");
                    System.exit(0);
                }
            }
        }
        System.out.println("Filled Matrix"+"      "+"Decimal eq");
        int decNum=0;
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                decNum+=A[i][j]*((int)Math.pow(8,(N-j-1)));
                System.out.print(A[i][j]+" ");
            }
            System.out.print("        "+decNum);
            decNum=0;
            System.out.println();
        }
    }
}
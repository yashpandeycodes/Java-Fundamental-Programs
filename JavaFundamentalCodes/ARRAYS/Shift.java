import java.util.Scanner;
class Shift{
    int mat[][];
    int m,n;
    Shift(int mm,int nn){
        m=mm;
        n=nn;
        mat=new int[m][n];
    }
    void input(){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<m;i++){
            System.out.println("Enter the elements for "+(i+1)+"row");
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }
    }
    void cyclic(Shift P){
        int temp[][]=new int[m][n];
        for(int i=0;i<P.m-1;i++){
            for(int j=0;j<P.n;j++){
                    temp[i][j]=P.mat[i+1][j];
                    temp[m-1][j]=P.mat[0][j];
            }
        }
        P.mat=temp;
    }
    void display(){
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows");
        int x=sc.nextInt();
        System.out.println("Enter columns");
        int y=sc.nextInt();
        Shift P=new Shift(x,y);
        P.input();
        P.display();
        P.cyclic(P);
        System.out.println("Shifted");
        P.display();
    }
}
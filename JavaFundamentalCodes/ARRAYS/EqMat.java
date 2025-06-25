
//WAP to check if the two entered matrix are equal or not
import java.io.*;
import java.util.Scanner;
class EqMat{
    int a[][];
    static int m,n;
    EqMat(int mm,int nn){
        m=mm;
        n=nn;
        a=new int[m][n];
    }
     void readArray()throws IOException{
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
    } 
    static int check(EqMat P,EqMat Q){
        int flag=1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(P.a[i][j]!=Q.a[i][j]){
                    flag=0;
                }
            }
        }
            return flag;
    }
        void print(){
            for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        }
        public static void main(String args[])throws IOException{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number of rows");
            int m=sc.nextInt();
             System.out.println("Enter the number of columns");
            int n=sc.nextInt();
            EqMat obj=new EqMat(m,n);
            EqMat obj1=new EqMat(m,n);
            System.out.println("Enter the elements of first matrix pls");
            obj.readArray();
            System.out.println("Enter the elements of second matrix pls");
            obj1.readArray();
            System.out.println("The first matrix; ");
            obj.print();
            System.out.println("The second matrix: ");
            obj1.print();
            if(check(obj,obj1)==1){
                System.out.println("The two matrix are equal");
            }
            else
            System.out.println("The two matrix are not equal");
        }
}

//WAP to sort each row of a matrix in ascending order
import java.util.Scanner;
class sort_Matrix{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of row");
        int m=sc.nextInt();
         System.out.println("Enter number of columns");
         int n=sc.nextInt();
         if(m<3||m>9||n<3||n>9){
             System.out.println("Invalid limit");
             System.exit(0);
         }
         int Matrix[][]=new int[m][n];
         for(int i=0;i<m;i++){
             System.out.println("Enter the elements for "+(i+1)+" row");
             for(int j=0;j<n;j++){
                 Matrix[i][j]=sc.nextInt();
             }
         }
          System.out.println("ORIGINAL MATRIX");
          for(int i=0;i<m;i++){
              for(int j=0;j<n;j++){
                  System.out.print(Matrix[i][j]+" ");
              }
              System.out.println();
          }
          for(int i=0;i<m;i++){
              for(int j=0;j<n;j++){
              for(int k=0;k<n-j-1;k++){
                  if(Matrix[i][k]>Matrix[i][k+1]){
                      int t=Matrix[i][k];
                      Matrix[i][k]=Matrix[i][k+1];
                      Matrix[i][k+1]=t;
                  }
                }
            }
          }
           System.out.println("MATRIX AFTER SORTING ROW");
           for(int i=0;i<m;i++){
               for(int j=0;j<n;j++){
                   System.out.print(Matrix[i][j]+" ");
               }
               System.out.println();
           }
    }
}
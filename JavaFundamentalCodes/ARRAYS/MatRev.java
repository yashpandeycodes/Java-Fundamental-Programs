
//WAP to reverse the elements of a matrix
import java.util.Scanner;
class MatRev{
    int arr[][];
    int m;
    int n;
    MatRev(int mm,int nn){
       m=mm;
       n=nn;
       arr=new int[m][n];
    }
    void fillarray(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter matrix elements");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }
    int rev(int x){
        int s=0;
        while(x!=0){
          s=(s*10)+(x%10);
          x/=10;
        }
        return s;
    }
    void revMat(MatRev P){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                this.arr[i][j]=rev(P.arr[i][j]);
            }
        }
    }
    void show(){
        for(int i=0;i<m;i++){
            System.out.println();
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int x=sc.nextInt();
        System.out.println("Enter number of columns");
        int y=sc.nextInt();
        MatRev obj1=new MatRev(x,y);
        MatRev obj2=new MatRev(x,y);
        obj1.fillarray();
        obj2.revMat(obj1);
        System.out.println("/n The oriinal array:");
        obj1.show();
        System.out.println("/n The reverse array:");
        obj2.show();
    }
}

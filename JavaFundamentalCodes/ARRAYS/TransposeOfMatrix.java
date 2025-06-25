import java.util.Scanner;
class Trans{
    int arr[][];
    int m;
    Trans(int mm){
        m=mm;
        arr=new int[m][m];
    }
    void fillarray(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of array ");
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
               arr[i][j]=sc.nextInt(); 
            }
        }
    }
    void transpose(){
        int temp[][]=new int[m][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                temp[i][j]=arr[j][i];
                
            }
            
        }
        arr=temp;
    }
    void display(){
        System.out.println("The original matrix ");
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
            System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        transpose();
        System.out.println("The transpose matrix:");
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of matrix");
        int x=sc.nextInt();
        Trans obj=new Trans(x);
        obj.fillarray();
        obj.display();
    }
}
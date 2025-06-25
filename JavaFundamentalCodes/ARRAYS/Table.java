import java.util.Scanner;
class Table{
    int a[][];
    int r,c;
    Table(int x,int y){
        r=x;
        c=y;
        a=new int[r][c];
    }
    void input(){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<r;i++){
            System.out.println("Enter elements of "+(i+1)+" row");
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
    }
    void maxEachRow(){
        System.out.println("The largest element of each row is:");
        int largest=0;
        for(int i=0;i<r;i++){
            largest=a[i][0];
            for(int j=0;j<c;j++){
                if(a[i][j]>largest)
                largest=a[i][j];
            }
            System.out.println(largest);
        }
    }
    void display(){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int x=sc.nextInt();
        System.out.println("Enter the number of columns ");
        int y=sc.nextInt();
        Table obj=new Table(x,y);
        obj.input();
        obj.display();
        obj.maxEachRow();
    }
}
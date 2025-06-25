import java.util.Scanner;
class Composite{
    int arr[][];
    int m,n;
    Composite(int mm,int nn){
        m=mm;
        n=nn;
        arr=new int[m][n];
    }
    int isComposite(int p){
        int k=0;
        for(int i=2;i<=p/2;i++){
            if(p%i==0){
                k++;
            }
        }
        if(k==0)
        return 0;
        else
        return 1;
    }
    void fill(){
        int num=2;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                while(isComposite(num)==0){
                    num+=1;
                }
                arr[i][j]=num;
                num+=1;
            }
        }
    }
    void display(){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
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
        if(x>20||y>20){
            System.out.println("Invalid size");
            System.exit(0);
        }
        else{
            Composite obj=new Composite(x,y);
            obj.fill();
            obj.display();
        }
    }
}
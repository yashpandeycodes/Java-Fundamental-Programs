import java.util.Scanner;
class RelPrime{
    boolean a[][];
    int N;
    RelPrime(int n){
        N=n;
        a=new boolean[N][N];
    }
    void create(int n){
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(gcd(i,j)==1){
                    a[i][j]=true;
                }
            }
        }
    }
    int gcd(int a,int b){
        a=(int)Math.max(a,b);
        b=(int)Math.min(a,b);
        if(b==0)
        return a;
        else{
            return gcd(b,a%b);
        }
        }
        void display(){
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    System.out.println(a[i][j]);
                }
            }
        }
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the size of array");
            int n=sc.nextInt();
            if(n>100){
            System.out.println("Invalid");    
            
            System.exit(0);
        }
            RelPrime obj=new RelPrime(n);
            obj.create(n);
            obj.display();
        }
    }

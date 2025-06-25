
//To combine two arrays using Mixer class
import java.util.Scanner;
class Mixer{
    int n;
    int arr[];
    Mixer(int nn){
        n=nn;
     arr=new int[n];
    }
    void accept(){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter"+n+"values in ascending order");
     for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
     }
    }
     
    Mixer mix(Mixer A){
        Mixer B=new Mixer(n+A.n);
        int i;
        for(i=0;i<(this.n);i++){
            B.arr[i]=arr[i];
        }
        for(int j=0;j<(A.n);j++){
            B.arr[i+j]=A.arr[j];
        }
        return B;
    }
    void display(){
        System.out.println("The array elements are");
        for(int k=0;k<(n);k++){
            System.out.print(arr[k]);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of 1st array");
        int siz=sc.nextInt();
        Mixer obj=new Mixer(siz);
        obj.accept();
        System.out.println("Enter size of 2nd");
        int size=sc.nextInt();
        Mixer MM=new Mixer(size);
        MM.accept();
        Mixer x=obj.mix(MM);
        x.display();
    }
}
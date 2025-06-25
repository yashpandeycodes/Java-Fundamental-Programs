import java.util.Scanner;
class OddEven{
    int a[];
    int m;
    OddEven(int mm){
        m=mm;
        a=new int[m];
    }
    void fillarray(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements");
        for(int i=0;i<m;i++){
         a[i]=sc.nextInt();
        }
    }
    OddEven arrange(OddEven P,OddEven Q){
        int counter=0;
        OddEven C=new OddEven(P.m+Q.m);
        for(int i=0;i<P.m;i++){
            if(P.a[i]%2!=0){
            C.a[counter]=P.a[i];
            counter++;
        }
        }
        for(int j=0;j<Q.m;j++){
            if(Q.a[j]%2!=0){
                C.a[counter]=Q.a[j];
                counter++;
            }
        }
        for(int l=0;l<P.m;l++){
            if(P.a[l]%2==0){
                C.a[counter]=P.a[l];
                counter++;
            }
        }
        for(int b=0;b<Q.m;b++){
            if(Q.a[b]%2==0){
                C.a[counter]=Q.a[b];
                counter++;
            }
        }
        return C;
    }
    void display(){
        for(int i=0;i<m;i++){
            System.out.print(a[i]+" ");
        }
}
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of both arrays");
    int mm=sc.nextInt();
    OddEven obj1=new OddEven(mm);
    OddEven obj2=new OddEven(mm);
    OddEven obj3=new OddEven(mm+mm);
    obj1.fillarray();
    obj2.fillarray();
    obj3=obj3.arrange(obj1,obj2);
    obj3.display();
}
}
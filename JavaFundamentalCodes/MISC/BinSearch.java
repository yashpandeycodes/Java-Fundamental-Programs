import java.util.Scanner;
class BinSearch{
    int arr[];
    int n;
    BinSearch(int nn){
        n=nn;
        arr=new int[n];
    }
    void fillarray(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    }
    void sort(){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    int bin_search(int l,int u,int v){
        int mid=0;
        if(l==u){
            if(arr[l]==v)
            return l;
            else
            return -1;
        }
        else{
        mid=(l+u)/2;
        if(arr[mid]==v)
        return mid;
        else if(arr[mid]<v){
            return bin_search(mid+1,u,v);
        }
        else{
            return bin_search(l,mid-1,v);
        }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int x=sc.nextInt();
        BinSearch obj=new BinSearch(x);
        obj.fillarray();
        obj.sort();
        System.out.println("Enter number to be seached");
        int v=sc.nextInt();
        int c=obj.bin_search(0,x-1,v);
        System.out.println("The index is "+c);
    }
}
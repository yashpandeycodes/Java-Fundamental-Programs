import java.util.Scanner;
class Convert{
    int n;
    int d;
    int m;
    int y;
    Convert(){
        n=0;
        d=0;
        m=0;
        y=0;
    }
    void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the day number");
        n=sc.nextInt();
        System.out.println("Enter the year number");
        y=sc.nextInt();
    }
    void day_to_date(){
        int a[]={31,28,31,30,31,30,31,31,30,31,30,31};
        if(y%4==0)
        a[1]=29;
        int sum=0;
        int temp=0;
        for(int i=0;i<12;i++){
            sum+=a[i];
            temp=i;
            if(sum>=n){
                break;
            }
        }
        sum=0;
        for(int j=0;j<temp;j++){
            sum+=a[j];
        }
        if(n>sum){
           d=n-sum;
           m=temp;
        }
        
        else{
        d=a[temp];
        m=temp-1;
    }
    }
    void display(){
        String Month[]={"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
        System.out.println(Month[m]+" "+d+","+y);
    }
    public static void main(String args[]){
        Convert obj=new Convert();
        obj.accept();
        obj.day_to_date();
        obj.display();
    }
}
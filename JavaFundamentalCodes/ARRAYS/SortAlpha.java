import java.util.Scanner;
class sortAlpha{
    String sent;
    int len;
    sortAlpha(){
        sent="";
        len=0;
    }
    void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        sent=sc.nextLine();
        len=sent.split(" ").length;
    }
    void sort(sortAlpha P){
        String a[]=P.sent.split(" ");
        for(int i=0;i<P.len-1;i++){
            for(int j=0;j<P.len-i-1;j++){
                if(a[j].compareTo(a[j+1])>1){
                    String t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
            
            P.sent="";
            for(int k=0;k<len;k++){
                P.sent=P.sent+" "+a[k];
            }
            
        }
        void display(){
            System.out.println("INPUT");
            System.out.println(sent);
            System.out.println("Output");
            sort(this);
            System.out.println(this.sent);
        }
        public static void main(String args[]){
            sortAlpha obj=new sortAlpha();
            obj.accept();
            obj.display();
        }
    }

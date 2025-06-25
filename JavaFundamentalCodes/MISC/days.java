import java.util.Scanner;
class days{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter day");
        int day=sc.nextInt();
          System.out.println("Enter year");
          int year=sc.nextInt();
          System.out.println("Enter days after (N days)");
          int N=sc.nextInt();
          int Sum=day+N;
          int f=1;
          int d=1;
          if(day<1||day>366){
              f=0;
          }
          if(year<1000||year>3000){
              f=0;
          }
          if(N<1||N>100){
          System.out.println("Out of Range");
          System.exit(0);
        }
          if(year%100==0){
              if(year%400!=0){
              
              d=0;
          }
        }
          else{
              if(year%4!=0){
                  
                  d=0;
              }
            } 
          if(f==0){
             System.out.println("INVALID");
              System.exit(0); 
          }
          if(d==0 && day==366){
              System.out.println("INVALID");
              System.exit(0);
          }
          else{
              int date[]={31,28,31,30,31,30,31,31,30,31,30,31};
              if(d!=0){
              date[1]=29;
            }
              String M[]={"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY",
                  "AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
                  int a=0;
                  int s=0;
                  for(int i=0;i<12;i++){
                      s=s+date[i];
                      a=i;
                      if(s>=day)
                      break;
                  }
                  int x=s-day;
                  int x1=date[a]-x;
                  System.out.print("Date:"+x1);
                  if(x1==1)
                  System.out.print("st");
                  if(x1==2)
                  System.out.print("nd");
                  if(x1==3)
                  System.out.print("rd");
                  else
                  System.out.print("th");
                  System.out.println(" "+M[a]+","+year);
                  int s1=0;int b=0;
                  for(int j=0;j<12;j++){
                      s1=s1+date[j];
                      b=j;
                      if(s1>=Sum){
                         break; 
                      }
                  }
                  int temp=0;
                   if(s1<Sum){
                       year=year+1;
                       int s2=Sum-s1;
                       if(d==1)
                       date[1]=29;
                       int s3=0;
                       for(int k=0;k<12;k++){
                           s3=s3+date[k];
                           b=k;
                           if(s3>=s2)
                           break;
                       }
                       temp=s3-s2;
                   }
                  else{
                      temp=s1-Sum;
                  }
                  int z=date[b]-temp;
                  System.out.print("Date after N days:"+z);
                  if(z==1)
                  System.out.print("st");
                  if(z==2)
                  System.out.print("nd");
                  if(z==3)
                  System.out.print("rd");
                  else
                  System.out.print("th");
                  System.out.println(" "+M[b]+" "+year);
          }
    }
}
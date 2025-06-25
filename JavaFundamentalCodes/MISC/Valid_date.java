
//WAP to check if any entered date is a valid date or not
import java.util.Scanner;
class Valid_date{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the date in DD format");
        int day=sc.nextInt();
         System.out.println("Enter the month number in MM format");
         int month=sc.nextInt();
         System.out.println("Enter the year in YYYY format from 1800-2500");
        int year=sc.nextInt();
        int flag=1;
        if(day>31)
        flag=0;
        if(month>12)
        flag=0;
        if(year<1800||year>2500)
        flag=0;
        if(day==31 && (month==2||month==4||month==6||month==9||month==11))
        flag=0;
        if(day>29&&month==2)
        flag=0;
        if(day==29 && month==2){
        if(year%100==0){
            if(year%400!=0)
            flag=0;
        }
        else{
            if(year%4!=0)
            flag=0;
        }
        }
        if(day==0||month==0||year==0)
        flag=0;
        if(flag==0)
        System.out.println("Invalid date");
        else
        System.out.println("Valid date");
    }
}
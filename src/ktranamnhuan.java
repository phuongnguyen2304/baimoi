import java.util.Scanner;

public class ktranamnhuan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year ;


        System.out.println("Enter a year :");
        year = sc.nextInt();
        boolean isLeapYear = false ;

        boolean isDivisibleBy4 = year%4==0 ;
        if (isDivisibleBy4){
            boolean isDivisibleBy100 =  year%100==0 ;
            if (isDivisibleBy100){
                boolean isDivisibleBy400 = year%400==0 ;
                if (isDivisibleBy400){
                    isLeapYear = true ;

                }

            }else {
                isLeapYear = true ;
            }
        }
               if (isLeapYear){
                   System.out.print("0d is a leap year "+year );
               }else {
                   System.out.println("0d is NOT a leep year "+year);

               }
    }
}

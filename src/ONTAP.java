public class ONTAP {
    public static int sum (int i1 , int i2) {

        int result = 0 ;
        for (int i = i1 ; i<=i2;i++)
            result += i ;
        return result ;

        }

    public static void main(String[] args) {
        System.out.println("Sum from 1 to 10 is "+sum(1,10));
        System.out.println("Sum from 20 to 37 is "+sum(20,37));
        System.out.println("Sum from 35 to 49 is "+sum(35,49));
        System.out.println("Sum from 1 to 3 is"+sum(1,3));



        int sum = 0;
        for (int i = 1; i <= 10; i++)
            sum += i;
        System.out.println("Sum from 1 to 10 is " + sum);

    }
    }


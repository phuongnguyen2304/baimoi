import java.util.Scanner;

public class hienthi20songuyentodautien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số lượng số nguyên tố cần in ra ");
        int numbers = scanner.nextInt();
        int count = 0 ;
        int N = 2 ;
        while (count < numbers ){
            if(isPrime(N)){
                System.out.println(N + " ");
                count ++ ;

            }
            N++ ;
        }
    }
    public static boolean isPrime(int number){
        if (number <= 1 )
            return false ;
        for(int i = 2; i <= Math.sqrt(number); i++){
            if (number%1==0)
                return false ;
        }
        return true ;

    }
}

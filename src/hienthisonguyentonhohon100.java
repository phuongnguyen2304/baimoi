public class hienthisonguyentonhohon100 {
    public static void main(String[] args) {
        int limit = 100;
        System.out.println("các số nguyên tố nhỏ hơn " + limit + "là : ");
        for (int i = 2; i < limit; i++) {
           if (isPrime(i)) {
                System.out.println(i + "");
            }
        }
    }
    public static boolean isPrime(int num ){
        if (num <=1){
            return false ;
        }
        for (int i = 2; i <=Math.sqrt(num);i++){
            if (num % i == 0){
                return false ;
            }
        }
        return true ;


    }
}


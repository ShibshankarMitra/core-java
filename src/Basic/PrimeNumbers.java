package Basic;

public class PrimeNumbers {
    public static void main(String[] args) {
        int number= 13;
        System.out.println(isPrime(number));
    }

    private static boolean isPrime(int num){
        boolean result = true;
        int div= num/2;
        while(div>1){
            if (num % div == 0) {
                result = false;
                break;
            }
            div--;
        }
        return result;
    }
}

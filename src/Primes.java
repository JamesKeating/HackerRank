import java.util.Scanner;

/**
 * Created by siavj on 09/10/2017.
 */


public class Primes {

    /**
     *   Improved O( n^(1/2)) ) Algorithm
     *    Checks if n is divisible by 2 or any odd number from 3 to sqrt(n).
     *    The only way to improve on this is to check if n is divisible by
     *   all KNOWN PRIMES from 2 to sqrt(n).
     *
     *   @param num An integer to be checked for primality.
     *   @return true if n is prime, false if n is not prime.
     **/
    private static boolean isPrime(int num){

        // check lower boundaries on primality
        if (num == 2)
            return true;

        // 1 is not prime, even numbers > 2 are not prime
        else if( num == 1 || (num & 1) == 0)
            return false;

        int sqrt = (int) Math.sqrt(num);

        // Check for primality using odd numbers from 3 to sqrt(n)
        for (int i = 3; i <= sqrt ; i+= 2){
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        for(int a0 = 0; a0 < p; a0++){
            int n = in.nextInt();
            System.out.println(isPrime(n) ? "Prime" : "Not prime");

        }
    }

}

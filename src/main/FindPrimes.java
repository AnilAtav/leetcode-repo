package main;

public class FindPrimes {

    // Method to Check Prime Number
    private int check_prime(int num) {
        int half = num / 2;
        for (int i = 2; i <= half; i++) {
            // can the number divided without any remaining
            if (num % i == 0) {
                return 1;
            }
        }
        return 0; // if the number cant be divided any other number without remaining then it is prime
    }

    // Method to get print the prime sum
    public boolean find_prime(int num) {
        int half = num / 2;
        for (int i = 2; i <= half; i++) {
            if (check_prime(i) == 0) {
                int scndNum = num - i;
                if (check_prime(scndNum) == 0)
                    System.out.println(num + " = " + (scndNum) + " " + i);
            }
        }
        return false;
    }
}

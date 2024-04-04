package com.infosis;

public class ChangeNumToNextPossiblePrimeNum {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 77, 8, 99, 45, 33, 22, 75};
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            boolean foundPrime = false;
            
            while (!foundPrime) {
                num++;
                if (isPrime(num)) {
                    foundPrime = true;
                }
            }

            System.out.println("Next possible prime number for " + numbers[i] + " is " + num);
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

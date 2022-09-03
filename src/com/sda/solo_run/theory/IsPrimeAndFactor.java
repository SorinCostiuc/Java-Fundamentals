package com.sda.solo_run.theory;

public class IsPrimeAndFactor {
    public static void main(String[] args) {
//        CHECK PRIME
        int number = 11;
        for (int i = 2; i < number; i++) {
            int remainder = number % i;
            if (remainder == 0) {
                System.out.println("The number is not prime since it is divisible by " + i + ".");
                break;
            }
            if (i == number - 1)
                System.out.println("The number is prime!");
        }

//        CHECK FACTORS
        System.out.println("Let's check how many factors it has.");
        int factor = 2;
        while (factor < number) {
            int remainder = number % factor;
            factor++;
            if (remainder != 0) {
                continue;
            }
            System.out.println(factor - 1 + " is a factor of");
        }
//          DISPLAY Xth PRIME NUMBER
        int count = 1;
        int num = 1;
        while (count < 10) {
            num++;
            for (int div = num - 1; div > 1; div--) {
                if (num % div == 0) {
                    break;
                } else if (div == 2) {
                    count++;
                }
            }
        }
        System.out.println(num);
    }

    //    CHECK PrIME METHOD
    public static boolean isPrimeNumber(int i) {
        int verifNumb = 0;
        int j = 1;

        while (j <= i) {
            if (i % j == 0) {
                verifNumb++;
            }
            j++;
        }
        return (verifNumb == 2);
    }
}

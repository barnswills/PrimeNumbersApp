package com.bwapps.barney.primenumbersapp;

public class Prime
{
    private static String primeString = "";

    public static boolean isPrime(int number)
    {
        for (int i = 2; i < number; i++)
        {
            if (number % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void clearPrimeString()
    {
        primeString = "";
    }

    public static void setPrimeString(String number)
    {
        primeString += number + ", ";
    }

    public static String getPrimeString()
    {
        return primeString.substring(0, primeString.length()-2);
    }
}

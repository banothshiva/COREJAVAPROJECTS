package com.sathya;
import java.util.Scanner;

public class CommaSeparator 
{
    public static int[] readIntegers()
    {		 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Numbers with Comma Separator: ");
        String input = scanner.nextLine();
        String[] elements = input.split(",");
        int[] numbers = new int[elements.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(elements[i].trim());
        }
        return numbers;
    }

    public static void main(String[] args) 
    {
        int[] result = CommaSeparator.readIntegers();
        System.out.println("Numbers entered:");
        for (int res : result)
        {
            System.out.print(res + " ");
        }
      
    }
   
}

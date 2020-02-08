import java.lang.*;
import java.util.Scanner;

public class MessingArrays
{
    // Main Method
    public static void main(String[] args)
    {
        // Creates variable number that user inputs
        int number = getNumber();
        // Creates an array with every digit in number
        int[] digits = getDigits(number);
        // If isIncreasing is True
        if(isIncreasing(digits))
        {
            System.out.println("The digits of " + number + " are in increasing order.");
        }
        else
        {
            System.out.println("The digits of " + number + " are not in increasing order.");
        }
    }
    // isIncreasing Method
    public static boolean isIncreasing(int[] values)
    {
        // Loops from 0 to length of array
        for (int i = 0; i < values.length - 1; i++)
        {
            // if values of first index is less than or equal to next index
            if (values[i] >= values[i + 1]) {
                return false;
            }
        }
        return true;
    }
    // getNumber Method
    public static int getNumber()
    {
        // Creates user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        // Sets user input to a variable
        int posNum = input.nextInt();
        // Loops continously till a positive number is entered
        while (posNum <= 0) {
            System.out.println("Enter a positive number: ");
            posNum = input.nextInt();
        }
        // Returns Positive Number Inputed
        return posNum;
    }
    // getDigits Method
    public static int[] getDigits(int number)
    {
        // Gets the Log of a number to determine the length
        double logNum = Math.ceil(Math.log10(number));
        // Creates a variable to turn the length into int
        int numLength = (int)logNum;
        // Creates an array with length of number
        int[] array = new int[numLength];
        // Loops through length on number
        for( int i = 0; i < numLength; i++)
        {
            // Gets last digit of number and adds to array
            array[i] = number % 10;
            // Divide by 10 to remove last digit of the number each iteration
            number /= 10;
        }
        // Loops through half of the array length
        for(int i = 0; i < array.length / 2; i++)
        {
            // Assigns first array element to a temp placement
            int tempElement = array[i];
            // Array of current index is equal to the array of index of array length - 1 - the current index
            array[i] = array[array.length - 1 - i];
            // Assigns the array index of array length - 1 - the current index to the temp placement.
            array[array.length - 1 - i] = tempElement;
        }
        // Returns an Array
        return array;
    }
}


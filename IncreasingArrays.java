import java.util.Scanner;
public class IncreasingArrays
{
    // Main Method
    public static void main(String[] args)
    {
        // Creates an array length of 5
        int[] value = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 5 integers: ");
        // Each input is added to array
        for (int i = 0; i < value.length; i++)
        {
            value[i] = input.nextInt();
        }
        // If isIncreasing is true
        if(isIncreasing(value))
        {
            System.out.println("Those numbers are in increasing order");
        }
        else
        {
            System.out.println("Those numbers are not in increasing order");
        }

    }
    // Method to determine if array is increasing order
    public static boolean isIncreasing(int[] values)
    {
        // Loops through each element of the array
        for (int i = 0; i < values.length-1; i++)
        {
            // If the element at current i is less than or equal to the next element in array
            if (values[i] >= values[i+1])
            {
                return false;
            }
        }
        return true;
    }
}









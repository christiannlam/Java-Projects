import java.util.Scanner;
import java.lang.Math;
public class SpeedCarTires
{
    public static void main(String[] args)
    {
        // CONSTANT VARIABLES
        final double FEET_PER_SEC = 1.46667;
        final double GRAVITY = 32.174;
        final double MU = 0.8;
        final double MU_POOR = 0.5;
        final double ROUNDING = .005;
        final int DISTANCE_CONSTANT = 2;

        // CONVERT SPEED TO FEET_PER_SEC
        Scanner input = new Scanner( System.in );
        System.out.println("Enter inital speed in miles per hour: ");
        double speed = input.nextDouble();
        double v = speed * FEET_PER_SEC;

        // Print Speed With New Tire
        double newtires = Math.pow(v,2)/(DISTANCE_CONSTANT * GRAVITY * MU);
        System.out.printf("At "+ speed + " miles per hour, with new tires, the car will stop in %.2f feet", newtires - ROUNDING);

        // Print Speed With Poor Tires
        double poortires = Math.pow(v,2)/(DISTANCE_CONSTANT * GRAVITY * MU_POOR);
        System.out.printf("\nWith poor tires, the car will stop in %.2f feet", poortires);






    }
}
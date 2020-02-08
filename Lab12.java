import java.util.Scanner;
public class JudgeScores
{
    public static void main(String[] args)
    {   // CONSTANT VARIABLES
        final double MIN_SCORE = 0;
        final double MAX_SCORE = 10;
        final int NUM_JUDGES = 9;
        final int LOW_HIGH = 2;
        // Variables to find sum, low score, and high score
        double total_score = 0;
        double low_score = 10;
        double high_score = 0;
        Scanner input = new Scanner(System.in);
        // Loops through number of judges to get each score
        for(int i = 1; i <= NUM_JUDGES; i++)
        {
            // Print Score Input
            System.out.println("Please enter judge #" + i + "'s score: ");
            double score = input.nextDouble();
            // If score is less than 0 or greater than 10
            while( score > MAX_SCORE || score < MIN_SCORE)
            {
                System.out.println("Please enter judge #" + i + "'s score: ");
                score = input.nextDouble();
            }
            // If score is less than low_score
            if ( score < low_score)
            {
                low_score = score;
            }
            // If score is greater than high score
            else if ( score > high_score)
            {
                high_score = score;
            }
            total_score += score;
        }
        // Removes lowest and highest scores
        total_score -= low_score + high_score;
        // Finds Average score of the 7 scores
        double avg_score = total_score / (NUM_JUDGES - LOW_HIGH);
        System.out.println("Your final score is: " + avg_score);
    }
}


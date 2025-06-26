import java.util.Scanner;
import java.util.TooManyListenersException;

public class TestCaseLoopRunner {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of test cases: ");
        int totalTests = input.nextInt();

        for (int i=1; i <= totalTests; i++)
        {
            System.out.println("\nEnter score of test cases: "+i+ ":");
            int score = input.nextInt();

            //Decision using if-else
            if(score>=90)
            {
                System.out.println("✅ Test Case " + i + " Passed – Excellent");
            } else if (score >=70) {
                System.out.println("✅ Test Case " + i + " Passed – Good");
            } else if (score >= 50) {
                System.out.println("⚠ Test Case " + i + " Passed – Needs Improvement");
            } else {
                System.out.println("❌ Test Case " + i + " Failed");
            }
            // Sevierity using switch
            int status;
            if (score>=90){
                status = 1;
            } else if (score>=70) {
                status=2;
            } else if (score>=50) {
                status=3;
            } else {
                status=4;
            }
            switch (status) {
                case 1:
                    System.out.println("Severity: Green");
                    break;
                case 2:
                    System.out.println("Severity: Blue");
                    break;
                case 3:
                    System.out.println("Severity: Orange");
                    break;
                case 4:
                    System.out.println("Severity: RED");
                default:
                    System.out.println("Unknown status");
            }
        }
        input.close();
        System.out.println("\nAll test cases processed");
    }
}
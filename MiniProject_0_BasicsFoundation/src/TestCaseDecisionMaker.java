import java.util.Scanner;

public class TestCaseDecisionMaker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter test case score (0-100): ");
        int score = input.nextInt();

        // IF-ELSE Block
        if (score >= 90) {
            System.out.println("✅ Test Case Passed - Excellent");
        } else if (score>=70) {
            System.out.println("✅ Test Case Passed - Good");
        } else if (score>=50) {
            System.out.println(" ⚠ Test Case Passed - Needs Improvement");
        } else {
            System.out.println("❌ Test Case Failed");
        }

        // SWITCH Block
        int status;
        if (score >= 90) {
            status =1;
        } else if (score >= 70) {
            status = 2;
        } else if (score >= 50) {
            status =3;
        } else {
            status = 4;
        }
        switch (status) {
            case 1:
                System.out.println("Severity: GREEN");
                break;
            case 2:
                System.out.println("Severity: BLUE");
                break;
            case 3:
                System.out.println("Severity: ORANGE");
                break;
            case 4:
                System.out.println("Severity: RED");
                break;
            default:
                System.out.println("Unknown status");
        }
        input.close();
    }
}
import java.util.Scanner;

public class TestResultSimulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter test case score (0 to 100): ");
        int score = input.nextInt();

        if (score >= 90) {
            System.out.println("✅ Result: PASS – Excellent");
        } else if (score >= 70) {
            System.out.println("✅ Result: PASS – Good");
        } else if (score >= 50) {
            System.out.println("⚠️ Result: PASS – Needs Improvement");
        } else {
            System.out.println("❌ Result: FAIL");
        }

        System.out.println("Execution complete.");
        input.close();
    }
}

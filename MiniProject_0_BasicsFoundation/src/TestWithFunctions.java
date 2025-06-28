public class TestWithFunctions {

    public static void main(String[] args) {
        int[] testScores = {85, 43, 91, 76, 60};

        for (int i = 0; i < testScores.length; i++) {
            System.out.println("\nTest Case " + (i + 1));
            evaluateScore(testScores[i]);
        }
    }

    public static void evaluateScore(int score) {
        System.out.println("Score: " + score);

        if (score >= 50) {
            System.out.println("✅ Passed");
        } else {
            System.out.println("❌ Failed");
        }

        if (score >= 90) {
            System.out.println("Severity: GREEN");
        } else if (score >= 70) {
            System.out.println("Severity: BLUE");
        } else if (score >= 50) {
            System.out.println("Severity: ORANGE");
        } else {
            System.out.println("Severity: RED");
        }
    }
}

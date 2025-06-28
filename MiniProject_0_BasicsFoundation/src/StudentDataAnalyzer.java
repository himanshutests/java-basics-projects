public class StudentDataAnalyzer {
    public static void main(String[] args) {
        String[] names = {"Aman", "Sita", "Rahul", "Meena", "Ravi"};
        int[] scores = {88, 45, 72, 33, 91};

        int passCount = 0;
        int totalScore = 0;
        int topScore = Integer.MIN_VALUE;
        String topScorer = "";

        for (int i = 0; i < names.length; i++) {
            String grade = getGrade(scores[i]);
            System.out.println(names[i] + " scored " + scores[i] + " → Grade: " + grade);

            passCount += getPassCount(scores[i]);
            totalScore += scores[i];

            if (scores[i] > topScore) {
                topScore = scores[i];
                topScorer = names[i];
            }
        }

        double average = (double) totalScore / scores.length;

        System.out.println("\nTotal Pass Count: " + passCount);
        System.out.println("Top Scorer: " + topScorer);
        System.out.println("Average Score: " + average);
    }

    public static String getGrade(int score) {
        if (score >= 90) return "A+";
        else if (score >= 75) return "A";
        else if (score >= 60) return "B";
        else if (score >= 45) return "C";
        else return "F";
    }

    public static int getPassCount(int score) {
        return score >= 45 ? 1 : 0;
    }
}

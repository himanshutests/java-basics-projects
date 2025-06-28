import java.util.Scanner;
public class StudentDataDynamicInput {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students");
        number = sc.nextInt();
        sc.nextLine();
        String[] names = new String[number];
        int[] scores = new int[number];
        System.out.println("Enter the name of the students");
        for(int j=0;j<number;j++)
        {
            names[j] = sc.nextLine();
        }
        System.out.println("Enter the marks of the students");
        for(int k=0;k<number;k++)
        {
            scores[k] = sc.nextInt();
        }

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

public class TestSummaryReport {
    public static void main(String[] args) {
        int[] testScores = {95, 67,88,42,73};
        int passCount=0;
        int failCount=0;
        for (int i=0; i<testScores.length; i++)
        {
            int score = testScores[i];
            {
                    if (score >= 50)
                    {
                        System.out.println("✅ Passed");
                        passCount++;
                    } else {
                        System.out.println("❌ Failed");
                        failCount++;
                    }
                    if (score >= 90)
                    {
                        System.out.println("Severity: GREEN");
                    } else if (score >=70) {
                        System.out.println("Severity: BLUE");
                    } else if (score>=50) {
                        System.out.println("Severity: ORANGE");
                    }
                    else {
                        System.out.println("Severity: RED");
                    }
            }
        }
        System.out.println("\n📊 Summary:");
        System.out.println("Total Passed: "+passCount);
        System.out.println("Total Failed: "+failCount);
    }
}
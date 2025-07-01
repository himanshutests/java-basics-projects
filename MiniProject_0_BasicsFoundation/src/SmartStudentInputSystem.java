import java.util.ArrayList;
import java.util.Scanner;

public class SmartStudentInputSystem {
    public static void main(String[] args)
    {
        ArrayList<String> grade = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        String name1; int score=0;
        ArrayList<Integer> number = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.print("Enter student name: ");
            name1=sc.nextLine();
            if(name1.equals("exit"))
            {
                break;
            } else {
                System.out.print("Enter score: ");
                score=sc.nextInt();
                sc.nextLine();
                if(score>100 || score <0)
                {
                    do {
                        System.out.println("❌ Invalid. Try again.");
                        System.out.print("Enter score: ");
                        score = sc.nextInt();
                        sc.nextLine();
                    } while(score>100 || score <0);
                }
                String str;
                if (score >= 90)
                    {
                        str="A+";
                    }
                    else if (score >= 75) {
                    str="A";
                }
                    else if (score >= 60) {
                        str="B";
                }
                    else if (score >= 45) {
                        str = "C";
                }
                    else {
                        str ="F";
                }

                name.add(name1);
                    number.add(score);
                    grade.add(str);
            }
        }
        for (int i = 0; i < name.size(); i++) {
            System.out.println(name.get(i) + " scored " + number.get(i) + " -> " + grade.get(i));
        }
        int length = name.size();
        System.out.println("Total Students: "+length);
    }
}

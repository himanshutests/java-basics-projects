public class JavaBasics {

    public static void main(String[] args) {
        // Variable declaration
        String user = "Himanshu";
        int[] numbers = {10, 20, 30, 40, 50};

        // Loop to print each number
        System.out.println("Numbers in the array:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Call method to calculate sum
        int total = calculateSum(numbers);
        System.out.println("Total sum = " + total);

        // Final output
        System.out.println("Good job, " + user + "!");
    }

    // Method to calculate sum of an array
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int n : arr) {
            sum += n;
        }
        return sum;
    }
}

public class showingarray {
    public static void main(String[] args) {
        int[] score = {72, 85, 90, 78, 99, 92, 88, 75, 82, 74};
        int sum = 0;

        System.out.println("Activity 1");
        System.out.println("First Element: " + score[0]);
        System.out.println("Lowest Element: " + score[0]);
        System.out.println("Highest Element: " + score[4]);
        System.out.println("Last Element: " + score[9] + '\n');

        System.out.println("Activity 2");
        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
        }
        System.out.println("");

        for (int scores : score) {
            System.out.println("Element: " + scores);
        }
        System.out.println("");

        System.out.println("Activity 3");
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        System.out.println("Sum: " + sum);
        double average = (double) sum / score.length;
        System.out.println("Average: " + average);
    }
}

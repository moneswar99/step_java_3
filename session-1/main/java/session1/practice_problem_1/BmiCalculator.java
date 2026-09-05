package session1.practice_problem_1;

public class BmiCalculator {

    static String getBmiStatus(double bmi) {
        if (bmi < 18.5)
            return "Underweight";
        if (bmi <= 24.9)
            return "Normal";
        if (bmi <= 29.9)
            return "Overweight";
        return "Obese";
    }

    static void printWellnessReport(double[] heights, double[] weights) {
        System.out.println("Person | Height (m) | Weight (kg) | BMI | Status");
        for (int i = 0; i < heights.length; i++) {
            double bmi = weights[i] / (heights[i] * heights[i]);
            String status = getBmiStatus(bmi);
            System.out.printf("Person %d | %.2f | %.2f | %.2f | %s%n",
                    i + 1, heights[i], weights[i], bmi, status);
        }
    }

    public static void main(String[] args) {
        double[] heights = { 1.75, 1.60 };
        double[] weights = { 70, 90 };
        printWellnessReport(heights, weights);
    }
}
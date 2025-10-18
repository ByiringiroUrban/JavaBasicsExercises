package methods;

public class AnalyzeBMI {
    public static String analyzeBMI(String name, double weight, double height, char gender) {
        if (weight <= 0 || height <= 0) return "Invalid input values";

        double bmi = weight / (height * height);
        String category;

        if (gender == 'M' || gender == 'm') {
            category = (bmi < 20) ? "Underweight" : (bmi <= 25) ? "Normal" : "Overweight";
        } else {
            category = (bmi < 19) ? "Underweight" : (bmi <= 24) ? "Normal" : "Overweight";
        }

        return name + ": BMI = " + String.format("%.1f", bmi) + " (" + category + ")";
    }

    public static void main(String[] args) {
        System.out.println(analyzeBMI("John", 70, 1.75, 'M'));
    }
}

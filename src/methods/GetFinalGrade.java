package methods;

public class GetFinalGrade {
    public static String getFinalGrade(String name, double assignment, double midterm, double exam) {
        if (assignment < 0 || midterm < 0 || exam < 0 || assignment > 100 || midterm > 100 || exam > 100)
            return "Invalid scores for " + name;

        double finalScore = assignment * 0.3 + midterm * 0.3 + exam * 0.4;
        char grade = (finalScore >= 90) ? 'A' :
                     (finalScore >= 80) ? 'B' :
                     (finalScore >= 70) ? 'C' :
                     (finalScore >= 60) ? 'D' : 'F';

        return name + " - Final Score: " + String.format("%.1f", finalScore) + " (Grade " + grade + ")";
    }

    public static void main(String[] args) {
        System.out.println(getFinalGrade("Alice", 85, 78, 90));
    }
}

package methods;

public class GetGrade {
    public static char getGrade(int marks) {
        if (marks >= 90) return 'A';
        else if (marks >= 80) return 'B';
        else if (marks >= 70) return 'C';
        else if (marks >= 60) return 'D';
        else if (marks >= 50) return 'E';
        else return 'F';
    }

    public static void main(String[] args) {
        System.out.println("Grade: " + getGrade(88)); // B
    }
}

import java.util.Scanner;

class Exam {
    void check() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total number of subjects: ");
        int subjects = scanner.nextInt();

        if (subjects > 5) {
            throw new Exception("Number of subjects cannot exceed 5");
        } else {
            System.out.println("Number of subjects: " + subjects);
        }
    }

    public static void main(String[] args) {
        Exam exam = new Exam();

        // First run without try-catch
        // exam.check();

        // Second run with try-catch
        try {
            exam.check();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

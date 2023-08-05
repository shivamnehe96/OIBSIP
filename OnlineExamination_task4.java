package imp;

import java.util.Scanner;

public class onlineExam {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username, password;
        boolean isAuthenticated = false;
        
        // Login
        while (!isAuthenticated) {
            System.out.print("Enter username: ");
            username = scanner.nextLine();
            System.out.print("Enter password: ");
            password = scanner.nextLine();
            // Check if the username and password are correct
            if (username.equals("admin") && password.equals("admin123")) {
                isAuthenticated = true;
            } else {
                System.out.println("Invalid username or password. Please try again.");
            }
        }
        
        // Update Profile and Password
        System.out.print("Enter new username (leave blank to skip): ");
        String newUsername = scanner.nextLine();
        if (!newUsername.isEmpty()) {
            username = newUsername;
        }
        System.out.print("Enter new password (leave blank to skip): ");
        String newPassword = scanner.nextLine();
        if (!newPassword.isEmpty()) {
            password = newPassword;
        }
        System.out.println("Profile updated successfully!");
        
        // MCQs
        int score = 0;
        System.out.println("Give 5 quations answer in 5 minutes:");
        
        System.out.println("1) Who invented Java Programming?");
        System.out.println("a) Guido van Rossum");
        System.out.println("b) James Gosling");
        System.out.println("c) Dennis Ritchie");
        System.out.println("d) Bjarne Stroustrup");
        
        System.out.print("Your answer: ");
        String answer1 = scanner.nextLine();
        if (answer1.equals("b")) {
            score++;
        }
        System.out.println("2) Which component is used to compile, debug and execute the java programs?");
        System.out.println("a) JRE");
        System.out.println("b) JIT");
        System.out.println("c) JDK");
        System.out.println("d) JVM");
        System.out.print("Your answer: ");
        String answer2 = scanner.nextLine();
        if (answer2.equals("c")) {
            score++;
        }
        System.out.println("3) Which of these cannot be used for a variable name in Java?");
        System.out.println("a) identifier & keyword");
        System.out.println("b) identifier");
        System.out.println("c) keyword");
        System.out.println("d) none of the mentioned");
        System.out.print("Your answer: ");
        String answer3 = scanner.nextLine();
        if (answer3.equals("c")) {
            score++;
        }
        System.out.println("4) What is the extension of java code files?");
        System.out.println("a) .js");
        System.out.println("b) .cpp");
        System.out.println("c) .txt");
        System.out.println("d) .java");
        System.out.print("Your answer: ");
        String answer4 = scanner.nextLine();
        if (answer4.equals("d")) {
            score++;
        }
        System.out.println("5) Which of the following is not an OOPS concept in Java?");
        System.out.println("a) Polymorphism");
        System.out.println("b) Inheritance");
        System.out.println("c) Compilation");
        System.out.println("d) Encapsulation");
        System.out.print("Your answer: ");
        String answer5 = scanner.nextLine();
        if (answer5.equals("c")) {
            score++;
        }
        System.out.println("You scored " + score + " out of 5.");
        
        // Timer and auto-submit
        System.out.println("You have 5 minutes to complete the exam.");
        long startTime = System.currentTimeMillis();
        long endTime = startTime + 5 * 60 * 1000; // five minutes in milliseconds
        while (System.currentTimeMillis() < endTime) {
            // Wait for the time to expire
        }
        System.out.println("Time end! Your exam has been automatically submitted.");
        
        // Closing session and logout
        isAuthenticated = false;
        System.out.println("You have been logged out test.");
    }

}
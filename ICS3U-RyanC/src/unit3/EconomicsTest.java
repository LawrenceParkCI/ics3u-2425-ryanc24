package unit3;

import java.util.Scanner;

public class EconomicsTest {

    public static void main(String[] args) {
        int score = 0;  // Initialize the score to 0
        int totalQuestions = 20; // Total number of questions
        Scanner scanner = new Scanner(System.in);  // Create a scanner object to get user input
        String[] results = new String[totalQuestions];  // Array to store results for each question

        // Run the test by asking each question and storing results
        results[0] = askQuestion1(scanner);
        results[1] = askQuestion2(scanner);
        results[2] = askQuestion3(scanner);
        results[3] = askQuestion4(scanner);
        results[4] = askQuestion5(scanner);
        results[5] = askQuestion6(scanner);
        results[6] = askQuestion7(scanner);
        results[7] = askQuestion8(scanner);
        results[8] = askQuestion9(scanner);
        results[9] = askQuestion10(scanner);

        results[10] = askJournalEntry1(scanner);
        results[11] = askJournalEntry2(scanner);
        results[12] = askJournalEntry3(scanner);
        results[13] = askJournalEntry4(scanner);
        results[14] = askJournalEntry5(scanner);
        results[15] = askJournalEntry6(scanner);
        results[16] = askJournalEntry7(scanner);
        results[17] = askJournalEntry8(scanner);
        results[18] = askJournalEntry9(scanner);
        results[19] = askJournalEntry10(scanner);

        // Calculate score
        score = calculateScore(results);

        // Display the results of the quiz
        System.out.println("\nQuiz Results:");
        for (int i = 0; i < totalQuestions; i++) {
            System.out.println("Question " + (i + 1) + ": " + results[i]);
        }

        // Display the final score
        System.out.println("\nTest Complete! Your final score is: " + score + " out of 20");
        scanner.close();  // Close the scanner object to prevent memory leaks
    }

    // Method to check if the user's answer matches the correct answer
    public static boolean checkAnswer(String userAnswer, String correctAnswer) {
        return userAnswer.equalsIgnoreCase(correctAnswer);  // Check if the answer is correct (case-insensitive)
    }

    // Method to calculate the score based on the results array
    public static int calculateScore(String[] results) {
        int score = 0;
        for (String result : results) {
            if (result.contains("Correct")) {
                score++;
            }
        }
        return score;
    }

    // Method for the first multiple-choice question
    public static String askQuestion1(Scanner scanner) {
        System.out.println("1. What is the law of demand?");
        System.out.println("A. As price increases, quantity demanded increases.");
        System.out.println("B. As price increases, quantity demanded decreases.");
        System.out.println("C. As price decreases, quantity demanded decreases.");
        System.out.println("D. As price decreases, quantity demanded increases.");
        String answer = scanner.nextLine().trim();

        if (checkAnswer(answer, "B")) {
            System.out.println("Correct! The correct answer is: B. As price increases, quantity demanded decreases.");
            return "Question 1: Correct!";
        } else {
            System.out.println("Incorrect. The correct answer is: B. As price increases, quantity demanded decreases.");
            return "Question 1: Incorrect.";
        }
    }

    // Method for the second multiple-choice question
    public static String askQuestion2(Scanner scanner) {
        System.out.println("2. Which of the following is an example of a variable cost?");
        System.out.println("A. Rent");
        System.out.println("B. Insurance");
        System.out.println("C. Cost of raw materials");
        System.out.println("D. Salaries");
        String answer = scanner.nextLine().trim();

        if (checkAnswer(answer, "C")) {
            System.out.println("Correct! The correct answer is: C. Cost of raw materials.");
            return "Question 2: Correct!";
        } else {
            System.out.println("Incorrect. The correct answer is: C. Cost of raw materials.");
            return "Question 2: Incorrect.";
        }
    }

    // Method for the third multiple-choice question
    public static String askQuestion3(Scanner scanner) {
        System.out.println("3. What does GDP stand for?");
        System.out.println("A. General Domestic Product");
        System.out.println("B. Gross Domestic Product");
        System.out.println("C. Global Domestic Product");
        System.out.println("D. Generalized Development Product");
        String answer = scanner.nextLine().trim();

        if (checkAnswer(answer, "B")) {
            System.out.println("Correct! The correct answer is: B. Gross Domestic Product.");
            return "Question 3: Correct!";
        } else {
            System.out.println("Incorrect. The correct answer is: B. Gross Domestic Product.");
            return "Question 3: Incorrect.";
        }
    }

    // Method for the fourth multiple-choice question
    public static String askQuestion4(Scanner scanner) {
        System.out.println("4. Which is an example of fiscal policy?");
        System.out.println("A. Interest rates");
        System.out.println("B. Government spending and tax policies");
        System.out.println("C. Bank regulations");
        System.out.println("D. Currency exchange rates");
        String answer = scanner.nextLine().trim();

        if (checkAnswer(answer, "B")) {
            System.out.println("Correct! The correct answer is: B. Government spending and tax policies.");
            return "Question 4: Correct!";
        } else {
            System.out.println("Incorrect. The correct answer is: B. Government spending and tax policies.");
            return "Question 4: Incorrect.";
        }
    }

    // Method for the fifth multiple-choice question
    public static String askQuestion5(Scanner scanner) {
        System.out.println("5. What is inflation?");
        System.out.println("A. A decrease in prices");
        System.out.println("B. A general increase in prices and fall in purchasing value of money");
        System.out.println("C. A rise in demand for products");
        System.out.println("D. A rise in production costs");
        String answer = scanner.nextLine().trim();

        if (checkAnswer(answer, "B")) {
            System.out.println("Correct! The correct answer is: B. A general increase in prices and fall in purchasing value of money.");
            return "Question 5: Correct!";
        } else {
            System.out.println("Incorrect. The correct answer is: B. A general increase in prices and fall in purchasing value of money.");
            return "Question 5: Incorrect.";
        }
    }

    // Method for the sixth multiple-choice question
    public static String askQuestion6(Scanner scanner) {
        System.out.println("6. What is the primary goal of monetary policy?");
        System.out.println("A. To control inflation and stabilize the currency");
        System.out.println("B. To increase tax rates");
        System.out.println("C. To regulate wages");
        System.out.println("D. To increase government spending");
        String answer = scanner.nextLine().trim();

        if (checkAnswer(answer, "A")) {
            System.out.println("Correct! The correct answer is: A. To control inflation and stabilize the currency.");
            return "Question 6: Correct!";
        } else {
            System.out.println("Incorrect. The correct answer is: A. To control inflation and stabilize the currency.");
            return "Question 6: Incorrect.";
        }
    }

    // Method for the seventh multiple-choice question
    public static String askQuestion7(Scanner scanner) {
        System.out.println("7. What is the formula for calculating GDP?");
        System.out.println("A. GDP = C + I + G");
        System.out.println("B. GDP = C + I + G + (X - M)");
        System.out.println("C. GDP = C + S + I");
        System.out.println("D. GDP = P + G + X");
        String answer = scanner.nextLine().trim();

        if (checkAnswer(answer, "B")) {
            System.out.println("Correct! The correct answer is: B. GDP = C + I + G + (X - M).");
            return "Question 7: Correct!";
        } else {
            System.out.println("Incorrect. The correct answer is: B. GDP = C + I + G + (X - M).");
            return "Question 7: Incorrect.";
        }
    }

    // Method for the eighth multiple-choice question
    public static String askQuestion8(Scanner scanner) {
        System.out.println("8. What is the term for a prolonged period of economic downturn?");
        System.out.println("A. Depression");
        System.out.println("B. Stagnation");
        System.out.println("C. Recession");
        System.out.println("D. Inflation");
        String answer = scanner.nextLine().trim();

        if (checkAnswer(answer, "C")) {
            System.out.println("Correct! The correct answer is: C. Recession.");
            return "Question 8: Correct!";
        } else {
            System.out.println("Incorrect. The correct answer is: C. Recession.");
            return "Question 8: Incorrect.";
        }
    }

    // Method for the ninth multiple-choice question
    public static String askQuestion9(Scanner scanner) {
        System.out.println("9. Which of the following is not included in GDP?");
        System.out.println("A. Transfer payments like unemployment benefits");
        System.out.println("B. Government spending");
        System.out.println("C. Business investment");
        System.out.println("D. Consumer spending");
        String answer = scanner.nextLine().trim();

        if (checkAnswer(answer, "A")) {
            System.out.println("Correct! The correct answer is: A. Transfer payments like unemployment benefits.");
            return "Question 9: Correct!";
        } else {
            System.out.println("Incorrect. The correct answer is: A. Transfer payments like unemployment benefits.");
            return "Question 9: Incorrect.";
        }
    }

    // Method for the tenth multiple-choice question
    public static String askQuestion10(Scanner scanner) {
        System.out.println("10. What does the term 'opportunity cost' refer to?");
        System.out.println("A. The financial cost of an opportunity");
        System.out.println("B. The benefit of the next best alternative");
        System.out.println("C. The cost of forgoing the next best alternative");
        System.out.println("D. The time cost of an opportunity");
        String answer = scanner.nextLine().trim();

        if (checkAnswer(answer, "C")) {
            System.out.println("Correct! The correct answer is: C. The cost of forgoing the next best alternative.");
            return "Question 10: Correct!";
        } else {
            System.out.println("Incorrect. The correct answer is: C. The cost of forgoing the next best alternative.");
            return "Question 10: Incorrect.";
        }
    }

    // Method for the first fill-in-the-blank journal entry question
    public static String askJournalEntry1(Scanner scanner) {
        System.out.println("11. A journal entry for purchasing inventory on credit would be: Debit Inventory, Credit _____.");
        String answer = scanner.nextLine().trim();

        if (checkAnswer(answer, "Accounts Payable")) {
            System.out.println("Correct! The correct answer is: Accounts Payable.");
            return "Question 11: Correct!";
        } else {
            System.out.println("Incorrect. The correct answer is: Accounts Payable.");
            return "Question 11: Incorrect.";
        }
    }

    // Method for the second fill-in-the-blank journal entry question
    public static String askJournalEntry2(Scanner scanner) {
        System.out.println("12. A journal entry for recording depreciation would be: Debit Depreciation Expense, Credit _____.");
        String answer = scanner.nextLine().trim();

        if (checkAnswer(answer, "Accumulated Depreciation")) {
            System.out.println("Correct! The correct answer is: Accumulated Depreciation.");
            return "Question 12: Correct!";
        } else {
            System.out.println("Incorrect. The correct answer is: Accumulated Depreciation.");
            return "Question 12: Incorrect.";
        }
    }

    // Method for the third fill-in-the-blank journal entry question
    public static String askJournalEntry3(Scanner scanner) {
        System.out.println("13. The income statement shows a company's _____ and _____ over a period of time.");
        String answer = scanner.nextLine().trim();

        if (checkAnswer(answer, "revenues, expenses")) {
            System.out.println("Correct! The correct answer is: revenues, expenses.");
            return "Question 13: Correct!";
        } else {
            System.out.println("Incorrect. The correct answer is: revenues, expenses.");
            return "Question 13: Incorrect.";
        }
    }

    // Method for the fourth fill-in-the-blank journal entry question
    public static String askJournalEntry4(Scanner scanner) {
        System.out.println("14. A journal entry for paying off a loan would be: Debit _____, Credit Cash.");
        String answer = scanner.nextLine().trim();

        if (checkAnswer(answer, "Loan Payable")) {
            System.out.println("Correct! The correct answer is: Loan Payable.");
            return "Question 14: Correct!";
        } else {
            System.out.println("Incorrect. The correct answer is: Loan Payable.");
            return "Question 14: Incorrect.";
        }
    }

    // Method for the fifth fill-in-the-blank journal entry question
    public static String askJournalEntry5(Scanner scanner) {
        System.out.println("15. The accounting equation is: Assets = Liabilities + _____");
        String answer = scanner.nextLine().trim();

        if (checkAnswer(answer, "Owner's Equity")) {
            System.out.println("Correct! The correct answer is: Owner's Equity.");
            return "Question 15: Correct!";
        } else {
            System.out.println("Incorrect. The correct answer is: Owner's Equity.");
            return "Question 15: Incorrect.";
        }
    }

    // Method for the sixth fill-in-the-blank journal entry question
    public static String askJournalEntry6(Scanner scanner) {
        System.out.println("16. A journal entry for recording revenue from sales would be: Debit _____, Credit Sales Revenue.");
        String answer = scanner.nextLine().trim();

        if (checkAnswer(answer, "Accounts Receivable")) {
            System.out.println("Correct! The correct answer is: Accounts Receivable.");
            return "Question 16: Correct!";
        } else {
            System.out.println("Incorrect. The correct answer is: Accounts Receivable.");
            return "Question 16: Incorrect.";
        }
    }

    // Method for the seventh fill-in-the-blank journal entry question
    public static String askJournalEntry7(Scanner scanner) {
        System.out.println("17. In an income statement, the bottom line is often referred to as the _____.");
        String answer = scanner.nextLine().trim();

        if (checkAnswer(answer, "Net Income")) {
            System.out.println("Correct! The correct answer is: Net Income.");
            return "Question 17: Correct!";
        } else {
            System.out.println("Incorrect. The correct answer is: Net Income.");
            return "Question 17: Incorrect.";
        }
    }

    // Method for the eighth fill-in-the-blank journal entry question
    public static String askJournalEntry8(Scanner scanner) {
        System.out.println("18. In a journal entry, the expense account is always debited and the _____ account is credited.");
        String answer = scanner.nextLine().trim();

        if (checkAnswer(answer, "Cash")) {
            System.out.println("Correct! The correct answer is: Cash.");
            return "Question 18: Correct!";
        } else {
            System.out.println("Incorrect. The correct answer is: Cash.");
            return "Question 18: Incorrect.";
        }
    }

    // Method for the ninth fill-in-the-blank journal entry question
    public static String askJournalEntry9(Scanner scanner) {
        System.out.println("19. A journal entry for issuing stock would be: Debit Cash, Credit _____");
        String answer = scanner.nextLine().trim();

        if (checkAnswer(answer, "Common Stock")) {
            System.out.println("Correct! The correct answer is: Common Stock.");
            return "Question 19: Correct!";
        } else {
            System.out.println("Incorrect. The correct answer is: Common Stock.");
            return "Question 19: Incorrect.";
        }
    }

    // Method for the tenth fill-in-the-blank journal entry question
    public static String askJournalEntry10(Scanner scanner) {
        System.out.println("20. A journal entry for paying dividends would be: Debit _____, Credit Cash.");
        String answer = scanner.nextLine().trim();

        if (checkAnswer(answer, "Dividends Payable")) {
            System.out.println("Correct! The correct answer is: Dividends Payable.");
            return "Question 20: Correct!";
        } else {
            System.out.println("Incorrect. The correct answer is: Dividends Payable.");
            return "Question 20: Incorrect.";
        }
    }
}



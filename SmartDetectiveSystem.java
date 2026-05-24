import java.io.*;

public class SmartDetectiveSystem {
    static String[] clues = {
            "Unknown fingerprint on the office door",
            "Security camera stopped at 9 PM",
            "Threat message found on the desk",
            "Footprints near the window"
    };
    static String[] suspects = {
            "Ahmed",
            "Sarah",
            "Khaled",
            "Laila",
            "Buthynah",
            "Juha"
    };

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int choice;
        int score = 0;
        welcomeScreen();
        showCase();
        do {
            menu();
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(br.readLine());

            switch (choice) {

                case 1:
                    showClues();
                    score++;
                    break;

                case 2:
                    showSuspects();
                    score++;
                    break;

                case 3:
                    investigate(br);
                    score++;
                    break;

                case 4:
                    fingerprintAnalysis();
                    score++;
                    break;

                case 5:
                    finalResult(score);
                    break;

                default:
                    System.out.println("\nInvalid Choice!\n");
            }

        } while (choice != 5);
    }

    public static void welcomeScreen() {

        System.out.println("==========================================");
        System.out.println("\tSMART DETECTIVE SYSTEM");
        System.out.println("==========================================");

        System.out.println("\nWelcome Detective!");
        System.out.println("Your mission is to solve the mystery case.");
        System.out.println("Collect clues and investigate suspects.");
        System.out.println("Find the real criminal.");

        System.out.println("\n==========================================\n");

    }

    public static void showCase() {

        System.out.println("CASE INFORMATION");
        System.out.println("------------------------------------------");

        System.out.println("A company manager was found dead in his office.");
        System.out.println("The crime happened at 9 PM.");
        System.out.println("There are several suspects inside the company.");
        System.out.println("You must investigate to discover the truth.\n");

    }

    public static void menu() {

        System.out.println("============== MAIN MENU ==============");
        System.out.println("1- Show Clues");
        System.out.println("2- Show Suspects");
        System.out.println("3- Start Investigation");
        System.out.println("4- Analyze Fingerprints");
        System.out.println("5- Final Result");
        System.out.println("=======================================");

    }

    public static void showClues() {

        System.out.println("\n============== CLUES ==============");

        for (int i = 0; i < clues.length; i++) {

            System.out.println((i + 1) + "- " + clues[i]);

        }

        System.out.println("===================================\n");

    }

    public static void showSuspects() {

        System.out.println("\n=========== SUSPECTS ===========");

        int i = 0;

        while (i < suspects.length) {

            System.out.println((i + 1) + "- " + suspects[i]);

            i++;

        }

        System.out.println("================================\n");

    }

    public static void investigate(BufferedReader br) throws Exception {
        int answer;
        System.out.println("\n=========== INVESTIGATION ===========");
        System.out.println("Who do you think is the criminal?");
        System.out.println("1- Ahmed");
        System.out.println("2- Sarah");
        System.out.println("3- Khaled");
        System.out.println("4- Laila");

        System.out.print("Enter your answer: ");

        answer = Integer.parseInt(br.readLine());

        switch (answer) {

            case 1:
                System.out.println("\nAhmed has a strong alibi.");
                break;

            case 2:
                System.out.println("\nSarah was outside the company.");
                break;

            case 3:
                System.out.println("\nKhaled looked nervous during investigation.");
                break;

            case 4:
                System.out.println("\nLaila was seen near the office.");
                break;

            default:
                System.out.println("\nInvalid Answer.");
        }

        if (answer == 3) {

            System.out.println("Khaled is the main suspect!");

        } else {

            System.out.println("Investigation is still running...");

        }

        System.out.println("=====================================\n");

    }

    public static void fingerprintAnalysis() {
        System.out.println("\n======= FINGERPRINT ANALYSIS =======");
        int fingerprintDifference = -25;
        System.out.println("Fingerprint Difference: "
                + Math.abs(fingerprintDifference));
        double cameraDistance = Math.sqrt(144);
        System.out.println("Distance Between Camera And Office: "
                + cameraDistance + " meters");
        double suspectLevel = 7.8;
        System.out.println("Suspicion Level: "
                + Math.round(suspectLevel));
        int evidence = 10;
        int witness = 5;
        int totalScore = (evidence + witness) * 2;
        System.out.println("Total Investigation Score: "
                + totalScore);
        if (totalScore > 20) {
            System.out.println("Fingerprint analysis confirms strong evidence.");
        } else {
            System.out.println("More evidence is needed.");
        }
        System.out.println("====================================\n");
    }

    public static void finalResult(int score) {

        System.out.println("\n=========== FINAL RESULT ===========");

        int counter = 1;

        do {

            System.out.println("Analyzing final evidence...");
            counter++;

        } while (counter <= 3);

        System.out.println("\nCase Solved Successfully!");

        if (score >= 3) {
            System.out.println("Excellent! You are a professional detective.");

        } else {
            System.out.println("You need more investigation experience.");
        }
        System.out.println("\nThe real criminal is: Khaled");

        System.out.println("His fingerprints were found inside the office.");
        System.out.println("The security camera stopped when he entered.");
        System.out.println("He also received threat messages from the manager.");
        System.out.println("\nThank you for using Smart Detective System.");
        System.out.println("====================================");
    }
}
import java.util.*;

public class Gradecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects to calculate your Grade:");
        int numSub = sc.nextInt();
        int Sub[] = new int[numSub];

        for (int i = 0; i < numSub; i++) {
            System.out.println("Enter your Marks " + (i + 1));
            Sub[i] = sc.nextInt();

            if (Sub[i] > 100) {
                System.out.println("You have entered wrong information");
            }
        }

        sc.close();

        int totalmarks = 0;
        for (int j = 0; j < numSub; j++) {
            totalmarks = totalmarks + Sub[j];
        }

        int average = totalmarks / numSub;
        System.out.println("Total marks: " + totalmarks);
        System.out.println("Average : " + average);

        if (average >= 85) {
            System.out.println("Congratulations you got A Grade.");
        } else if (average >= 65) {
            System.out.println("Very good you got B Grade.");
        } else if (average >= 50) {
            System.out.println("Nice you got C Grade.");
        } else if (average >= 40) {
            System.out.println("Nice you got D Grade.");
        } else {
            System.out.println("Alas! You got F Grade.");
        }
    }
}

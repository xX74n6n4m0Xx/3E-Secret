import java.util.*;
import java.lang.*;

public class SMain.java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String response;

        do {
            while (true) {
                try {
                    System.out.println("Enter a number: ");
                    int sam1 = scanner.nextInt();
                    System.out.println("Enter a number for exponent: ");
                    int sam2 = scanner.nextInt();

                    if (sam1 == 0 && sam2 == 0) {
                        throw new AbelaException("Both Numbers Should not be Zero");
                    } else if (sam1 < 0 && sam2 < 0) {
                        throw new AbelaException("Both Numbers Should not be Negative");
                    } else if (sam1 == 0) {
                        throw new AbelaException("First Number Should not be Zero");
                    } else if (sam1 < 0) {
                        throw new AbelaException("First Number Should not be Negative");
                    } else if (sam2 == 0) {
                        throw new AbelaException("Second Number Should not be Zero");
                    } else if (sam2 < 0) {
                        throw new AbelaException("Second Number Should not be Negative");
                    } else {
                        int sam3 = (int) Math.round(Math.pow(sam1, sam2));
                        System.out.print(sam1);

                        for (int p = 2; p <= sam2; p++) {
                            System.out.print(" x " + sam1);
                        }

                        System.out.print(" = " + sam3 + "\nor " + sam1 + "^" + sam2 + " = " + sam3);

                        break;
                    }
                } catch (AbelaException e) {
                    System.out.println(e.getMessage());
                    continue;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.next();
                }
            }

            System.out.print("\nTry Again? (Yes/No): ");
            response = scanner.next().toUpperCase();
        } while (response.equalsIgnoreCase("Yes"));
    }
}

class AbelaException extends Exception {
    public AbelaException(String message) {
        super(message);
    }
}

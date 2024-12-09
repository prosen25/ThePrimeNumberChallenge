//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int counter = 0;
        int startNumber = 10;
        int endNumber = 50;

        System.out.println("Here are the first three prime number between " + startNumber + " and " + endNumber);

        for (int i = startNumber; i <= endNumber; i++) {
            if (isPrime(i)) {
                System.out.println("Number " + i + " is a prime number.");
                counter++;

                if (counter == 3) {
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int number) {

        if (number <= 2) {
            return (number == 2);
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
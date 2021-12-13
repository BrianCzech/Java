import java.util.Scanner;

class newClass {
    public static void main(String[] args) {
        int totalCount = 1;
        int userInputNumber = 0;

        Scanner inputScanner = new Scanner(System.in);
        int resultNumber = (int) (Math.random() * 100 + 1);

        while (true) {
            System.out.println(totalCount + "/5");
            System.out.print("Enter a number between 1 to 100: \n");
            userInputNumber = inputScanner.nextInt();

            if (userInputNumber < 1 || userInputNumber > 100) {
                System.out.println("Please enter a valid number");
                continue;
            } else if (totalCount == 5) {
                System.out.println("Maximum attempt reached! Please try again...Correct number is : " + resultNumber);
                break;
            } else if (userInputNumber < resultNumber) {
                System.out.println("It is larger than the result !");
            } else if (userInputNumber > resultNumber) {
                System.out.println("It is smaller than the result !");
            } else {
                System.out.println("It is correct. You Won !");
                break;
            }

            totalCount++;
        }
    }
}

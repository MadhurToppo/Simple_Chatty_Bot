import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    // put your code here
    Scanner scanner = new Scanner(System.in);
    int noOfElements = scanner.nextInt();

    int sum = 0;
    for (int i = 0; i < noOfElements; i++) {

      int number = scanner.nextInt();
      if (number % 6 == 0) {
        sum += number;
      }
    }

    System.out.println(sum);
  }
}

import java.util.Scanner;

public class Main {

  public static long factorial(long n) {
    // write your code here
    long factorial = 1;

    if (n == 0) {
      return factorial;
    }

    for (long i = 1; i <= n;  i++) {
      factorial *= i;
    }

    return factorial;
  }

  /* Do not change code below */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long n = Integer.parseInt(scanner.nextLine().trim());
    System.out.println(factorial(n));
  }
}

import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    // put your code here
    Scanner scanner = new Scanner(System.in);
    int noOfstudents = scanner.nextInt();

    int gradeA = 0;
    int gradeB = 0;
    int gradeC = 0;
    int gradeD = 0;

    for (int i = 0; i < noOfstudents; i++) {
      int marks = scanner.nextInt();

      if (marks == 5) {
        gradeA++;
      } else if (marks == 4) {
        gradeB++;
      } else if (marks == 3) {
        gradeC++;
      } else if (marks == 2) {
        gradeD++;
      }
    }

    System.out.println(gradeD + " " + gradeC + " " + gradeB + " " + gradeA);
  }
}

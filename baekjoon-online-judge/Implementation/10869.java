import java.util.Scanner;

class Main {  
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    System.out.printf("%d\n%d\n%d\n%d\n%d", a + b, a - b, a * b, a / b, a % b);
  }
}
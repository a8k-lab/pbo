import java.util.Scanner;

public class Fibonacci {
  static int getFibonacci(int n) {
    if (n == 1 || n == 2) {
      return 1;
    }
    return getFibonacci(n-1) + getFibonacci(n-2);
  }

  static void printFibonacci(int n) {
    for (int i = 1; i <= n; i++) {
      System.out.print(getFibonacci(i));
      System.out.print(" ");
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan n: ");
    int n = sc.nextInt();
    printFibonacci(n);
    sc.close();
  }
}

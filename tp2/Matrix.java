import java.util.Scanner;

public class Matrix {
  static int[][] multiplyMatrix(int n, int[][] matrix1, int[][] matrix2) {
    int[][] result = new int[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        int sum = 0;
        for (int k = 0; k < n; k++) {
          sum += matrix1[i][k] * matrix2[k][j];
        }
        result[i][j] = sum;
      }
    }

    return result;
  }

  static int[][] inputMatrix(int n) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int[][] newMatrix = new int[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        newMatrix[i][j] = sc.nextInt();
      }
    }

    return newMatrix;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Perkalian matriks n*n");
    System.out.print("n: ");
    int nMatrix = sc.nextInt();

    System.out.println("Isi matriks 1:");
    int[][] matrix1 = inputMatrix(nMatrix);
    System.out.println("Isi matriks 2:");
    int[][] matrix2 = inputMatrix(nMatrix);

    System.out.println("Hasil perkalian:");
    int[][] multipliedMatrix = multiplyMatrix(nMatrix, matrix1, matrix2);

    for (int i = 0; i < nMatrix; i++) {
      for (int j = 0; j < nMatrix; j++) {
        System.out.print(multipliedMatrix[i][j] + " ");
      }
      System.out.println();
    }

    sc.close();
  }
}

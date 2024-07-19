public class Matrixmultiply {

  public static void main(String[] args) {
    int[][] firstMatrix = {{1, 2, 3}, {4, 5, 6}};
    int[][] secondMatrix = {{1, 4}, {2, 5}, {3, 6}};

    // Check if matrices are compatible for multiplication
    if (firstMatrix[0].length != secondMatrix.length) {
      System.out.println("Matrices cannot be multiplied. Incompatible dimensions.");
      return;
    }

    // Create a new matrix to store the result
    int[][] result = new int[firstMatrix.length][secondMatrix[0].length];

    // Perform matrix multiplication
    for (int i = 0; i < firstMatrix.length; i++) {
      for (int j = 0; j < secondMatrix[0].length; j++) {
        result[i][j] = 0;
        for (int k = 0; k < firstMatrix[0].length; k++) {
          result[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
        }
      }
    }

    // Print the resulting matrix
    System.out.println("Resultant Matrix:");
    for (int i = 0; i < result.length; i++) {
      for (int j = 0; j < result[0].length; j++) {
        System.out.print(result[i][j] + " ");
      }
      System.out.println();
    }
  }
}

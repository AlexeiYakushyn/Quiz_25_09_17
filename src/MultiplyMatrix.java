/**
 * Created by alexei.yakushyn on 25.09.2017.
 */
public class MultiplyMatrix {

    private int[][] matrixA;
    private int[][] matrixAB;
    public int[][] res;

    public int[][] matrixMultiply(int[][] matrixA, int[][] matrixB) {

        res = new int[matrixA.length][matrixB[0].length];

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixB[0].length; j++) {
                for (int k = 0; k < matrixA[0].length; k++) {
                    res[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        for (int[] re : res) {
            for (int j = 0; j < re.length; j++) {
                System.out.print(re[j] + " ");
            }
            System.out.println();
        }
        return res;
    }
}
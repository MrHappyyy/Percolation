package practicle_Percolation;

public class Percolation {
    private int[][] matrix;

    public Percolation(int N) {
        matrix = new int[N][N];
        int k = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = k;
                k++;
            }
        }
    }

    public int getOpenedCount() {
        return 0;
    }
    //рахуємо і повертаємо кількість відкритих комірок
    public void open(int i, int j) {

    }
    // відкрити об’єкт (row i, column j) якщо він ще не відкритий
    public boolean isOpened(int i, int j) {
        return false;
    }
    // чи відкитий об’єкт (row i, column j)?
    public boolean percolates() {
        return false;
    }
    // чи протікає система?
}

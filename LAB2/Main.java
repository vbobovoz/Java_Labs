import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

class Sorter implements Comparator {
    public int compare(Object a, Object b) {
        if ((int)a < (int)b)
            return 1;
        if ((int)a == (int)b)
            return 0;
        else
            return -1;
    }
}

public class Main {
    public static void generate(Integer[][] matrix, int n, int m) {
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < m; ++j) {
                matrix[i][j] = (int)(Math.random() * 100) + 1;
            }
        }
    }

    public static void print(Integer[][] matrix, int n, int m) {
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < m; ++j) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = (int)(Math.random() * 10) + 1;
        int m = (int)(Math.random() * 10) + 1;
        System.out.println("Matrix size: ");
        System.out.println("n = " + n + ", m = " + m);
        System.out.println();
        Integer[][] matrix = new Integer[n][m];
        generate(matrix, n, m);
        System.out.println("Initial matrix:");
        print(matrix, n, m);

        // Finding max value and it's n,m
        int max = 0, ind_i = 0, ind_j = 0;
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < m; ++j) {
                if(matrix[i][j] > max) {
                    max = matrix[i][j];
                    ind_i = i;
                    ind_j = j;
                }
            }
        }
        System.out.println("Max value in matrix = " + max);
        System.out.println("Index i = " + ind_i + 1 + ", index j = " + ind_j + 1);
        System.out.println();

        // Swap i
        Integer[] tmp_matrix = matrix[0];
        matrix[0] = matrix[ind_i];
        matrix[ind_i] = tmp_matrix;
        // Swap j
        for(int i = 0; i < n; ++i) {
            int tmp_value = matrix[i][0];
            matrix[i][0] = matrix[i][ind_j];
            matrix[i][ind_j] = tmp_value;
        }

        // Sorting last line
        Arrays.sort(matrix[n - 1], new Sorter());

        // Print matrix after swapping and sorting last line
        System.out.println("Matrix after swapping and sorting last line: ");
        print(matrix, n, m);
        System.out.println();

        // Print with % and $
        System.out.println("Matrix with $ : ");
        NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < m; ++j) {
                System.out.printf(fmt1.format(matrix[i][j].intValue()) + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Matrix with % : ");
        NumberFormat fmt2 = NumberFormat.getPercentInstance();
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < m; ++j) {
                System.out.print(fmt2.format(matrix[i][j].intValue()) + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Arraycopy
        Integer[] copy_arr = new Integer[m/2];
        System.arraycopy(matrix[n - 1], 0, copy_arr, 0, m/2);
        System.out.println("Copy from last line of matrix " + m/2 + " elements to new array: ");
        for(int i = 0; i < m/2; ++i) {
            System.out.print(copy_arr[i] + " ");
        }
        System.out.println();
    }
}

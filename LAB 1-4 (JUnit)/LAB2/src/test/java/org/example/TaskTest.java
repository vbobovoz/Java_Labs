package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TaskTest {
    @Test
    public void test1() {
        int n = 10;
        int m = 10;
        Integer[][] matrix = new Integer[n][m];
        Main.generate(matrix, n, m);
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

        assertEquals(max, matrix[0][0]);
    }

    @Test
    public void test2() {
        int n = 1;
        int m = 1;
        Integer[][] matrix = new Integer[n][m];
        Main.generate(matrix, n, m);
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

        assertEquals(max, matrix[0][0]);
    }

    @Test
    public void test3() {
        int n = 5;
        int m = 13;
        Integer[][] matrix = new Integer[n][m];
        Main.generate(matrix, n, m);
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

        assertEquals(max, matrix[0][0]);
    }

    @Test
    public void test4() {
        int n = 999;
        int m = 900;
        Integer[][] matrix = new Integer[n][m];
        Main.generate(matrix, n, m);
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

        assertEquals(max, matrix[0][0]);
    }
}
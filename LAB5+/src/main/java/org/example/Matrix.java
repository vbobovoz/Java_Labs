package org.example;

public class Matrix {
    public int n;
    public int m;
    public Cell[][] matrix;
    Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        this.matrix = Fill(n, m);
    }

    private static Cell[][] Fill(int n, int m) {
        Cell[][] t = new Cell[n][m];
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < m; ++j) {
                int lu_x = i;
                int lu_y = j;
                int ru_x = i;
                int ru_y = j + 1;
                int rb_x = i + 1;
                int rb_y = j + 1;
                int lb_x = i + 1;
                int lb_y = j;
                t[i][j] = new Cell(lu_x, lu_y, ru_x, ru_y, rb_x, rb_y, lb_x, lb_y);
            }
        }
        return t;
    }
}

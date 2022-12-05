package org.example;

public class Cell {
    public int lu_x, lu_y, ru_x, ru_y, rb_x, rb_y, lb_x, lb_y;
    public double dist;
    Cell(int lu_x, int lu_y, int ru_x, int ru_y, int rb_x, int rb_y, int lb_x, int lb_y) {
        this.lu_x = lu_x;
        this.lu_y = lu_y;
        this.ru_x = ru_x;
        this.ru_y = ru_y;
        this.rb_x = rb_x;
        this.rb_y = rb_y;
        this.lb_x = lb_x;
        this.lb_y = lb_y;
        this.dist = 0;
    }

    public void Print() {
        System.out.println("{" + this.lu_x + ", " + this.lu_y + "} {" + this.ru_x + ", " + this.ru_y + "}");
        System.out.println("{" + this.lb_x + ", " + this.lb_y + "} {" + this.rb_x + ", " + this.rb_y + "}");
        System.out.println();
    }
}
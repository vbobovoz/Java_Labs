package org.example;

//import java.math.BigDecimal;
//import java.math.BigInteger;
import java.util.Formatter;
import java.util.Scanner;
import java.text.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter X from [-1, 1): ");
        double X = sc.nextDouble();
        if(X < -1 || X >= 1){
            throw new Exception("Error! Enter X from range [-1, 1]");
        }

        System.out.print("Enter K: ");
        int K = sc.nextInt();

        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMaximumFractionDigits(K + 1);

        JustSeries obj = new JustSeries(X, K);
        //System.out.println("---Default---");
        System.out.println("  Series:     " + formatter.format(obj.Solution()));
        System.out.println("  ln(1-x):    " + formatter.format(Math.log(1 - X)));

        double double_res = obj.Solution() * 100;
        int int_res = (int)Math.abs(obj.Solution() * 100);
        Formatter fmt = new Formatter();
        fmt.format("1) OCT = %o, HEX = %x", int_res, int_res);
        System.out.println("\n---  INT NUM: " + int_res + "  ---");
        System.out.println("---  DOUBLE NUM: " + double_res + "  ---");
        System.out.println(fmt);

        Formatter fmt1 = new Formatter();
        fmt1.format("2) Positive = %f, Negative = %f", double_res, -double_res);
        System.out.println(fmt1);

        Formatter fmt2 = new Formatter();
        fmt2.format("3) |%f|, |%12f|, |%012f|", double_res, double_res, double_res);
        System.out.println(fmt2);

        Formatter fmt3 = new Formatter();
        fmt3.format("4) 1 decimal place: %.1f%n   5 decimal place: %.5f", double_res, double_res);
        System.out.println(fmt3);

        Formatter fmt4 = new Formatter();
        fmt4.format("5) +: %+d%n% d%n% d", int_res, int_res, -int_res);
        System.out.println(fmt4);
        Formatter fmt4_1 = new Formatter();
        fmt4_1.format("   ,: %,.2f", double_res * 10000);
        System.out.println(fmt4_1);
        Formatter fmt4_2 = new Formatter();
        fmt4_2.format("   (: % (d", -int_res);
        System.out.println(fmt4_2);

        Formatter fmt5 = new Formatter();
        fmt5.format("6) %5$d %1$d %4$d %2$d %3$d", 10, 20, 30, 40, 50);
        System.out.println(fmt5);

        /*Big_Series b_obj = new Big_Series(X, K);
        System.out.println("---Big---");
        System.out.println("  Big_Series: " + formatter.format(b_obj.Big_Solution()));
        System.out.println("  ln(1-x):    " + formatter.format(Math.log(1 - X)));*/
    }
}


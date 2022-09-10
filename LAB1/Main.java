import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
import java.text.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter X from [-1, 1): ");
        double X = sc.nextDouble();
        if(X < -1 || X >= 1){
            System.out.println("ERROR! Enter X from range [-1, 1)");
            return;
        }

        System.out.print("Enter K: ");
        int K = sc.nextInt();

        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMaximumFractionDigits(K + 1);

        Just_Series obj = new Just_Series(X, K);
        System.out.println("---Default---");
        System.out.println("  Series:     " + formatter.format(obj.Solution()));
        System.out.println("  ln(1-x):    " + formatter.format(Math.log(1 - X)));

        Big_Series b_obj = new Big_Series(X, K);
        System.out.println("---Big---");
        System.out.println("  Big_Series: " + formatter.format(b_obj.Big_Solution()));
        System.out.println("  ln(1-x):    " + formatter.format(Math.log(1 - X)));
    }
}

class Just_Series {
    int k;
    double x, eps;

    Just_Series(double X, int K){
        x = X;
        k = K;
        eps = Math.pow(10, -k);
    }

    double Solution(){
        double sum = 0;
        boolean flag = true;
        int n = 1;

        while(flag){
            double tmp = Math.pow(x, n) / n;
            if(Math.abs(tmp) > eps){
                sum += (-tmp);
                n++;
            } else{
                flag = false;
            }
        }
        return sum;
    }
}

class Big_Series {
    BigInteger k;
    BigDecimal x;
    BigDecimal eps;

    Big_Series(double X, int K){
        k = BigInteger.valueOf(K);
        x = BigDecimal.valueOf(X);
        double t_eps = Math.pow(10, -K);
        eps = BigDecimal.valueOf(t_eps);
    }

    BigDecimal Big_Solution(){
        BigDecimal big_sum = BigDecimal.valueOf(0);
        BigDecimal n = BigDecimal.valueOf(1);
        boolean flag = true;

        while(flag){
            BigDecimal tmp = BigDecimal.valueOf(Math.pow(x.doubleValue(), n.intValue()) / n.intValue());
            if(tmp.abs().compareTo(eps) == 1){
                big_sum = big_sum.add(tmp);
                n = n.add(BigDecimal.valueOf(1));
            } else{
                flag = false;
            }
        }
        big_sum = big_sum.negate();
        return big_sum;
    }
}
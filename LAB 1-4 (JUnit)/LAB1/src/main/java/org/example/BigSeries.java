package org.example;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigSeries {
    BigInteger k;
    BigDecimal x;
    BigDecimal eps;

    BigSeries(double X, int K){
        k = BigInteger.valueOf(K);
        x = BigDecimal.valueOf(X);
        double t_eps = Math.pow(10, -K);
        eps = BigDecimal.valueOf(t_eps);
    }

    BigDecimal BigSolution() throws Exception {
        BigDecimal ex1 = new BigDecimal("1");
        BigDecimal ex2 = new BigDecimal("-1");
        if(x.compareTo(ex1) > 0 || x.compareTo(ex2) < 0) {
            throw new Exception("Error! Enter X from range [-1, 1]");
        }
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
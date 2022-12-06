package org.example;

public class JustSeries {
    int k;
    double x, eps;

    JustSeries(double X, int K){
        x = X;
        k = K;
        eps = Math.pow(10, -k);
    }

    double Solution() throws Exception {
        if(x > 1 || x < -1) {
            throw new Exception("Error! Enter X from range [-1, 1]");
        }
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

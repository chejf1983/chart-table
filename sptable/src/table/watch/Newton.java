/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table.watch;

/**
 *
 * @author Administrator
 */
public class Newton {

    /*牛顿插值法*/
    public static double[] Newton_inter_method(double[] X, double[] Y, double X0[]) {
        double Y0[] = new double[X0.length];

        int x_left = 0;
        int x_right = 0;
        for (int i = 0; i < X0.length; i++) {
            for (int j = x_left; j < X.length; j++) {
                if (X[j] >= X0[i]) {
                    x_left = j - 1 > 0 ? j - 1 : 0;
                    x_right = j;
                    if (x_left == x_right) {
                        Y0[i] = Y[x_left];
                    } else {
                        double u = (X0[i] - X[x_left]) / (X[x_right] - X[x_left]);
                        Y0[i] = Y[x_left] + u * (Y[x_right] - Y[x_left]);
                    }
                    break;
                }
            }
        }
        return Y0;
    }
    
    
}

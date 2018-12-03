package monte_carlo;

/**
 * Created by taleko01 on 12/3/2018
 */

public class PiApprox {

    /*
    Monte Carlo pi approximation

    Consider circle with radius 0.5 units (diameter 1 unit) enclosed inside square of side 1 unit.

    Area of circle = pi * 0.5 * 0.5 = Number of points enclosed by circle = NC
    Area of square = 1 = Number of points enclosed by Square = NT

    pi = 4 * NC / NT.

    Note this is an approximation and not strict equality. More points considered, more accurate value.

    Further reading : https://academo.org/demos/estimating-pi-monte-carlo/

     */

    public static void main(String... args) {

        double circlePoints = 0.0;
        double squarePoints = 0.0;
        double piApprox;

        for (double x = 0.0; x <= 1.0; x += 0.001) {
            for (double y = 0.0; y <= 1.0; y += 0.001) {
                squarePoints++;
                if (isCirclePoint(x, y)) {
                    circlePoints++;
                }
            }
        }

        piApprox = 4 * circlePoints / squarePoints;

        System.out.println(piApprox);

    }

    private static boolean isCirclePoint(double x, double y) {
        /*
         circle equation : x * x + y * y = r * r
         r = 0.5 in this case
          */
        return (x - 0.5) * (x - 0.5) + (y - 0.5) * (y - 0.5) <= 0.25;
    }
}

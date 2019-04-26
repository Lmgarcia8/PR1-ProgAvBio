package org.uma.pab19;

/**
 * Class containing a method to compute the factorial of an integer number
 *
 * @author L.Garcia
 */
public class Factorial {
    /**
     * @param number
     * @return The factorial of an integer number
     */
    public double compute(int number) {
        double result;

        if (number < 0) {
            throw new RuntimeException("The value is negative" + number);

        } else if ((number == 0) || (number == 1)) {
            result = 1;
        } else {
            result = number * compute(number - 1);
        }
        return result;
    }
}

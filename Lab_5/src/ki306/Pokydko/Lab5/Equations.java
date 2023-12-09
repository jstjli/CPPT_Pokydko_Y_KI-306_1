
/**
 * lab 5 package
 */
package ki306.Pokydko.Lab5;

/**
 * Class Equations implements calculation algorithm
 *
 * @author Pokydko Yulia
 * @version 1.0
 */
class Equations {
    /** Method calculates the (cos(2x)/ctg(3x-1)) expression
     *
     * @param x
     * @return
     * @throws CalcException
     */
    public double calculate(int x) throws CalcException {
        double y, rad, rad1;
        rad = x * Math.PI / 180.0;
        rad1 = (x * 3.0 - 1.0) * Math.PI / 180.0;
        try {
            y = (Math.cos(rad * 2.0) * Math.tan(rad1));
//Якщо результат не є числом, то генеруємо виключення
            if (y == Double.NaN || y == Double.NEGATIVE_INFINITY || y == Double.POSITIVE_INFINITY || (double)x % (30.0 + 1.0 / 3.0) == 0.0 || Math.abs((double)x) % (29.0 + 2.0 / 3.0) == 0.0)
                throw new ArithmeticException();
        } catch (ArithmeticException ex) {
//створимо виключення вищого рівня з поясненням причини
//виникнення помилки
            if ((double)x % (30.0 + 1.0 / 3.0) == 0.0 || Math.abs((double)x) % (29.0 + 2.0 / 3.0) == 0.0)
                throw new CalcException("Exception reason: Illegal value of X for tangent calculation");
            else
                throw new CalcException("Unknown reason of the exception during exception calculation");
        }
        return y;
    }
}

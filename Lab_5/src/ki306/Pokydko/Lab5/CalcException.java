/**
 * Lab 5 package
 */
package ki306.Pokydko.Lab5;
/**
 * Class CalcException implements calculation exceptions
 *
 * @author Pokydko Yulia
 * @version 1.0
 */
class CalcException extends ArithmeticException {

    /**
     * Constructor
     */
    public CalcException() {
    }

    /**
     * Constructor
     *
     * @param cause
     */
    public CalcException(String cause) {
        super(cause);
    }
}

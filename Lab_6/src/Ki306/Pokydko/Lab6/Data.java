/**
 * lab 6 package
 */
package Ki306.Pokydko.Lab6;

/**
 * Interface Data describes rules for data type
 *
 * @author Pokydko Yulia
 * @version 1.0
 */
public interface Data {

    /**
     * Method prints info about thing
     */
    public void print();

    /**
     * Method returns thing's weight
     */
    public int getWeight();

    /**
     * Method compares current Thing with another Thing
     *
     * @param Data
     */
    public int compareTo(Data d);
}


/**
 * lab 6 package
 */
package Ki306.Pokydko.Lab6;

/**
 * Class Goods implements goods
 *
 * @author Pokydko Yulia
 * @version 1.0
 */
public class Goods implements Data {

    /**
     * Constructor
     */
    public Goods() {
        this.weight = 20;
    }

    /**
     * Constructor
     *
     * @param weight
     */
    public Goods(int weight) {
        this.weight = weight;
    }

    private int weight;

    /**
     * Method prints info about thing
     */
    @Override
    public void print() {
        System.out.println("Type: goods");
        System.out.println("Weight: " + weight + " g");
    }

    /**
     * Method returns thing's weight
     */
    @Override
    public int getWeight() {
        return weight;
    }

    /**
     * Method compares current data with another data
     */
    @Override
    public int compareTo(Data d) {
        if (this.weight > d.getWeight())
            return 1;
        if (this.weight == d.getWeight())
            return 0;
        return -1;
    }
}


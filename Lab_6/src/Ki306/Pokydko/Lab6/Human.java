package Ki306.Pokydko.Lab6;
/**
 * lab 6 package
 */

/**
 * Class Human implements human
 *
 * @author Pokydko Yulia
 * @version 1.0
 */
public class Human implements Data {

    /**
     * Constructor
     */
    public Human() {
        this.weight = 50;
    }

    /**
     * Constructor
     *
     * @param weight
     */
    public Human(int weight) {
        this.weight = weight;
    }

    private int weight;

    /**
     * Method prints info about thing
     */
    @Override
    public void print() {
        System.out.println("Type: human");
        System.out.println("Weight: " + weight + " g");
    }

    /**
     * Method returns human's weight
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


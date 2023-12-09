/**
 * lab 6 package
 */
package Ki306.Pokydko.Lab6;

import java.util.ArrayList;

/**
 * Class Wagon implements wagon
 *
 * @author Pokydko Yulia
 * @version 1.0
 */
public class Wagon<T extends Data> {

    /**
     * Constructor
     */
    public Wagon() {
        list = new ArrayList<T>();
    }

    ArrayList<T> list;

    /**
     * Method puts thing into a wagon
     */
    public void add(T t) {
        list.add(t);
    }

    /**
     * Method prints info about thing
     */
    public void get(int index) {
        list.get(index).print();
    }

    /**
     * Method removes thing from wagon
     */
    public void remove(int index) {
        list.remove(index);
    }

    /**
     * Method prints weight of wagon
     */
    public void weight() {
        int sumWeight = 0;
        for (T t : list)
            sumWeight += t.getWeight();
        System.out.println("Weight of goods and people in this wagon is: " + sumWeight + "kg");
    }

    /**
     * Method returns thing with the greatest weight
     */
    public T findMax() {
        T max = list.get(0);
        for (T t : list)
            if (t.compareTo(max) == 1)
                max = t;
        return max;
    }
}

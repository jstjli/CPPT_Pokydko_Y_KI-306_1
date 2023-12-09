/**
 * lab 6 package
 */
package Ki306.Pokydko.Lab6;

/**
 * Driver class implements main method for Box class possibilities demonstration
 *
 * @author Pokydko Yulia
 * @version 1.0
 */
public class Driver {

    public static void main(String[] args) {
        Wagon<? super Data> wagon = new Wagon<Data>();
        wagon.add(new Goods(150));
        wagon.add(new Human(80));
        wagon.add(new Goods(180));
        wagon.add(new Human());
        wagon.add(new Goods());
        wagon.add(new Human(90));
        wagon.weight();
        wagon.remove(0);
        wagon.weight();
        Data thing = wagon.findMax();
        System.out.println("The heaviest data is: ");
        thing.print();
    }
}

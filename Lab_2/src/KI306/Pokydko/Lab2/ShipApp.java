/**
 * lab 2 package
 */
package KI306.Pokydko.Lab2;

import java.io.FileNotFoundException;

/**
 * ShipApp class implements main method for Ship class possibilities demonstration
 *
 * @author Pokydko Yulia
 * @version 1.0
 */
public class ShipApp {

    public static void main(String[] args) throws FileNotFoundException {
        Ship ship = new Ship(80000, 250, 15000);
        ship.startEngine();
        ship.setSpeed(20);
        ship.rudderLeft();
        ship.rudderRight();
        ship.rudderAlign();
        ship.stopEngine();
        ship.info();
        ship.dispose();
    }
}

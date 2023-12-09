/**
 * lab 3 package
 */
package ki306.Pokydko.Lab3;

import java.io.FileNotFoundException;

/**
 * FrigateApp class implements main method for Frigate class possibilities demonstration
 *
 * @author Pokydko Yulia
 * @version 1.0
 */
public class FrigateApp {
    public static void main(String[] args) throws FileNotFoundException{
        Frigate ship = new Frigate(80000, 250, 15000);
        ship.startEngine();
        ship.setSpeed(20);
        ship.rudderLeft();
        ship.rudderRight();
        ship.rudderAlign();
        ship.shoot();
        ship.stopEngine();
        ship.info();
        ship.dispose();
    }
}

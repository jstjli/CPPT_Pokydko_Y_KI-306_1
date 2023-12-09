/**
 * lab 3 package
 */
package ki306.Pokydko.Lab3;

import java.io.FileNotFoundException;

/**
 * Class Frigate implements frigate
 *
 * @author Pokydko Yulia
 * @version 1.0
 */

public class Frigate extends Ship implements Military {
    /**
     * Constructor
     *
     * @throws FileNotFoundException
     */
    public Frigate() throws FileNotFoundException{
        super();
    }
    /**
     * Constructor
     *
     * @param height
     * @param weight
     * @param square
     * @throws FileNotFoundException
     */
    public Frigate(int height, int weight, int square) throws FileNotFoundException{
        super(height,weight,square);
    }

    /**
     * Method implements shooting
     */
    @Override
    public void shoot(){
        System.out.println("Type of ship: Frigate");
        fout.println("Set...Shoot...*Boom*!!!!");
    }

    /**
     * Method shows up the ship's info
     */
    @Override
    public void info(){
        super.info();
        System.out.println("Type of ship: Frigate");
        fout.println("Type of ship: Frigate");
    }
}

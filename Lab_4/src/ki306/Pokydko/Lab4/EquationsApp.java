/**
 * lab 4 package
 */
package ki306.Pokydko.Lab4;
import java.util.Scanner;
import java.io.*;
import static java.lang.System.out;

/**
 * Class EquationsApp demonstrate the program
 *
 * @author Pokydko Yulia
 * @version 1.0
 */
public class EquationsApp {
    /**
     * Method main
     * @param args
     */
    public static void main(String[] args){
        try {
            out.print("Enter the file's name: ");
            Scanner in = new Scanner(System.in);
            String fName = in.nextLine();
            PrintWriter fout = new PrintWriter(new File(fName));
            try {
                try {
                    Equations eq = new Equations();
                    out.print("Enter X: ");
                    fout.print(eq.calculate(in.nextInt()));
                } finally {
// Цей блок виконається за будь-яких обставин
                    fout.flush();
                    fout.close();
                }
            } catch (CalcException ex) {

// Блок перехоплює помилки обчислень виразу
                out.print(ex.getMessage());
            }
        } catch (FileNotFoundException ex) {

// Блок перехоплює помилки роботи з файлом навіть якщо вони
// виникли у блоці finally
            out.print("Exception reason: Perhaps wrong file path");
        }
    }

}

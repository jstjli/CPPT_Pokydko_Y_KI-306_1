import java.io.*;
import java.util.*;

/**
 * Class Lab1PokydkoKI306 implements laboratory work №2
 * @author Pokydko Yulia
 * @version 1.0
 * @since version 1.0
 *
 */

public class Lab1PokydkoKI306 {
    /**
     * The static main method is the entry point to the program.
     *
     * @param args
     *@throws FileNotFoundException
     *
     */
    public static void main(String[] args) throws FileNotFoundException {
        int nRows;
        char[][] arr;
        String filler;
        Scanner in = new Scanner(System.in);
        File dataFile = new File("MyFile.txt");
        PrintWriter fout = new PrintWriter(dataFile);

        System.out.print("Введіть розмір квадратної матриці: ");
        nRows = in.nextInt();
        in.nextLine();

        arr = new char[nRows][];
        for (int i = 0; i < nRows; i++) {
            arr[i] = new char[nRows];
        }

        System.out.print("\nВведіть символ-заповнювач: ");
        filler = in.nextLine();

        exit: for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < nRows; j++) {
                if (filler.length() == 1) {
                    if (j <= nRows && j != 0 && i != 0 && i != nRows - 1 && j != nRows - 1) {
                        arr[i][j] = (char) filler.codePointAt(0);
                        System.out.print(arr[i][j] + " ");
                        fout.print(arr[i][j] + " ");
                    } else {
                        arr[i][j] = (char) filler.codePointAt(0);
                        System.out.print(" ");
                        fout.print(" ");
                    }
                } else if (filler.length() == 0) {
                    System.out.print("\nНе введено символ заповнювач");
                    break exit;
                } else {
                    System.out.print("\nЗабагато символів заповнювачів");
                    break exit;
                }
            }
            System.out.print("\n");
            fout.print("\n");
        }

        fout.flush();
        fout.close();

    }
}

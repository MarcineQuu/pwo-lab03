package pwo;

import java.math.BigDecimal;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Zadanie1 {

    public static final int FROM = 0, TO = 100;
    public static final String FILE_NAME = "fibseq100.txt";
    public static final String LUCAS_FILE_NAME = "lucaseq100.txt";

    public static void main(String[] args) {

        System.out.println("Fibonacci wersja 2");

        boolean ok = SequenceTools.writeToFile(
                new FibonacciGenerator(), FROM, TO, FILE_NAME);

        if (ok) {
            System.out.println("Wynik zapisany do pliku: "
                    + FILE_NAME);
        } else {
            System.out.println("Błąd");
        }
        
        System.out.println("Ciąg Lucasa");

        boolean lucasOk = SequenceTools.writeToFileLuc(
                new LucasGenerator(), FROM, TO, LUCAS_FILE_NAME);

        if (lucasOk) {
            System.out.println("Wynik ciągu Lucasa zapisany do pliku: " + LUCAS_FILE_NAME);
        } else {
            System.out.println("Błąd w generowaniu ciągu Lucasa");
        }
        
    }
}

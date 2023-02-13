import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        String[] arrayAlphabet = {
                "Aa", "Bb", "Cc", "Dd", "Ee", "Ff",
                "Gg", "Hh", "Ii", "Jj", "Kk", "Ll", "Mm",
                "Nn", "Oo", "Pp", "Qq", "Rr", "Ss",
                "Tt", "Uu", "Vv", "Ww", "Xx", "Yy", "Zz",
                "0","1", "2", "3", "4", "5", "6", "7", "8", "9"};

        FileWriter fileWriter = new FileWriter("alphabet");
        for (String s : arrayAlphabet) {
            fileWriter.write(s + "\n");
        }
        fileWriter.close();
        FileReader fileReader = new FileReader("alphabet");
        Scanner scanner = new Scanner(fileReader);
        int numbers = arrayAlphabet.length;
        while (scanner.hasNext()) {
            for (int i = 0; i < numbers; i++) {
                System.out.println(i + 1 + ": " + scanner.nextLine());
            }
        }
    }
}
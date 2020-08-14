package Task31;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) {
        try (BufferedReader buff = new BufferedReader(new FileReader("src\\Files\\f2.txt"))) {
            String text = buff.readLine();
            int sum = 0;
            for (char a : text.toCharArray()) {
                if ((byte) a >= 48 && (byte) a <= 57) {
                    sum += (byte) a - 48;
                }
            }
            System.out.println(sum);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

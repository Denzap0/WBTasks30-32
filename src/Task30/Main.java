package Task30;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        /*try(FileWriter fout = new FileWriter("src\\Files\\f.txt")){
            fout.write("Hello, guys, i am from Belarus");
        } catch(IOException e){
            e.printStackTrace();
        }*/
        try (FileReader fin = new FileReader("src\\Files\\f.txt")) {
            int curByte, wordPointer = 0, punctuationPointer = 0;
            while ((curByte = fin.read()) != -1) {
                if (curByte == ' ') {
                    wordPointer++;
                }
                if ((curByte >= 33 && curByte <= 47) || (curByte >= 58 && curByte <= 63)) {
                    punctuationPointer++;
                }
            }
            wordPointer++;
            System.out.println("Num of words: " + wordPointer + "\nNum of punctuation marks: " + punctuationPointer);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

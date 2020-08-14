package Task32;

import java.io.*;

public class Main3 {
    public static void main(String[] args) {
        try (DataOutputStream dout = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("src\\Files\\binary.txt")))) {
            for (int i = 0; i < 20; i++) {
                dout.writeInt(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (DataInputStream din = new DataInputStream(new BufferedInputStream(new FileInputStream("src\\Files\\binary.txt")))) {
            for (int i = 0; i < 20; i++) {
                System.out.println(din.readInt());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package ua.natl.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MultipleCatch {

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        FileInputStream file;
        int x;
        String fileName = "some file name";

        try {
            file = new FileInputStream(fileName);
            x = (byte) file.read();
        } catch (FileNotFoundException f) {
            f.printStackTrace();
        } catch (IOException i) {
            i.printStackTrace();
        }

    }

}

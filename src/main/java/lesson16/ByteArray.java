package lesson16;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by asv on 15.03.17.
 */
public class ByteArray {

    public static void main(String[] args) throws IOException {
        byte[] bytes = new byte[1024];

//write data into byte array...

        InputStream input = new ByteArrayInputStream(bytes);

//read first byte
        int data = input.read();
        while(data != -1) {
            //do something with data

            //read next byte
            data = input.read();
        }
    }
}

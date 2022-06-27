package com.sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadFiles {
  public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:/Demo.txt");
            int a = fis.read();
            System.out.println((char)a);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

/* public static void main(String[] args) {
     try {
         FileOutputStream fis = new FileOutputStream("D:/Test.pdf");
     } catch (FileNotFoundException e) {
         throw new RuntimeException(e);
     }
 }

 */
}

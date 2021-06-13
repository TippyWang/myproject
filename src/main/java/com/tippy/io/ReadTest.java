package com.tippy.io;

import java.io.*;

public class ReadTest {
    public static void main(String[] args) {
//        bufferReader();
//        fileReader();
//        inputStream();
    }

    private static void bufferReader() {
        System.out.println("-- BufferedReader --");
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("data.txt"));
            String line = bufferedReader.readLine();
            while (line != null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("-- End --");
    }

    private static void fileReader() {
        try {
            System.out.println("-- FileReader --");
            FileReader fileReader = new FileReader("data.txt");
            int num = fileReader.read();
            System.out.println("int to char : ");
            while (num != -1){
                System.out.print((char)num);
                num = fileReader.read();
            }
            System.out.println("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("-- End --");
    }

    private static void inputStream() {
//        讀出中文出現錯誤
        System.out.println("-- FileInputStream --");
        File file = new File("data.txt");
        System.out.println("File exists : " + file.exists());
        System.out.println("File Path : " + file.getAbsolutePath());
        try {
            System.out.println("int to char : ");
            InputStream inputStream = new FileInputStream(file);
            int num = inputStream.read();
            while (num != -1){
                System.out.print((char)num);
                num = inputStream.read();
            }
            System.out.println("");
        }catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println("FileNotFoundException Error : " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IOException Error : " + e.getMessage());
        }
        System.out.println(" -- End -- ");
    }
}

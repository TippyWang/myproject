package com.tippy.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTest {

    public static void main(String[] args) throws IOException {
        File fileDir = new File("D:\\JavaProject\\outputDir");
        fileDir.mkdir();
        FileWriter fileWriter = new FileWriter("D:\\JavaProject\\outputDir\\output.txt");
        fileWriter.write("哈摟 ~~  !!");
        fileWriter.flush();
        fileWriter.close();
    }
}

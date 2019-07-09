package com.company;

import java.io.*;

public class ReadWrite {

    public static void main(String[] args) throws IOException {

        write();
        read();

    }

    static void write() throws IOException {

        FileWriter fileWriter=new FileWriter("/home/user/IdeaProjects/sample.txt");
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);

        for (int i = 0; i < 10 ; i++) {
            bufferedWriter.write("Line " + i + "\t");
            //bufferedWriter.newLine();
        }

        bufferedWriter.close();
        System.out.println("Writing done");

    }
    static void read() throws IOException {

        FileReader fileReader=new FileReader("/home/user/IdeaProjects/sample.txt");
        BufferedReader bufferedReader=new BufferedReader(fileReader);

        System.out.println("Reading");
        String line;

        while ((line=bufferedReader.readLine()) != null){
            System.out.println(line);
        }



    }

}

package Newone11_21_IOStream.SimpleWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class SimpleWriter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try(Writer out = new FileWriter("data.txt")){
            out.write('A');
            out.write('한');
            out.write(scan.nextLine());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

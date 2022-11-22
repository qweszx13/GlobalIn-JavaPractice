package Newone11_21_IOStream.FileReaderPrac;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class FileReaderPrac {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("읽을 파일: ");
        String src = scan.nextLine();

        try(Reader in = new FileReader(src)){
            int ch;

            while(true){
                ch = in.read();
                if(ch == -1){
                    break;
                }
                System.out.print((char)ch);
            }
        }catch(IOException e){

        }

    }
}

package Newone11_21_IOStream.SimpleWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class SimpleWriter2 {
    public static void main(String[] args) {
        try(Writer out = new FileWriter("data.txt")){
            for(int ch = (int)'A'; ch< (int)'Z';ch++){
                out.write(ch);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

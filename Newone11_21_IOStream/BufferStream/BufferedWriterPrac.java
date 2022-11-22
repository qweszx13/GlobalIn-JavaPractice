package Newone11_21_IOStream.BufferStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterPrac {
    public static void main(String[] args) {
        String ks = "공부에 있어서 돈이 꼭 필요하다.";
        String es = "life is short if you know how to use it";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("String.txt"))){
            bw.write(ks, 0,ks.length());
            bw.newLine();
            bw.write('\n');//하지만 사용금지 운영체제별 줄바꿈의 방법이 다르다 \n 이 안먹힐수있음
            bw.write(es,0,es.length());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

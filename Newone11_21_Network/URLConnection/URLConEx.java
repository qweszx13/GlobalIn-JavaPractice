package Newone11_21_Network.URLConnection;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class URLConEx {
    public URLConEx(){
        String code = null;
        System.out.println("웹 주소를 입력하셈");
        Scanner scan = new Scanner(System.in);
        String address = scan.next();

        try{
            URL url = new URL(address);
            System.out.println(url);
            URLConnection con = url.openConnection();//빨때꼽기 빨때 꼽는 함수가있을거임
            System.out.println(con);
            BufferedReader webData = new BufferedReader(new InputStreamReader(con.getInputStream()));//con.getInputSteam 꽃은빨대빨기
            FileWriter fw = new FileWriter("/Users/nanoblock/global_practice/file.html",false);
            while((code=webData.readLine()) != null){
                fw.write(code);
            }
            System.out.println("The END");

            fw.close();
            webData.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

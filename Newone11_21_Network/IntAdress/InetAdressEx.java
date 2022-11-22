package Newone11_21_Network.IntAdress;

import java.net.InetAddress;
import java.util.Scanner;

public class InetAdressEx {
    Scanner scan;

    public InetAdressEx(){
        System.out.println("Host 이름을 입력해주세요");

        scan = new Scanner(System.in);
        try{
            InetAddress inetAdressEx = InetAddress.getByName(scan.next());
            System.out.println("Computer Name :"+inetAdressEx.getHostName());
            System.out.println("Computer Ip :"+inetAdressEx.getAddress());
            System.out.println("이건뭐임? : "+inetAdressEx.getCanonicalHostName());

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

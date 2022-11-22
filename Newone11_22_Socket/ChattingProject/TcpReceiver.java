package Newone11_22_Socket.ChattingProject;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TcpReceiver extends Thread {
    Socket socket;
    DataInputStream in;
    String name;

    public TcpReceiver(Socket socket){
        try{
            in = new DataInputStream(socket.getInputStream());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public void run() {
        while (in != null){
            try{
                System.out.println(in.readUTF());
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

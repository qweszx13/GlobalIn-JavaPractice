package Newone11_22_Socket.ChattingProject;


import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TcpSender extends Thread {
    Socket socket;
    DataOutputStream out;
    String name;

    public TcpSender(Socket socket){
        try{
            out = new DataOutputStream(socket.getOutputStream());
            name = "["+socket.getInetAddress()+"|"+socket.getPort()+"]";
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public void run() {
        Scanner scan = new Scanner(System.in);
        while (out != null){
            try{
                out.writeUTF(name+scan.nextLine());
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

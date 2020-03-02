import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) throws IOException {
        ServerSocket s = new ServerSocket(4333);
        Socket sr = s.accept();
        FileInputStream fr = new FileInputStream("labwork1/src/test_tcp_input.txt");
        byte[] b = new byte[20002];
        fr.read(b, 0, b.length);
        OutputStream os = sr.getOutputStream();
        os.write(b, 0, b.length);
    }
}

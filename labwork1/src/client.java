import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class client {
    public static void main(String[] args) throws IOException {
        byte[] b = new byte[20002];
        Socket sr = new Socket("localhost", 4333);
        InputStream is = sr.getInputStream();
        FileOutputStream fr = new FileOutputStream("labwork1/src/test_tcp_result.txt");
        is.read(b, 0, b.length);
        fr.write(b, 0, b.length);

    }
}

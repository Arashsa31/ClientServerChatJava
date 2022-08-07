import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


/**
 * @author Arash
 *
 */
public class Server {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		Socket socket = new ServerSocket(6789).accept();
		Scanner iStream = new Scanner(new InputStreamReader(socket.getInputStream()));
		
		System.out.println("Waiting for connection: ");
		System.out.println(socket.getInetAddress());
		
		while(iStream.hasNext()) {
			System.out.println(iStream.nextLine());
		}
		
		iStream.close();
	}

}

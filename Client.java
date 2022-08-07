import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;


/**
 * @author Arash
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		Socket socket = new Socket("localhost", 6789);
		PrintWriter oStream = new PrintWriter(new DataOutputStream(socket.getOutputStream()));
		Scanner keyboard = new Scanner(System.in);
		
		while(true) {
			String message = keyboard.nextLine();
					
					if(message.equalsIgnoreCase("quit"))
						break;
			
			oStream.println(message);
			oStream.flush();
		}
		
		oStream.close();


	}

}

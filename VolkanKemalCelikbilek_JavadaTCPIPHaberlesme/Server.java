import java.net.*;
import java.io.*;

public class Server {
	public static void main(String[] args) throws IOException {

		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(5555);
		} catch (IOException e) {
			System.err.println("I/O exception: " + e.getMessage());
			System.exit(1);
		}
		System.out.println("Sunucu baslatildi. Baglanti bekleniyor...");
		Socket clientSocket = null;
		try {
			clientSocket = serverSocket.accept(); // baðlantý gelene kadar burada bekler
		} catch (IOException e) {
			System.err.println("Accept failed.");
			System.exit(1);
		}
		
		System.out.println(clientSocket.getLocalAddress() + " baglandi.");
		
		// input stream ve output stream yaratýlýyor...
		PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
		BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
	
		String inputLine, outputLine;
		System.out.println("Ýstemciden girdi bekleniyor...");
		while ((inputLine = in.readLine()) != null) { // istemciden gelen string okunuyor...
			System.out.println("istemciden gelen :" + inputLine);
			outputLine = inputLine.toUpperCase(); // gelen string büyük harflere çevriliyor...
			out.println(outputLine); // büyük harflere çevrilen string istemciye yollanýyor...
			if (outputLine.equals("BYE")) // istemciden "bye" gelmiþse döngüden çýk.
				break;
		}
		System.out.println(clientSocket.getLocalSocketAddress() + " baglantisi kesildi.");
		// stream ve socketleri kapat.
		out.close();
		in.close();
		clientSocket.close();
		serverSocket.close();
	}
}
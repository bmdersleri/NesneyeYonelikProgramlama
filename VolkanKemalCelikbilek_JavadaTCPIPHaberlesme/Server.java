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
			clientSocket = serverSocket.accept(); // ba�lant� gelene kadar burada bekler
		} catch (IOException e) {
			System.err.println("Accept failed.");
			System.exit(1);
		}
		
		System.out.println(clientSocket.getLocalAddress() + " baglandi.");
		
		// input stream ve output stream yarat�l�yor...
		PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
		BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
	
		String inputLine, outputLine;
		System.out.println("�stemciden girdi bekleniyor...");
		while ((inputLine = in.readLine()) != null) { // istemciden gelen string okunuyor...
			System.out.println("istemciden gelen :" + inputLine);
			outputLine = inputLine.toUpperCase(); // gelen string b�y�k harflere �evriliyor...
			out.println(outputLine); // b�y�k harflere �evrilen string istemciye yollan�yor...
			if (outputLine.equals("BYE")) // istemciden "bye" gelmi�se d�ng�den ��k.
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
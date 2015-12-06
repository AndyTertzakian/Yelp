package ca.ece.ubc.cpen221.mp5.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import ca.ece.ubc.cpen221.mp5.RestaurantDB;


// TODO: Implement a server that will instantiate a database, 
// process queries concurrently, etc.

public class RestaurantDBServer {
	
	public static RestaurantDB db;
	
	/**
	 * Constructor
	 * 
	 * @param port
	 * @param filename1
	 * @param filename2
	 * @param filename3
	 * @throws IOException 
	 */
	public RestaurantDBServer(int port, String restaurantFile, String userFile, String reviewFile) throws IOException {

		this.db = new RestaurantDB(restaurantFile, reviewFile, userFile);
		
	}
	
	public void runServer() {
		try {
			ServerSocket ss = new ServerSocket(6666);
			System.out.println("Server ready for all comers!");
			while(true) {
				Socket socket = ss.accept();
				System.out.println("Connection accepted from " + socket.getInetAddress());
				
				ClientHandler ch = new ClientHandler(socket);
				ch.start();
				System.out.println("Waiting for next client!");
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

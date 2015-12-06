package ca.ece.ubc.cpen221.mp5.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientHandler extends Thread{
	
	private Socket				socket;
	private DataInputStream		dis;
	private DataOutputStream	dos;

	public ClientHandler(Socket socket) {
		this.socket = socket;
		try {
			dis = new DataInputStream(socket.getInputStream());
			dos = new DataOutputStream(socket.getOutputStream());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		try {
			while (socket.isConnected()) {
				String msg = dis.readUTF();
				System.out.println("Message: " + msg + " received from: "
						+ socket.getInetAddress());
				dos.writeUTF("Server says: " + msg);

			}
			
			dis.close();
			dos.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

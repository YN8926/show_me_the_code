package hz.simplejee.jdk.io.bio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by wanghui on 3/20/16.
 */
public class TimerServer {
	public static void main(String[] args) {
		ServerSocket servSocket = null;
		
		try {
			servSocket = new ServerSocket(8091);
			System.out.println("server started!");
			Socket socket = null;
			while(true) {
				socket = servSocket.accept();
				System.out.println("accept.");
				new Thread(new TimeServerHandler(socket)).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(servSocket != null) {
				try {
					servSocket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	static class TimeServerHandler implements Runnable{

		private Socket socket;
		public TimeServerHandler(Socket socket) {
			this.socket = socket;
		}
		@Override
		public void run() {
			BufferedReader br = null;
			PrintWriter pw = null;
			
			try {
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				pw = new PrintWriter(this.socket.getOutputStream(), true);
				String body = null;
				while(true) {
					body = br.readLine();
					if(body == null) {
						break;
					}
					System.out.println("recv :" + body);
					if("time".equals(body)) {
						pw.write(new SimpleDateFormat("yyyy-MM-dd hh:MM:ss").format(new Date())+"\n");
					} else {
						pw.write("bad request.");
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if(br != null) {
						br.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				try {
					if(pw != null) {
						pw.close();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				try {
					if(socket != null) {
						socket.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
					
		}
		
	}
}

package com.greedy.section02.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws IOException {
		
		//1. 서버의 IP주소와 서버가 정한 포트번호를 매개변수로 하여 클라이언트용 소켓 객체 작성
		String serverIP = "192.168.0.161";//InetAddress.getLocalHost().getHostAddress();
		System.out.println(serverIP);
		int port = 8500;
		
		Socket socket = new Socket(serverIP, port);
		
		//2. 서버와의 입출력 스트림 오픈
		if(socket != null) {
			InputStream input = socket.getInputStream();
			OutputStream output = socket.getOutputStream();
			
		//3. 보조 스트림을 통해 성능 개선
			BufferedReader br = new BufferedReader(new InputStreamReader(input));
			PrintWriter bw = new PrintWriter(output);
		
		// 4. 스트릠을 통해 읽고 쓰기
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("대화입력 : ");
			String message = sc.nextLine();
			
			bw.println(message);
			bw.flush();
			
			if(("exit").equals(message)){
				break;
			}
		
		String recieveMessage = br.readLine();
		System.out.println(recieveMessage);
		sc.nextLine();
	
	}while (true);
	//통신종료
		socket.close();
		}
	}
}


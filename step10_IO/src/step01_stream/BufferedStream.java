package step01_stream;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStream {

	public static void main(String[] args) {
		// Buffer(8192) : 입력 혹은 출력에 대한 임시 저장공간 -> 데이터를 한번에 처리하는 보조 스트림
		// FileWritter - BufferedWriter
//		try {
//			BufferedWriter bw = new BufferedWriter(new FileWriter("cheerup.txt"));
//			bw.write("여러분" + "\n");
//			bw.write("안녕하세요" + "\n");
//			
//			bw.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		// BufferedReader
//		try {
//			BufferedReader br = new BufferedReader(new FileReader("cheerup.txt"));
//			String msg;
//				while((msg = br.readLine()) != null) {
//					System.out.println(msg);
//				}
//				br.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		// Bufferd 보조 스트림 성능 차이 실습
		long startTime;
		long endTime;
		
		// Bufferd 미사용
		try {
			FileInputStream fis = new FileInputStream("rain.jpg");
			
			startTime = System.currentTimeMillis();
			while(fis.read() != -1) {}
			endTime = System.currentTimeMillis();
			
			fis.close();
			System.out.println("미사용 :" + (endTime - startTime) + " 밀리초 입니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Bufferd 사용
		try {
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream("rain.jpg"));
			
			startTime = System.currentTimeMillis();
			while(bis.read() != -1) {}
			endTime = System.currentTimeMillis();
			
			bis.close();
			System.out.println("사용 :" + (endTime - startTime) + " 밀리초 입니다.");
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}

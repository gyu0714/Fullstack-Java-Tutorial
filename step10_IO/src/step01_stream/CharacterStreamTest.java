package step01_stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamTest {

	public static void main(String[] args) {
		// Writer
//		try {
//			FileWriter fw = new FileWriter("CharacterStream.txt");
//			fw.write("여행이 너무 가고싶어요" + "\n");
//			fw.write("어디로 가지?" + "\n");
//			
//			fw.write(new char[] {'가', '펑'});
//			fw.close();
//			System.out.println("저장 성공");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		// Reader
		try {
			FileReader fr = new FileReader("C:\\webfullstack/path.txt");
			
			try {
				int data;
				while((data = fr.read()) != -1) {
					System.out.print((char)data);
				}
			fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}

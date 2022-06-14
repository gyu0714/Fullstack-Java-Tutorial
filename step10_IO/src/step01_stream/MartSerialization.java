package step01_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import model.domain.Mart;

public class MartSerialization {

	public static void main(String[] args) {
		try {
			// 직렬화
			Mart mart = new Mart("Homeplus", "Daegu", 1234);
//			mart.setName("E-Mart");
//			mart.setAddress("Busan");
//			mart.setContact(0513334567);
			
			
			ObjectOutputStream oosMart = new ObjectOutputStream(new FileOutputStream("mart.txt"));
			oosMart.writeObject(mart);
			
			oosMart.close();
			
			System.out.println("입력 성공");
			
			
			// 역직렬화
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("mart.txt"));
			Mart martInput = (Mart)ois.readObject();
			System.out.println(martInput);
			
			
			ois.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}

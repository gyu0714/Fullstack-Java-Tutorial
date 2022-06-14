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
//			Mart mart = new Mart("Homeplus", "Daegu", 1234);
//			Mart mart2 = new Mart("E-Mart", "Busan", 2222);			
//			
//			ObjectOutputStream oosMart = new ObjectOutputStream(new FileOutputStream("mart.txt"));
//			oosMart.writeObject(mart);
//			oosMart.writeObject(mart2);
//			
//			oosMart.close();
//			
//			System.out.println("입력 성공");
			
			
			// 역직렬화
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("mart.txt"));
//			Mart martInput = (Mart)ois.readObject();
//			Mart martInput2 = (Mart)ois.readObject();
//			System.out.println(martInput2);
//			boolean flag = true;
//			while(flag) {
//				System.out.println(martInput1);				
//			}
			
			
			
			ois.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}

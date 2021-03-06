package step01_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import model.domain.Kid;

public class Serialization {

	public static void main(String[] args) {
		// 객체 출력 - ObjectOutpustStream
//		try {
//			FileOutputStream fos = new FileOutputStream("Object.txt");
//			ObjectOutputStream oos = new ObjectOutputStream(fos);
//			
//			oos.writeObject(new String("Busan"));
//			oos.writeObject(new Integer(1));
//			
//			oos.close();
//			fos.close();
//			
//			System.out.println("객체 출력 성공");
//			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		// 객체 입력 - ObjectInputStream
		try {
//			FileInputStream fis = new FileInputStream("Object.txt");
//			ObjectInputStream ois = new ObjectInputStream(fis);
//			
//			
//			System.out.println((String)ois.readObject());
//			System.out.println((Integer)ois.readObject());
//			
//			ois.close();
//			fis.close();
			
//			직렬화
//			Kid kidOut = new Kid();
//			kidOut.setName("Busan");
//			kidOut.setAge(27);
//			kidOut.setPersnalNumber(1234);
//			
//			ObjectOutputStream oosKid = new ObjectOutputStream(new FileOutputStream("kid.txt"));
//			oosKid.writeObject(kidOut);
//			
//			oosKid.close();
//			System.out.println("객체 출력 성공");
//			
//			역직렬화
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("kid.txt"));
			
			Kid kidIn = (Kid)ois.readObject();
			System.out.println(kidIn.getName());
			System.out.println(kidIn.getAge());
			System.out.println(kidIn.getPersnalNumber());
			
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

}

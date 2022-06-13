package step02.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import model.domain.Student;

public class Ex01ArrayList {
	
	public static void main(String[] args) {
		// ArrayList
		ArrayList<Object> arr1 = new ArrayList<Object>();
		// add : 추가
		arr1.add("Java");
		arr1.add(new Student("Java", 1, "Junior"));
		arr1.add(3);
		arr1.add("Java");
		
		// get : 원소 객체 반환
//		System.out.println(arr1);
//		System.out.println(arr1.get(1));
//		
		// size : ArrayList 크기/ 객체 수 반환
//		System.out.println(arr1.size());
		
		// ??
//		System.out.println(((Student) arr1.get(1)).getName());
		
		// 제네릭
		// add
		ArrayList<String> arr2 = new ArrayList<String>();
		arr2.add("Java1");
		arr2.add("Java2");
		arr2.add("Java3");
		arr2.add("Java4");
		arr2.add("Java5");
		
		// remove
		arr2.remove(2);
//		System.out.println(arr2.get(2));
		arr2.add(2, "Java2");
//		System.out.println(arr2);
		
		// for문?
		
		// ArrayList vs LinkedList
		List arrayList =  new ArrayList();
		List lkdList = new LinkedList();
		
		//
		long startTime;
		long endTime;
		
		// ArrayList
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			arrayList.add(i);
			arrayList.add(0, i);
		}
		endTime = System.currentTimeMillis();
		System.out.println("ArrayList 데이터 삽입 시간은 " + (endTime - startTime) + "밀리초 입니다.");
		
		// LinkedList
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			lkdList.add(i);
			lkdList.add(0, i);
		}
		endTime = System.currentTimeMillis();
		System.out.println("LinkedList 데이터 삽입 시간은 " + (endTime - startTime) + "밀리초 입니다.");
	}

}

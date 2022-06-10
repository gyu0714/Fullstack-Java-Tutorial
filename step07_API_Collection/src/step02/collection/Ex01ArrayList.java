package step02.collection;

import java.util.ArrayList;

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
		System.out.println(arr1);
		System.out.println(arr1.get(1));
		
		// size : ArrayList 크기/ 객체 수 반환
		System.out.println(arr1.size());
		
		// ??
		System.out.println(((Student) arr1.get(1)).getName());
		
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
		System.out.println(arr2.get(2));
		arr2.add(2, "Java2");
		System.out.println(arr2);
		
		// for문?
	}

}

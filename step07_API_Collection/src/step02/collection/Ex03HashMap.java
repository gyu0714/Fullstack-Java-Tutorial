package step02.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;
import java.util.Map.Entry;

import model.domain.Student;

public class Ex03HashMap {
	public static void main(String[] args) {
		// HashMap(K:V)
		HashMap<String, Integer> hm1 = new HashMap<String, Integer>();
		
		// put : 저장
		hm1.put("a", 1);
		hm1.put("b", 2);
		hm1.put("c", 3);
		hm1.put("d", 4);
//		System.out.println(hm1);
		
		// get : key로 value를 반환
//		System.out.println(hm1.get("a"));
		
		// remove : key로 객체 삭제
		hm1.remove("c");
//		System.out.println(hm1);
		
//		HashMap<String, Student>
		HashMap<String, Student> hm2 = new HashMap<>();
		hm2.put("k1", new Student("Java", 1, "Junior"));
//		System.out.println(hm2);
		
		// hm2 -> grade 출력
		System.out.println(hm2.get("k1").getGrade());
		
		
		// HashMap<String, ArrayList>
		ArrayList<String> arr1 = new ArrayList<>();
		arr1.add("a");
		arr1.add("b");
		arr1.add("c");
		arr1.add("d");
		System.out.println(arr1);

		HashMap<String, ArrayList<String>> hm3 = new HashMap<>();
		hm3.put("arr1", arr1);
		System.out.println(hm3.get("arr1").get(2));
		
		// HashMap<String, HashMap>
		// ver 1
		HashMap<String, HashMap<String ,ArrayList<String>>> hm4 = new HashMap<>();
		hm4.put("hm3", hm3);
		System.out.println(hm4.get("hm3").get("arr1").get(1));
		
		// ver2
		HashMap<String, HashMap> hm6 = new HashMap<>();
		hm6.put("hm3", hm3);
		System.out.println(((ArrayList)hm6.get("hm3").get("arr1")).get(1));
		
		// practice
		HashMap<Integer, Student> hm5 = new HashMap<Integer, Student>();
		hm5.put(1, new Student("Java", 1, "Junior"));
		hm5.put(2, new Student("Java", 1, "Junior"));
		hm5.put(3, new Student("Java", 1, "Junior"));
		hm5.put(4, new Student("Java", 1, "Junior"));
		System.out.println(hm5);
		
		ArrayList<Object> studentArr = new ArrayList<Object>();
		studentArr.add(hm5);
		
		// entrySet
		hm1.entrySet();
		Set<java.util.Map.Entry<String, Integer>> entrySet = hm1.entrySet();
		System.out.println(entrySet);
		
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
//			System.out.println(entryIterator.next());
			Entry<String, Integer> entry = entryIterator.next();
//			System.out.println(entry.getKey());
//			System.out.println(entry.getValue());
			
			String key = entry.getKey();
			Integer value = entry.getValue();
			
			// key를 모르는 상황?
			if(value == 2) {
				System.out.println(key);
			}
		}
	}

}

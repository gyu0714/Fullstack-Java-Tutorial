package step05_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import model.domain.Person;

public class PersonMBTI {

	public static void main(String[] args) {
		// I이고 J인 사람들만 출력
		Person donghyun = new Person("donghyun", "intp");
		Person yeyeong = new Person("yeyeong", "isfj");
		Person doheon = new Person("doheon", "isfj");
		Person minkyu = new Person("minkyu", "enfp");
		Person yongju = new Person("yongju", "estj");
		Person yunho = new Person("yunho", "enfp");
		Person jeongin = new Person("jeongin", "infp");
		Person hanju = new Person("hanju", "isfp");
		Person seongjun = new Person("seongjun", "isfp");
		Person uijin = new Person("uijin", "isfp");
		Person jongheon = new Person("jongheon", "isfj");
		Person hyunchae = new Person("hyunchae", "infj");
		Person yeongkwang = new Person("yeongkwang", "isfp");
		Person yeonghun = new Person("yeonghun", "esfj");
		Person myungyun = new Person("myungyun", "enfj");
		
		List<Person> personList = new ArrayList<Person>();
		personList.add(donghyun);
		personList.add(yeyeong);
		personList.add(doheon);
		personList.add(minkyu);
		personList.add(yongju);
		personList.add(yunho);
		personList.add(jeongin);
		personList.add(hanju);
		personList.add(seongjun);
		personList.add(uijin);
		personList.add(jongheon);
		personList.add(hyunchae);
		personList.add(yeongkwang);
		personList.add(yeonghun);
		personList.add(myungyun);
		
		System.out.println(personList);
		Stream<Person> personStream = personList.stream();
		
//		personList.stream()
	}

}

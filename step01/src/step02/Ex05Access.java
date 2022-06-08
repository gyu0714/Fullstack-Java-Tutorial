package step02;

import model.domain.People;

public class Ex05Access {
	public static void main(String[] args) {
		People ppl1 = new People("Java", 27);

//		System.out.println(ppl1.name);
		// 더이상 name 접근 불가 -> private
//		ppl1.age = 30;
//		System.out.println(ppl1.age);
//		System.out.println(ppl1.age);
		ppl1.setAge(100);
		ppl1.setName("Java");
	}

}

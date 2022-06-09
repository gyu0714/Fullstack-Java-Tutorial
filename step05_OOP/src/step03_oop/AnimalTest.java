package step03_oop;

//Animal
class Animal{
	
	public void move() {
		System.out.println("Animal Move");
	}
	
	public void eating() {
		
	}
}

class Human extends Animal{
	@Override
	public void move() {
		System.out.println("Human Move");
	}
	
	public void readBooks() {
		System.out.println("Human Read books");
	}
}

class Tiger extends Animal{
	@Override
	public void move() {
		System.out.println("Tiger Move");
	}
	
	public void hunting() {
		System.out.println("Tiger Hunt");
	}
}


class Eagle extends Animal{
	@Override
	public void move() {
		System.out.println("Eagle Move");
	}
	
	public void fly() {
		System.out.println("Eagle Fly");
	}
}


public class AnimalTest {
	public static void main(String[] args) {
		// 다형성
		
	//  UpCasting : 자식 객체가 부모타입으로 형변환 하면서 생성되는 것
		Animal human = new Human();
//		human.move();
//		human.readBooks();
		
		Tiger tiger = new Tiger();
//		tiger.move();
//		tiger.hunting();
		
		Eagle eagle = new Eagle();
//		eagle.move();
//		eagle.fly();
		
//		DownCasting : 부모타입으로 생성된 자식객체가 자신의타입으로 형변환 하는 것 
//		Human human1 = (Human)animal;
//		human1.readBooks();
		
//		Human test = (Human) new Animal();
//		test.move();
		
		Animal[] animalArray = {human, tiger, eagle};
		for(Animal animal : animalArray) {
			animal.move();
		}
		
	}

}

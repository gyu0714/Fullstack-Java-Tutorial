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
		// ������
		
	//  UpCasting : �ڽ� ��ü�� �θ�Ÿ������ ����ȯ �ϸ鼭 �����Ǵ� ��
		Animal human = new Human();
//		human.move();
//		human.readBooks();
		
		Tiger tiger = new Tiger();
//		tiger.move();
//		tiger.hunting();
		
		Eagle eagle = new Eagle();
//		eagle.move();
//		eagle.fly();
		
//		DownCasting : �θ�Ÿ������ ������ �ڽİ�ü�� �ڽ���Ÿ������ ����ȯ �ϴ� �� 
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

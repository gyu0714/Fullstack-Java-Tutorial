package step02.collection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Ex04InOut {
	public static void main(String[] args) {
		// Stack : LIFO		
		Stack<String> card = new Stack<>();
		
		// push
		card.push("Busan");
		card.push("DongBaek");
		
//		System.out.println(card);
		
		// peek
//		System.out.println(card.peek());
//		System.out.println(card);
		
		// pop
//		System.out.println(card.pop());
//		System.out.println(card);
		
		// Queue
		Deque<String> drinkBox = new LinkedList<String>();
		
		// add
		drinkBox.add("Coke");
		drinkBox.add("Sprite");
		drinkBox.add("DrPepper");
		System.out.println(drinkBox);
		
		// peek
		System.out.println(drinkBox.peek());
		
		// pop
		System.out.println(drinkBox.pop());
		System.out.println(drinkBox);
		
	}
}

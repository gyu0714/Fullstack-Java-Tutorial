package step06_practice;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer();	
		customer.order();
		customer.buy();
		customer.sell();
		
		System.out.println("");
		
		Buy buyer = customer;
		buyer.order();
		buyer.buy();
		
		System.out.println("");
		
		Sell seller = customer;
		seller.sell();
		seller.order();
	}

}

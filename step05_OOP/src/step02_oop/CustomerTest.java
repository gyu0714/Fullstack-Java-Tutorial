package step02_oop;

public class CustomerTest {

	public static void main(String[] args) {
//		Customer customerCentum = new Customer();
//		customerCentum.setCustomerId(10001);
//		customerCentum.setCustomerName("Centum");
		Customer customerCentum = new Customer(10001, "Centum");
		customerCentum.setBonusPoint(1000);
		
//		VIPCustomer customerSuyeong = new VIPCustomer();
//		customerSuyeong.setCustomerId(10002);
//		customerSuyeong.setCustomerName("Suyeong");
		VIPCustomer customerSuyeong = new VIPCustomer(10002, "Suyeong");
		customerSuyeong.setBonusPoint(1000);
		
			
		System.out.println(customerCentum.showCustomerInfo());
		System.out.println(customerSuyeong.showCustomerInfo());
		
		System.out.println(customerCentum.calcPrice(1000));
		System.out.println(customerSuyeong.calcPrice(1000));
		
	}

}

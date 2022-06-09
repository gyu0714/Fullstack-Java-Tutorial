package step02_oop;

// ��
// ID, Name, Grade, BonusPoint, BonusRatio
// int calcPrice(int price), String showCustomerInfo() - Name, Grade, Point
public class Customer {
	protected int customerId;
	protected String customerName;
	protected String customerGrade;
	protected int bonusPoint;
	protected double bonusRatio;
	
	// �߰� ���� �Ѵٸ�?
//	private String staffId;
//	private double saleRatio;
	
	// �⺻ ������
//	public Customer() {
//		customerGrade = "SILVER";
//		bonusRatio = 0.01;
//		
//		System.out.println("Customer ������ ȣ��");
//	}
	
	// ����� ���� ������
	public Customer(int customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	public int getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public double getBonusRatio() {
		return bonusRatio;
	}
	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
	// showCustomerInfo
	public String showCustomerInfo() {
		return customerName + "���� ����� " + customerGrade + "�̰�, ���ʽ� ����Ʈ��" + bonusPoint + "�Դϴ�.";
	}
	
	// calcPrice
	public int calcPrice(int price) {
		
		// �߰� �����Ѵٸ�?
//		if("SILVER".equals(customerGrade)) {
//			bonusPoint += price * bonusPoint;			
//		} else if("VIP".equals(customerGrade)) {
//			bonusPoint += price * bonusPoint;
//			price -= (int)(price * saleRatio);
//			return price;
//		}
		bonusPoint += price * bonusPoint;
		return	price;
	}
	
	
}

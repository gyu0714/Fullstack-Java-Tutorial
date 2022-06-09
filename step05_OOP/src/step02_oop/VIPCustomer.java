package step02_oop;

// ��ǰ ���� �� 10% ���� �� �������� ����
// ���ʽ� ����Ʈ ��ǰ ������ 5%����
// staffId ����

public class VIPCustomer extends Customer {
//	private int customerId;
//	private String customerName;
//	private String customerGrade;
//	private int bonusPoint;
//	private double bonusRatio;
	private String staffId;
	private double saleRatio;
	
//	public VIPCustomer() {
//		super();
//		super.customerGrade = "VIP";
//		super.bonusRatio = 0.05;
//		saleRatio = 0.1;
//		
//		System.out.println("VIPCustomer ������ ȣ��");
//	}
	
	public VIPCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		super.customerId = customerId;
		super.customerName = customerName;
		super.customerGrade = "VIP";
		super.bonusRatio = 0.05;
		saleRatio = 0.1;
		
	}
	// �޼ҵ� �������̵�(Method Overriding)
	// ���� ���� : ��ȯŸ�� �޼ҵ��(�Ű�����)�� ��� 100% ���� �� ��쿡��
	@Override
	public int calcPrice(int price) {
//		bonusPoint += price * bonusPoint;
//		return price;
		
//		return super.calcPrice(price);
		bonusPoint += price * bonusPoint;
		price = (int)(price - price * saleRatio);
		return price;
	}
	
	
	
	
}

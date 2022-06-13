package step01_enumtype;

import java.util.Arrays;
import java.util.List;

public enum PayType {
	CARD("카드", Arrays.asList("신용카드", "직불카드")),
	CASH("현금", Arrays.asList("현금결제", "계좌이체")),
	ETC("기타", Arrays.asList("쿠폰", "포인트"));
	
	private String typeCategori;
	private List<String> typeList;

	PayType(String typeCategori, List<String> typeList) {
		this.setTypeCategori(typeCategori);
		this.setTypeList(typeList);
	}

	public String getTypeCategori() {
		return typeCategori;
	}

	public void setTypeCategori(String typeCategori) {
		this.typeCategori = typeCategori;
	}

	public List<String> getTypeList() {
		return typeList;
	}

	public void setTypeList(List<String> typeList) {
		this.typeList = typeList;
	}
}

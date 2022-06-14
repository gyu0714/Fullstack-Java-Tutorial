package model.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Kid implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 610565237632405251L;
	private String name;
	private int age;
	private transient int persnalNumber;
	// 클래스 내부에 Object객체 가 존재한다면 이 클래스는 직력화가 되지 않는다.
//	Object object = new Object();
}

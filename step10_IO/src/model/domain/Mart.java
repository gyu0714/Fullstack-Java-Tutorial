package model.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Mart implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -770636714088202018L;
	private String name;
	private String address;
	private int contact;

}

package mybeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("2001")
	private int addId;
	@Value("Bangalore")
	private String addCity;
	@Value("Karnataka")
	private String addState;
	
	public Address() {}

	public Address(int addId, String addCity, String addState) {
		super();
		this.addId = addId;
		this.addCity = addCity;
		this.addState = addState;
	}

	public int getAddId() {
		return addId;
	}

	public String getAddCity() {
		return addCity;
	}

	public String getAddState() {
		return addState;
	}

	public void setAddId(int addId) {
		this.addId = addId;
	}

	public void setAddCity(String addCity) {
		this.addCity = addCity;
	}

	public void setAddState(String addState) {
		this.addState = addState;
	}

	@Override
	public String toString() {
		return "Address [addId=" + addId + ", addCity=" + addCity + ", addState=" + addState + "]";
	}
}

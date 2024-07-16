package mybeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	//@Value("701")
	private int studId;
	//@Value("Jenifer Lopez")
	private String studName;
	//@Value("100")
	private int studMark;
	
	public Student() {}

	public Student(@Value("701") int studId, @Value("Raj Kamal") String studName, @Value("85") int studMark) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studMark = studMark;
	}

	public int getStudId() {
		return studId;
	}

	public String getStudName() {
		return studName;
	}

	public int getStudMark() {
		return studMark;
	}

	//@Value("501")
	public void setStudId(int studId) {
		this.studId = studId;
	}

	//@Value("Raj Smith")
	public void setStudName(String studName) {
		this.studName = studName;
	}

	//@Value("70")
	public void setStudMark(int studMark) {
		this.studMark = studMark;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", studMark=" + studMark + "]";
	}
}

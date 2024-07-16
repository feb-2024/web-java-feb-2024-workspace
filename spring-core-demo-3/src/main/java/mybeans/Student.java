package mybeans;

public class Student {
	private int studId;
	private String studName;
	private int studMark;
	
	public Student() {}

	public Student(int studId, String studName, int studMark) {
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

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public void setStudMark(int studMark) {
		this.studMark = studMark;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", studMark=" + studMark + "]";
	}
}

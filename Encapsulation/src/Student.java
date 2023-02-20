
public class Student {

	private int studentId;
	private String studentName;
	private String rollNumber;
	private String mobileNumber;

	private Address address;

	public Student(int studentId, String studentName, String rollNumber, String mobileNumber, Address address) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.rollNumber = rollNumber;
		this.mobileNumber = mobileNumber;
		this.address = address;
	}

	public Student() {
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", rollNumber=" + rollNumber
				+ ", mobileNumber=" + mobileNumber + ", address=" + address + "]";
	}

}

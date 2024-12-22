
public class Student {

	private int roll_no;
	private String name;
	private long prn;
	private Student_marks std_marks;
	public Student(int roll_no, String name, long prn, Student_marks std_marks) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.prn = prn;
		this.std_marks = std_marks;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPrn() {
		return prn;
	}
	public void setPrn(long prn) {
		this.prn = prn;
	}
	public Student_marks getStd_marks() {
		return std_marks;
	}
	public void setStd_marks(Student_marks std_marks) {
		this.std_marks = std_marks;
	}
	
		
}

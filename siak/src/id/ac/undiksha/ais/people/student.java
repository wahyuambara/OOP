package id.ac.undiksha.ais.people;
import id.ac.undiksha.ais.organization.*;

public class student extends Human {
	private String studentId; 
	private int smtr;
	
	public student() {
		this.studentId = "<insert id>";

		this.smtr = 0;
	}
			
	public student(String studentId, int smtr) {
		super();
		this.studentId = studentId;
		this.smtr = smtr;
	}

	public student(String name, String birthDate, boolean gender, String address) {
		super(name, birthDate, gender, address);
		// TODO Auto-generated constructor stub
	}

	public student(String name, String birthDate, boolean gender, String address, String studentId, int smtr) {
		super(name, birthDate, gender, address);
		this.studentId = studentId;
		this.smtr = smtr;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public int getSmtr() {
		return smtr;
	}

	public void setSmtr(int smtr) {
		this.smtr = smtr;
	}


	public void printAll() {
		super.printAll();
		System.out.println(this.studentId);
		System.out.println(this.smtr);

	}

	public StudyProgram prodi = new StudyProgram();
}


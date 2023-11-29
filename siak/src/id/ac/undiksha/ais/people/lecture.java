package id.ac.undiksha.ais.people;

public class lecture extends Human{
	private String lectureId; 
	private String faculty;
	private String department;
	private String studyProgram;
	
	public lecture() {
		this.lectureId = "insert id";
		this.faculty = "inser";
		this.department = "inser";
		this.studyProgram = "insert";
	}
	
	
	public lecture(
			String name, 
			String birthDate, 
			boolean gender, 
			String address, 
			String lectureId, 
			String faculty,
			String department, 
			String studyProgram) {
		super(name, birthDate, gender, address);
		this.lectureId = lectureId;
		this.faculty = faculty;
		this.department = department;
		this.studyProgram = studyProgram;
	}

	public String getLectureId() {
		return lectureId;
	}


	public void setLectureId(String lectureId) {
		this.lectureId = lectureId;
	}


	public String getFaculty() {
		return faculty;
	}


	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public String getStudyProgram() {
		return studyProgram;
	}


	public void setStudyProgram(String studyProgram) {
		this.studyProgram = studyProgram;
	}


	public void printAll() {
		super.printAll();
		System.out.println(this.lectureId);
		System.out.println(this.faculty);
		System.out.println(this.department);
		System.out.println(this.studyProgram);
	}
}

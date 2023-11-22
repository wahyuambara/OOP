package id.ac.undiksha.ais.people;

public class lecture {
	private String name;
	private String lectureId; 
	private boolean gender; // 0 = female, 1 = male
	private String address;
	private String birthDate;
	private String faculty;
	private String department;
	private String studyProgram;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLectureId() {
		return lectureId;
	}


	public void setLectureId(String lectureId) {
		this.lectureId = lectureId;
	}


	public boolean isGender() {
		return gender;
	}


	public void setGender(boolean gender) {
		this.gender = gender;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
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
		
		System.out.println(this.name);
		System.out.println(this.lectureId);
		if (this.gender) {
			System.out.println("Male");
		} else {
			System.out.println("Female");
		}
		System.out.println(this.address);
		System.out.println(this.birthDate);
		System.out.println(this.faculty);
		System.out.println(this.department);
		System.out.println(this.studyProgram);
	}
}

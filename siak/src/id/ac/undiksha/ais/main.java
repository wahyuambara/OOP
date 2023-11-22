package id.ac.undiksha.ais;
import id.ac.undiksha.ais.people.student;
import id.ac.undiksha.ais.people.lecture;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student student1 = new student();
//		student1.setStudentId = "12345";
		
		student1.setStudentId ("1234");
		student1.setName("Ani");
		student1.setBirthDate("1 January 2023");
		student1.setGender(false);
		student1.setSmtr(4);
		student1.setAddress("Singaraja");
		student1.printAll();
		
		lecture lecture1 = new lecture();
		lecture1.setLectureId ("1234");
		lecture1.setName("Ani");
		lecture1.setBirthDate("1 January 2023");
		lecture1.setGender(false);
		lecture1.setAddress("Singaraja");
		lecture1.setFaculty("FTK");
		lecture1.setDepartment("TI");
		lecture1.setStudyProgram("CS");
		lecture1.printAll();
		
		
//		System.out.println(student1.getStudentId());
		
//		student1.name = "Ani";
//		student1.birthDate = "1 January 2000";
//		student1.gender = false;
//		student1.smtr = 6;
//		student1.address = "Singaraja";
//		System.out.println(student1.studentId);
//		System.out.println(student1.name);
//		System.out.println(student1.birthDate);
//		if (student1.gender)
//			System.out.println("Male");
//		else
//			System.out.println("Female");
//		System.out.println(student1.smtr);
//		System.out.println(student1.address);

	}

}

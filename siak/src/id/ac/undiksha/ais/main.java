package id.ac.undiksha.ais;
import id.ac.undiksha.ais.people.student;
import id.ac.undiksha.ais.people.lecture;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student student1 = new student();
		
		student1.setStudentId ("111");
		student1.setName("S1Wahyu");
		student1.setBirthDate("1 January 2023");
		student1.setGender(false);
		student1.setSmtr(4);
		student1.setAddress("Singaraja");
		student1.printAll();
		
		System.out.println("----");
		lecture lecture1 = new lecture();
		lecture1.setLectureId ("222");
		lecture1.setName("S2Wahyu");
		lecture1.setBirthDate("1 January 2023");
		lecture1.setGender(false);
		lecture1.setAddress("Singaraja");
		lecture1.setFaculty("FTK");
		lecture1.setDepartment("TI");
		lecture1.setStudyProgram("CS");
		lecture1.printAll();

		student student3 = new student(
				"S3Wahyu",
				"Januari",
				true,
				"Gianyar",
				"333",
				3
				);
		System.out.println("----");
		student3.printAll();
		
		System.out.println("----");
		lecture lec1 = new lecture(
				"S4Wahyu",
				"1 January 2023",
				false,
				"Singaraja",
				"444",
				"FTK",
				"TI",
				"CS"
				);
		lec1.printAll();

	}

}

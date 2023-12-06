package id.ac.undiksha.ais.organization;

public class StudyProgram implements Department{
	private String studyProgramId;
	private String studyProframName;
	public String getStudyProgramId() {
		return studyProgramId;
	}
	public void setStudyProgramId(String studyProgramId) {
		this.studyProgramId = studyProgramId;
	}
	public String getStudyProframName() {
		return studyProframName;
	}
	public void setStudyProframName(String studyProframName) {
		this.studyProframName = studyProframName;
	}
	@Override
	public void setDepartmentName(String deparmentId) {
		// TODO Auto-generated method stub
		
		
	}
	@Override
	public String getDepartmentName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setDepartmentId(String departmentId) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getDepartmentId() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setFacultyCode(String facultyCode) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getFacultyCode() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setFacultyName(String facultyName) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getFacultyName() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

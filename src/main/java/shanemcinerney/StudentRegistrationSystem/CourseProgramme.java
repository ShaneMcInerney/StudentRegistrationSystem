package shanemcinerney.StudentRegistrationSystem;

import java.util.List;

import org.joda.time.DateTime;

public class CourseProgramme {

	//Course program fields
	private String _courseName;
	private List<Module> _modulesList;
	private DateTime _startDate;
	private DateTime _endDate;

	//Constructor for Course Programme
	public CourseProgramme(String courseName,List<Module> moduleList,DateTime startDate,DateTime endDate)
	{
		this._courseName=courseName;
		this._modulesList=moduleList;
		this._startDate=startDate;
		this._endDate=endDate;
	}
	//Default Connstructor
	public CourseProgramme(){}
	
	//Getter and Setter Methods for Course Programme
	public String getCourseName() {
		return _courseName;
	}

	public void setCourseName(String _courseName) {
		this._courseName = _courseName;
	}

	public List<Module> getModulesList() {
		return _modulesList;
	}

	public void setModulesList(List<Module> _modulesList) {
		this._modulesList = _modulesList;
	}

	public DateTime getStartDate() {
		return _startDate;
	}

	public void setStartDate(DateTime _startDate) {
		this._startDate = _startDate;
	}

	public DateTime getEndDate() {
		return _endDate;
	}

	public void setEndDate(DateTime _endDate) {
		this._endDate = _endDate;
	}
}

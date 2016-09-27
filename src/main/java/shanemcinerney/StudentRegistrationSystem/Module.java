package shanemcinerney.StudentRegistrationSystem;

import java.util.List;

public class Module {
	//Module Fields
		private String _moduleName;
		private String _moduleID;
		private List<Student> _studentsList;
		
		//Module Constructor
		public Module(String moduleName,String moduleID,List<Student> studentsList)
		{
			this._moduleName=moduleName;
			this._moduleID=moduleID;
			this._studentsList = studentsList;
		}
		
		//Getter Setter Methods for Modules fields

		public String getModuleName() {
			return _moduleName;
		}

		public void setModuleName(String _moduleName) {
			this._moduleName = _moduleName;
		}

		public String getModuleID() {
			return _moduleID;
		}

		public void setModuleID(String _moduleID) {
			this._moduleID = _moduleID;
		}

		public List<Student> getStudentsList() {
			return _studentsList;
		}

		public void setStudentsList(List<Student> _studentsList) {
			this._studentsList = _studentsList;
		}
		
	}

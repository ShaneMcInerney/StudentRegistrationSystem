package shanemcinerney.StudentRegistrationSystem;

public class Student {
	//fields for student
		private String _firstName;
		private String _secondName;
		private int _age;
		private String _dateOfBirth;
		private int _id;
		private String _username;
		private CourseProgramme _programme;
		
		//Student Constructor
		public Student(String firstName,String secondName,int age,String dateOfBirth,int ID,CourseProgramme programme)
		{
			this._firstName = firstName;
			this._secondName=secondName;
			this._age= age;
			this._dateOfBirth=dateOfBirth;
			this._id=ID;
			this._programme=programme;
			this.setUsername();	
		}
		
		//Alternate Constructor for the purposes of this assignment, leaving out Course Programme
		//which will not be used in our username test
		public Student(String firstName,String secondName,int age,String dateOfBirth,int ID)
		{
			this._firstName = firstName;
			this._secondName=secondName;
			this._age= age;
			this._dateOfBirth=dateOfBirth;
			this._id=ID;
			this.setUsername();	
		}
		
		//getter and setter methods for our fields
		
		public void setProgramme(CourseProgramme programme)
		{
			this._programme=programme;
		}
		
		public CourseProgramme getProgramme()
		{
			return this._programme;
		}
		
		public String getFirstName()
		{
			return _firstName;
		}
		
		
		public void setFirstName(String _firstName)
		{
			this._firstName = _firstName;
		}


		public int getAge() 
		{
			return _age;
		}


		public void setAge(int _age)
		{
			this._age = _age;
		}


		public String getDateOfBirth()
		{
			return _dateOfBirth;
		}


		public void setDateOfBirth(String _dateOfBirth)
		{
			this._dateOfBirth = _dateOfBirth;
		}


		public int getId()
		{
			return _id;
		}


		public void setId(int _id) 
		{
			this._id = _id;
		}


		public String getUsername() 
		{
			return this._username;
		}

		//sets students user name equals to their
		//first name concatenated with their second name and age
		public void setUsername() 
		{
			this._username=this._firstName+this._secondName+this._age;	
		}
		
		public String getSecondName()
		{
			return this._secondName;
		}
		
		public void setSecondName(String _secondName)
		{
			this._secondName=_secondName;
		}
	}


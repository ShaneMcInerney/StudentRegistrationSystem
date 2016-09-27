package shanemcinerney.StudentRegistrationSystem;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StudentTest {
	
		//student to be used for testing
		static Student _testStudent;
		
		@Before
		public void testSetUp()
		{				
			//creating new student
			_testStudent= new Student("Shane", "McInerney",21,"10/05/1995",13339141);
		}
		
		/*
		 * Tests that username for student has correct value
		 * */
		@Test
		public void studentUsernameTest()
		{
			//actualUsername should equal ShaneMcInerney21
			String actualUsername =_testStudent.getUsername();
			//expectedUsername equals ShaneMcInerney21
			String expectedUsername = _testStudent.getFirstName()+_testStudent.getSecondName()+_testStudent.getAge();
			//compare values
			assertEquals(expectedUsername, actualUsername);
		}


}

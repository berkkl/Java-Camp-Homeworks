public class StudentManager extends UserManager{
	public void java() {
		CourseManager.courseAdd(new Java());
		System.out.println(firstName + " " + lastName +" takes Java course.");
	}

	public void python() {
		CourseManager.courseAdd(new Python());
		System.out.println(firstName + " " + lastName + " takes Python course.");
	}

	public void csharp() {
		CourseManager.courseAdd(new Csharp());
		System.out.println(firstName + " " + lastName + " takes C# course.");
	}
	
	public void cpp() {
		CourseManager.courseAdd(new Cpp());
		System.out.println(firstName + " " + lastName + " takes C++ course.");
	}

}

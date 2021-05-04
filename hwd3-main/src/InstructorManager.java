public class InstructorManager extends UserManager{
	
	public void java() {
		CourseManager.courseAdd(new Java());
		System.out.println(firstName + " " + lastName +" gives Java course.");
	}

	public void python() {
		CourseManager.courseAdd(new Python());
		System.out.println(firstName + " " + lastName + " gives Python course.");
	}

	public void csharp() {
		CourseManager.courseAdd(new Csharp());
		System.out.println(firstName + " " + lastName + " gives C# course.");
	}

	public void cpp() {
		CourseManager.courseAdd(new Cpp());
		System.out.println(firstName + " " + lastName + " gives C++ course.");
	}
	
}

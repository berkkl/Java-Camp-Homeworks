public class Main {

	public static void main(String[] args) {

		String[] courses = {"Java", "C#"};
		String java = "Java";
		String csharp = "C#";
		String cpp = "Cpp";
		String python = "Python";
		
		StudentManager student1 = new StudentManager();
		student1.add(1, "Berk", "Kalelioglu", "bk3@gmail.com", courses);
		
		InstructorManager instructor1 = new InstructorManager();
		instructor1.add(2, "Engin", "Demirog", "ed3@gmail.com", courses);
		
		instructor1.java();
		student1.java();
		
		
		
	} 
}

package pkg;

enum Gender { Male,Female };
enum Course {Database,Programming,Math,ERP};
enum Semester{Summer,Winter ,Fall,Spring};

public class RegisterForm 
{
	public String stdname;
	public Gender stdgender;
	public Course stdcourse;
	public Semester stdsemester;

	public RegisterForm()
	{
		stdname = "no name";
		stdgender = Gender.Male;
		stdcourse = Course.Database;
		stdsemester = Semester.Summer;
	}
}

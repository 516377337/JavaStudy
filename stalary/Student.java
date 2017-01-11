package stalary;

public class Student
{
	String name;
	String phone;
	String sex;
	String age;
	
	public Student(){
		
	}
	
	public Student(String name, String phone,String sex,String age)
	{
		this.name = name;
		this.phone = phone;
		this.sex=sex;
		this.age=age;
	}

	@Override
	public String toString()
	{
		return   "name:  "+name+"  "+"phone:  "+phone+"  "+"sex:  "+sex+"  "+
	"age:  "+age  ;
	}
	
	
	
}

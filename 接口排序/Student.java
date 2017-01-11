package lrq;

public class Student {
      int id;
      String name;
      String phone;
      public Student(){
    	  
      }
      public Student(int id,String name,String phone){
    	  this.id=id;
    	  this.name=name;
    	  this.phone=phone;
      }
	@Override
	public String toString() {
		return "id:  "+id+"name:  "+name+"phone:  "+phone;
	}
      
}

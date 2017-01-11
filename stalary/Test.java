package stalary;

public class Test
{

	public static void main(String[] args)
	{
		StudentList ss = new StudentList();
		ss.add( new Student("xingaolin",  "17853149662","man","19") );
		ss.add( new Student("lixinze",  "17853149649","man","20") );
		ss.add( new Student("lizhihao",  "17853149606","man","19") );
		ss.add( new Student("stalary",  "17853149599","man","20") );


		for(int i=0; i<ss.count(); i++)
		{
			Student s = ss.get(i);
			System.out.println(s.toString());
		}
	}

}

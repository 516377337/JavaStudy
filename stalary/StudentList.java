package stalary;

public class StudentList
{
	private int count = 0;
	
	private Element linkedList = new Element();
	
	private class Element
	{
		public Student value;
		public Element next;
	}
	
	public void add(Student value)
	{
		Element node = new Element();
		node.value = value;
		node.next = linkedList.next;
		linkedList.next = node;
		count += 1;
	}
	
	public Student get(int index)
	{
		Element node = linkedList.next;
			
		for(int i=0; node != null; i++)
		{
			if(index == i)
			{
				return node.value;
			}
			node=node.next;
		}
		return null;
	}
	
	public int count()
	{
		return this.count;
	}	
}



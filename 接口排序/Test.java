package lrq;

import java.util.*;

public class Test {
	public void TestA() {
		Student[] sts = new Student[4];
		sts[0] = new Student(1001, "wang", "17853149599");
		sts[1] = new Student(1003, "zhang", "17853149606");
		sts[2] = new Student(1002, "hao", "17853149459");
		sts[3] = new Student(1005, "xin", "17853149723");
		System.out.println("after idSort");
		StaSort.doSort(sts, new sortById());
		for (Student a : sts)
			System.out.println(a);
		System.out.println("after nameSort");
		StaSort.doSort(sts, new sortByName());
		for (Student a : sts)
			System.out.println(a);
		System.out.println("after phoneSort");
		StaSort.doSort(sts, new sortByPhone());
		for (Student a : sts)
			System.out.println(a);
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.TestA();
	}

	public class sortById implements StaCompare {

		@Override
		public int compare(Object a, Object b) {
			Student a1 = (Student) a;
			Student b1 = (Student) b;
			if (a1.id > b1.id)
				return 1;
			else if (a1.id < b1.id)
				return -1;
			else
				return 0;
		}

	}

	public class sortByName implements StaCompare {

		@Override
		public int compare(Object a, Object b) {
			Student a1 = (Student) a;
			Student b1 = (Student) b;
			return a1.name.compareTo(b1.name);
		}

	}

	public class sortByPhone implements StaCompare {

		@Override
		public int compare(Object a, Object b) {
			Student a1 = (Student) a;
			Student b1 = (Student) b;
			return a1.phone.compareTo(b1.phone);
		}

	}
}

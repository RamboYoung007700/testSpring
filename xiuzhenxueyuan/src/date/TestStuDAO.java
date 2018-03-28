package date;

public class TestStuDAO {
	public static void main(String[] args) {
		Stu stu=new Stu("张三11","34243243","JAVA工程师","2018.3.20","家里蹲",
				2343,"http://xxxxx.com","必胜必胜！","李四师兄","知乎看到");
		StuDAO sd=new StuDAO();
		sd.add(stu);
		sd.add(stu);
		sd.add(stu);
		sd.add(stu);
		System.out.println(stu.id);
		stu=new Stu("张三12","34243243","JAVA工程师","2018.3.20","家里蹲",
				2343,"http://xxxxx.com","必胜必胜！","李四师兄","知乎看到");
		sd.add(stu);
		sd.add(stu);
		sd.add(stu);
		sd.add(stu);

		stu.name="新的张三";
		sd.update(stu);
		System.out.println(stu);
		sd.delete(3);
		System.out.println(sd.GetFromName("张三11"));
		System.out.println(sd.GetFromName("张三12"));
		System.out.println(sd.list());
	}
}

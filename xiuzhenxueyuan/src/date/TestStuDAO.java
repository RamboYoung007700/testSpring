package date;

public class TestStuDAO {
	public static void main(String[] args) {
		Stu stu=new Stu("����11","34243243","JAVA����ʦ","2018.3.20","�����",
				2343,"http://xxxxx.com","��ʤ��ʤ��","����ʦ��","֪������");
		StuDAO sd=new StuDAO();
		sd.add(stu);
		sd.add(stu);
		sd.add(stu);
		sd.add(stu);
		System.out.println(stu.id);
		stu=new Stu("����12","34243243","JAVA����ʦ","2018.3.20","�����",
				2343,"http://xxxxx.com","��ʤ��ʤ��","����ʦ��","֪������");
		sd.add(stu);
		sd.add(stu);
		sd.add(stu);
		sd.add(stu);

		stu.name="�µ�����";
		sd.update(stu);
		System.out.println(stu);
		sd.delete(3);
		System.out.println(sd.GetFromName("����11"));
		System.out.println(sd.GetFromName("����12"));
		System.out.println(sd.list());
	}
}

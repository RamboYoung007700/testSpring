package date;

public class Stu {
	int id;
	String name;
	String qq;
	String type;
	String enrolltime;
	String school;
	int onlinenumber;
	String reportURL;
	String swearword;
	String shixiong;
	String fromwhere;
	public Stu() {}
	public Stu(String name,String qq,String type,String enrolltime,String school,
			int onlinenumber,String reportURL,String swearword,String shixiong,
			String fromwhere) {
		this.name=name;
		this.qq=qq;
		this.type=type;
		this.enrolltime=enrolltime;
		this.school=school;
		this.onlinenumber=onlinenumber;
		this.reportURL=reportURL;
		this.swearword=swearword;
		this.shixiong=shixiong;
		this.fromwhere=fromwhere;
	}
	
	public String toString() {
		return id+"��: "+name+" qq: "+qq+" �������ͣ� "+type+" Ԥ����ѧʱ��: "+enrolltime;
	}
	
}

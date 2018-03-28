package date;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TestConnectionPool {
	private class worker extends Thread{
		private ConnectionPool cp;
		private Stu stu;
		public worker(ConnectionPool cp) {
			this.cp=cp;
			stu=new Stu("����","34243243","JAVA����ʦ","2018.3.20","�����",
					2343,"http://xxxxx.com","��ʤ��ʤ��","����ʦ��","֪������");
		}
		public void run() {
			Connection c=cp.getConnection();
			String sql = "insert into stu values(null,?,?,?,?,?,?,?,?,?,?)";
			try ( PreparedStatement ps = c.prepareStatement(sql)) {
				ps.setString(1, stu.name);
				ps.setString(2, stu.qq);
				ps.setString(3, stu.type);
				ps.setString(4, stu.enrolltime);
				ps.setString(5, stu.school);
				ps.setInt(6, stu.onlinenumber);
				ps.setString(7, stu.reportURL);
				ps.setString(8, stu.swearword);
				ps.setString(9, stu.shixiong);
				ps.setString(10, stu.fromwhere);
				ps.execute();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			cp.returnConnection(c);
	
		}
	}
	public void test1() {
		ConnectionPool cp=new ConnectionPool(10);
		
		
		System.out.println("���ӳط�ʽ��ʼ");
		List<Thread> ts=new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			Thread t=new worker(cp);
			t.start();
			ts.add(t);
		}
		for(Thread t:ts) {
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("���ӳط�ʽ����");
		
	}
	
	public void test2() {
		
		Stu stu=new Stu("����11","34243243","JAVA����ʦ","2018.3.20","�����",
				2343,"http://xxxxx.com","��ʤ��ʤ��","����ʦ��","֪������");
		System.out.println("��ͳ��ʽ��ʼ");
		List<Thread> ts2=new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Thread t=new Thread() {
				public void run() {
					StuDAO sd=new StuDAO();
					sd.add(stu);
				}
			};
			t.start();
			ts2.add(t);
		}
		for(Thread t:ts2) {
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("��ͳ��ʽ����");
		
	}
	public static void main(String[] args) {
		TestConnectionPool tcp=new TestConnectionPool();
		tcp.test1();
		tcp.test2();
	}
	

}

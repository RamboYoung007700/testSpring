package date;

import java.util.List;


public interface DAO {
	//����
    public void add(Stu stu);
    //�޸�
    public void update(Stu stu);
    //ɾ��
    public void delete(int id);
    //��ȡ
    public Stu get(int id);
    //ͨ�����ֻ�ȡ
    public List<Stu> GetFromName(String name);
    //��ѯ
    public List<Stu> list();
    //��ҳ��ѯ
    public List<Stu> list(int start, int count);

}

package date;

import java.util.List;


public interface DAO {
	//增加
    public void add(Stu stu);
    //修改
    public void update(Stu stu);
    //删除
    public void delete(int id);
    //获取
    public Stu get(int id);
    //通过名字获取
    public List<Stu> GetFromName(String name);
    //查询
    public List<Stu> list();
    //分页查询
    public List<Stu> list(int start, int count);

}

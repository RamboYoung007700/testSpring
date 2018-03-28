package test;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



import date.TestConnectionPool;


 
 
public class Testsp {
 
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "xiuzhen.xml" });
        
//        TestConnectionPool s = ( TestConnectionPool) context.getBean("tcp");
        TestConnectionPool s = new TestConnectionPool();
        
        s.test1();
        s.test2();
        
        
    }
}
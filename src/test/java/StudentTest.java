import com.qcby.dao.StudentDao;
import com.qcby.entity.Student1;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class StudentTest {
    private InputStream in = null;
    private SqlSession session = null;
    private StudentDao mapper = null;

    @Before  //前置通知, 在方法执行之前执行
    public void init() throws IOException {
        //加载主配置文件，目的是为了构建SqlSessionFactory对象
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //通过SqlSessionFactory工厂对象创建SqlSesssion对象
        session = factory.openSession();
        //通过Session创建UserDao接口代理对象
        mapper = session.getMapper(StudentDao.class);
    }

    @After  //@After: 后置通知, 在方法执行之后执行 。
    public void destory() throws IOException {
        //释放资源
        session.close();
        in.close();
    }
    @Test
    public void selectStudentTeacher(){
        List<Student1> students = mapper.selectStudentTeacher();
        for (Student1 student : students) {
            System.out.println(student);
        }
    }
    @Test
    public void selectStudentTeacher2(){
        List<Student1> students = mapper.StudentTeacher2();
        for (Student1 student : students) {
            System.out.println(student.getSex());
        }
    }
}

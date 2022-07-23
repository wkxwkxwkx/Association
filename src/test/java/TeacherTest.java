import com.qcby.dao.StudentDao;
import com.qcby.dao.TeacherDao;
import com.qcby.entity.Teacher2;
import org.apache.ibatis.annotations.Param;
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

public class TeacherTest {
    private InputStream in = null;
    private SqlSession session = null;
    private TeacherDao mapper = null;

    @Before  //前置通知, 在方法执行之前执行
    public void init() throws IOException {
        //加载主配置文件，目的是为了构建SqlSessionFactory对象
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //通过SqlSessionFactory工厂对象创建SqlSesssion对象
        session = factory.openSession();
        //通过Session创建UserDao接口代理对象
        mapper = session.getMapper(TeacherDao.class);
    }

    @After  //@After: 后置通知, 在方法执行之后执行 。
    public void destory() throws IOException {
        //释放资源
        session.close();
        in.close();
    }
    @Test
    public void getTeacherStudent(){
        List<Teacher2> teacherStudents = mapper.getTeacherStudent();
        for (Teacher2 teacherStudent : teacherStudents) {
            System.out.println(teacherStudent);
        }
    }
    @Test
    public void getTeacherStudent2(){
        List<Teacher2> teachers = mapper.getTeacherStudent2();
        for (Teacher2 teacher : teachers) {
            System.out.println(teacher.gettName());
        }
    }
}

import com.wujingjun.spring08.mapper.UserMapper;
import com.wujingjun.spring08.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class test {

    @Test
    public void test1(){
        ApplicationContext ApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserMapper userMapper = (UserMapper) ApplicationContext.getBean("UserMapper1");

        User user = new User();
        user.setName("wll");
        user.setPassword("111");

        userMapper.addUser(user);
    }
}

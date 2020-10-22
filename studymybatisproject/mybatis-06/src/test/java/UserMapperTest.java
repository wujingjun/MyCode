import com.wujingjun.mybatis06.dao.UserMapper;
import com.wujingjun.mybatis06.pojo.User;
import com.wujingjun.mybatis06.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class UserMapperTest {

    @Test
    public void test1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user1 = mapper.findUserById(1);

        System.out.println(user1);

        sqlSession.clearCache();

        System.out.println("=======================");

        User user2 = mapper.findUserById(1);
        System.out.println(user2);

        System.out.println("=======================");

        System.out.println(user1 == user2);
    }


    //开启二级缓存
    @Test
    public void test2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SqlSession sqlSession1 = MybatisUtils.getSqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        User user1 = userMapper.findUserById(1);

        System.out.println(user1);

        sqlSession.close();

        UserMapper userMapper2 = sqlSession1.getMapper(UserMapper.class);

        User user2 = userMapper2.findUserById(1);

        System.out.println(user2);

        System.out.println(user1 == user2);

    }
}

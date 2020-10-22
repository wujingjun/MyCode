package com.wujingjun.mybatis05.dao;

import com.wujingjun.mybatis05.pojo.Blog;
import com.wujingjun.mybatis05.util.IDUtils;
import com.wujingjun.mybatis05.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

public class BlogMapperTest {

    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);

        Blog blog = new Blog();
        blog.setId(IDUtils.getId());
        blog.setTitle("俊哥牛逼");
        blog.setAuthor("沙雕");
        blog.setCreateTime(new Date());
        blog.setViews(10);

        blogMapper.addBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("俊哥超帅");
        blog.setAuthor("傻吊");
        blog.setCreateTime(new Date());
        blog.setViews(100);

        blogMapper.addBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("俊哥真强");
        blog.setAuthor("傻屌");
        blog.setCreateTime(new Date());
        blog.setViews(100);

        blogMapper.addBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("俊哥巨猛");
        blog.setAuthor("傻叼");
        blog.setCreateTime(new Date());
        blog.setViews(900);

        blogMapper.addBlog(blog);
    }


    @Test
    public void test2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Map map = new HashMap();
        map.put("author","卧槽");

        List<Blog> blogs = mapper.queryBlogIf(map);

        for (Blog blog : blogs) {
            System.out.println(blog);
        }

        sqlSession.close();

    }

    @Test
    public void testupdate(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);

        Map map = new HashMap();

        map.put("author","卧槽");
        map.put("id",2);

        int i = blogMapper.updateBlog(map);

        System.out.println(i);

        sqlSession.commit();

        sqlSession.close();
    }


    @Test
    public void testChooes(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);

        Map map = new HashMap();
//        map.put("author","卧槽");
        map.put("views",100);

        List<Blog> blogs = blogMapper.queryBlogChoose(map);

        for (Blog blog : blogs) {
            System.out.println(blog);
        }

        sqlSession.close();
    }


    @Test
    public void testforeach(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);

        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);

        Map map = new HashMap();
        map.put("ids",ids);

        List<Blog> blogs = blogMapper.queryBlogForeach(map);

        for (Blog blog : blogs) {
            System.out.println(blog);
        }

        sqlSession.close();
    }

}

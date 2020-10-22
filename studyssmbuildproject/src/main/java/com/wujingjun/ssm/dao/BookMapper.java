package com.wujingjun.ssm.dao;

import com.wujingjun.ssm.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {

    int addBook(Books books);

    int deleteBook(int id);

    int updateBook(Books books);

    Books queryBookById(int id);

    List<Books> queryAllBook();

    List<Books> queryBooksByName(String name);
}

package com.wujingjun.ssm.service.impl;

import com.wujingjun.ssm.dao.BookMapper;
import com.wujingjun.ssm.pojo.Books;
import com.wujingjun.ssm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    //Service调dao:组合dao
    private BookMapper bookMapper;

    //设置set方法通过Spring注入mapper类
    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    @Override
    public int deleteBook(int id) {
        return bookMapper.deleteBook(id);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    @Override
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }

    @Override
    public List<Books> queryBooksByName(String name) {
        return bookMapper.queryBooksByName(name);
    }
}

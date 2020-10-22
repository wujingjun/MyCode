package com.wujingjun.ssm.controller;

import com.wujingjun.ssm.pojo.Books;
import com.wujingjun.ssm.service.BookService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    //@Qualifier限定哪个bean应该被自动注入。当Spring无法判断出哪个bean应该被注入时，@Qualifier注解有助于消除歧义bean的自动注入
    @Qualifier("bookServiceImpl")
    private BookService bookService;

    @RequestMapping("/searchAll")
    public String searchAll(Model model){
        List<Books> books = bookService.queryAllBook();
        model.addAttribute("books",books);
        return "allbook";
    }

    @RequestMapping("/toaddbook")
    public String toaddbook(){
        return "addbook";
    }

    @RequestMapping("/addbook")
    public String addbook(Books books){
        bookService.addBook(books);
        return "redirect:/book/searchAll";
    }

    @RequestMapping("/toupdatebook")
    public String toupdatebook(int id, Model model){
        Books books = bookService.queryBookById(id);
        model.addAttribute("book",books);
        return "updatebook";
    }

    @RequestMapping("/updatebook")
    public String updatebook(Books books){
        bookService.updateBook(books);
        return "redirect:/book/searchAll";
    }

    @RequestMapping("/deletebook")
    public String deletebook(int id){
        bookService.deleteBook(id);
        return "redirect:/book/searchAll";
    }

    @RequestMapping("/querybook")
    public String querybook(String bookName,Model model){
        if(bookName == null){
            List<Books> books = bookService.queryAllBook();
            model.addAttribute("books",books);
        }else {
            String name = "%"+bookName+"%";
            List<Books> books = bookService.queryBooksByName(name);
            model.addAttribute("books",books);
        }

        return "allbook";
    }

}

package com.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet(urlPatterns = "/index")
public class IndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Book[] books = {
                new Book("见识","6.jpg","吴军"),
                new Book("茶花女","7.jpg","小仲马"),
                new Book("活着","8.jpg","余华"),
                new Book("羊皮卷","9.jpg","奥格·曼狄诺"),
                new Book("朱自清经典","10.jpg","桑楚"),
                new Book("见识","6.jpg","吴军"),
                new Book("茶花女","7.jpg","小仲马"),
                new Book("活着","8.jpg","余华"),
                new Book("羊皮卷","9.jpg","奥格·曼狄诺"),
                new Book("朱自清经典","10.jpg","桑楚"),
        };

        List<Book> bookList = Arrays.asList(books);
        req.setAttribute("bookList",bookList);
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}


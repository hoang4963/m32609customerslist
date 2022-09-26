package com.example.showcumtomerlist;

import models.Customers;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "CustomersServlet", value = "/hello-servlet")
public class CustomersServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
       List<Customers> customersList = new ArrayList<>();
       customersList.add(new Customers("Hoang","07-04-1999","Ha Nam","D:\\codegym\\Module3JWBD\\260922\\exercise\\showcumtomerlist\\image\\_95790832_gettyimages-516700094.jpg"));
        customersList.add(new Customers("Chuc","21-12-2001","Thai Binh","D:\\codegym\\Module3JWBD\\260922\\exercise\\showcumtomerlist\\image\\loai-meo-long-day-chan-ngan-san-moi-vung-1664100856.jpg"));
        customersList.add(new Customers("Quan","05-05-1993","Thai Binh","D:\\codegym\\Module3JWBD\\260922\\exercise\\showcumtomerlist\\image\\meo-ba-tu-2.jpg"));
        request.setAttribute("customersList",customersList);
        System.out.print(customersList.get(1));
        RequestDispatcher dispatcher = request.getRequestDispatcher("/CustomersList.jsp");
        dispatcher.forward(request,response);
    }

    public void destroy() {
    }
}
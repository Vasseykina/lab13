package com.example.lab13;

import Notebook.Notebook;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class Servlet extends HttpServlet {
    private String message;

    public void init() {
        message = "NoteBook";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String name = request.getParameter("firstname");
        String number = request.getParameter("number");


        if (number.length() > 1)
            Notebook.addUser(name, number);
        response.sendRedirect("/index.jsp");
    }

    public void destroy() {
    }
}

package myServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginValidate extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name=request.getParameter("username");
        String password=request.getParameter("password");
        LoginDBO loginDBO=new LoginDBO();
        String message =loginDBO.login(name, password);
        String url="returnMessage.jsp?message="+message;
        url=new String(url.getBytes("GBK"),"ISO8859_1");
        response.sendRedirect(url);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        this.doGet(request, response);
    }

}
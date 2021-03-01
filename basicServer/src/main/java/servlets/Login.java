package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Login extends HttpServlet {
    private static final String DEFAULT_USER = "guest";
    private static final String DEFAULT_PASS = "guest";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");
        if (user == null) {
            user = Login.DEFAULT_USER;
        }
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter writer = response.getWriter();
        writer.append("<!DOCTYPE html>\r\n")
                .append("  <head>\r\n")
                .append("    <title>Login</title>\r\n")
                .append("  <head>\r\n")
                .append("  <body>\r\n")
                .append("  </body>\r\n")
                .append("</html>");
    }
}
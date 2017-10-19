package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
@WebServlet(name = "servlets.LogoutServlet", urlPatterns = "/logout")
public class LogoutServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getSession().removeAttribute("user");
        request.getSession().invalidate();
        response.sendRedirect("/login");
    }
}
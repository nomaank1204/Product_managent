import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/Displayinfo")
public class Displayinfo extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String name = req.getParameter("name");
        String price = req.getParameter("price");
        String qty = req.getParameter("qty");

        if (name ==null || price.trim().isEmpty()
           || qty==null|| qty.trim().isEmpty()){

            req.setAttribute("error","All Field are mandatory");

            req.getRequestDispatcher("Productinfo").forward(req,resp);

            return;
        }
    }
}





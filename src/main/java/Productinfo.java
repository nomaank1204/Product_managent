import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Productinfo")
public class Productinfo extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.print("<h2>Product Info </h2>");

        String error = (String) req.getAttribute("Error");
        if (error != null) {
            out.println("<p style='color:red;'>" + error + "</p>");
        }

        out.print("<form method='post' action='displayproductinfo'>");
        out.print("Product Name: <input type='text' name='name'><br/><br/>");
        out.print(" Product price: <input type='number' name='price'><br/><br/>");
        out.print("Product Quantity: <input type='number' name='qty'><br/><br/>");
        out.print("<input type='submit' value='Login'>");
        out.print("</form>");
    }


    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws IOException, ServletException {

        doGet(req, resp);
    }

}
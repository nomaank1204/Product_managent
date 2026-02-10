import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Feedback")
 public class Feedback_ervlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String message = req.getParameter("message");

        out.print("<html><body>");

        // First time: show feedback form
        if (name == null && email == null && message == null) {

            out.print("<h2>Feedback Form</h2>");
            out.print("<form method='post' action='Feedback'>");

            out.print("Name: <input type='text' name='name' required><br/><br/>");
            out.print("Email: <input type='email' name='email' required><br/><br/>");
            out.print("Feedback:<br/>");
            out.print("<textarea name='message' rows='5' cols='30' required></textarea><br/><br/>");

            out.print("<input type='submit' value='Submit Feedback'>");
            out.print("</form>");
        }
        // After submission
        else {
            out.print("<h3 style='color:green;'>Thank You for Your Feedback!</h3>");
            out.print("<p><b>Name:</b> " + name + "</p>");
            out.print("<p><b>Email:</b> " + email + "</p>");
            out.print("<p><b>Message:</b> " + message + "</p>");

            out.print("<br/><a href='Feedback'>Submit Another Feedback</a>");
        }

        out.print("</body></html>");
    }
}



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns={"/cars"}, loadOnStartup =1)
public class classForServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        resp.setContentType("text/html");
        resp.getWriter().write("Dzien dobry, world!");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse respp) throws ServletException,
            IOException {
    }
}

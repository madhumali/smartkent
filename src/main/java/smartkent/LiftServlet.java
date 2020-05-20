package smartkent;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.PrintWriter;
import java.util.Enumeration;


public class LiftServlet extends HttpServlet {

private static final long serialVersionUID = 102831973239L;

	public void init(ServletConfig config) throws ServletException {	
		super.init(config);
	} 
	public void destroy() {
 
	} 

public void doGet(HttpServletRequest req, HttpServletResponse res)
throws IOException, ServletException
{
PrintWriter out = res.getWriter();
    String userName = req.getParameter("fromFloor");
	String userName1 = req.getParameter("toFloor");
	out.print(userName);
	out.print(userName1);
	Lift l = new Lift(3,1);


}
}

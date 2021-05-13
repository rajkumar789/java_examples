import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class servlet1 extends HttpServlet
{
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	{
		try
		{
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			String n = request.getParameter("userName");
			out.print("Welcome" + n);

			// creating cookie object
			Cookie ck = new Cookie("uname", n);

			// adding cookie in the response
			response.addCookie(ck);

			//creating submit form
			out.print("<form action='servlet2'>");
			out.print("<input type='submit' value='go'>");
			out.print("</form>");
			out.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
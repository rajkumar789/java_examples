import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class servlet2 extends HttpServlet
{
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	{
		try
		{
			response.setContenttype("text/html");
			PrintWriter out = response.getWriter();

			// reading cookie
			Cookie ck[] = request.getCookie();
			out.print("hello" + ck[0].getvalue());
			out.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
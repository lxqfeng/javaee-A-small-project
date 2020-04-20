package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 * Servlet implementation class ContextServlet
 */
@WebServlet("/ContextServlet")
public class ContextServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContextServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    //获取全局参数
	    ServletContext context = this.getServletContext();
	    String appName=context.getInitParameter("appName");
	    String path = context.getContextPath();		
	    String encode=context.getInitParameter("encoding");
	    	    
	    response.setContentType("text/html;charset=utf-8");		
		PrintWriter out=response.getWriter();
		out.println("<h1>"+appName+"</h1>");
		out.println("<h2>解码方式为："+encode+"</h2>");		
		out.println("<h3>项目URL:"+path+"</h3>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}

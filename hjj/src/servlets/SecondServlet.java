package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet(name="SecondServlet", urlPatterns= {"/SecondServlet","/secondServletUrl"})

public class SecondServlet extends HttpServlet {	//第一步：扩展HttpServlet抽象类
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServlet() {
        super();        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    //第二步：重写doGet方法
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//第三步：获取HTTP请求中的参数信息
		request.setCharacterEncoding("utf-8");
		String name=request.getParameter("name");
		//System.out.println(name);
		if("".equals(name)) {	
			//如果用户名为空，则跳转到登录页面
			response.sendRedirect("./chap2/loginSecondServlet.jsp");			
			//response.sendRedirect("../index.jsp");//请测试这行语句，观察括号中的地址表示方法。			
			
		}else {
			//第四步：生成HTTP响应结果		
			String title="SecondServlet";
			String heading1="SecondServlet的doGet方法的输出：";
			
			//设置输出HTML页面和浏览器的解码方式
			response.setContentType("text/html;charset=utf-8");		
			
			//向客户端写出HTML页面
			PrintWriter out=response.getWriter();
			out.print("<HTML><HEAD><TITLE>"+title+"</TITLE>");
			out.print("</HEAD><BODY>");
			out.print(heading1);
			out.println("<h1><p>"+name+":您好</h1>");
			out.print("</BODY></HTML>");
			
			out.close();	//关闭流
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}
}
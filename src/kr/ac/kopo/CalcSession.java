package kr.ac.kopo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CalcSession
 */
@WebServlet("/")
public class CalcSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcSession() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		String btn = request.getParameter("btn");
		
		if(btn == null)
			btn = "0";
		
		HttpSession session = request.getSession();
		Calc calc = (Calc)session.getAttribute("calc");
		
		if(calc == null) {
			calc = new Calc();
		}
		
		calc.click(btn);
		
		session.setAttribute("calc", calc);
		request.setAttribute("display", calc.getDisplay());
		request.getRequestDispatcher("/WEB-INF/view/calc.jsp").forward(request, response);
	}

}

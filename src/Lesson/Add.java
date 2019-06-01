package Lesson;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import jdk.internal.jmod.JmodFile.Section;

/**
 * Servlet implementation class Add
 */
@WebServlet("/Add")
public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;

    String WNAME;
    String WPAS;
    String WSEX;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Add() throws ServletException, IOException {
        super();
        // TODO Auto-generated constructor stub

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=UTF-8");
	    try {
	    	request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e1) {
		// TODO 自動生成された catch ブロック
			e1.printStackTrace();
		}
		HttpSession session = request.getSession();
		WNAME = request.getParameter("name");
		WPAS = request.getParameter("pas");
		WSEX = request.getParameter("radio");
		AddBean bean;
		if(session.getAttribute("s_bean") != null) {
			bean = (AddBean)session.getAttribute("s_bean");
		}else {
			bean = new AddBean();
			session.setAttribute("s_bean",bean);
		}

		bean.setName(WNAME);
		bean.setPas(WPAS);
		bean.setSex(WSEX);
		bean.empAdd();

		try {
			response.sendRedirect("index.jsp");
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package com.moses.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.moses.Dao.BookDao;

/**
 * Servlet implementation class BookServlet
 */
@WebServlet("/BookServlet")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//PrintWriter out = response.getWriter();
		
		int ISBN=Integer.parseInt(request.getParameter("ISBN"));
		String title=request.getParameter("title");
		String authors=request.getParameter("authors");
		LocalDate publicationYear=LocalDate.parse(request.getParameter("publicationYear"));
		String category=request.getParameter("category");
		Double purchasingPrice=Double.parseDouble(request.getParameter("purchasingPrice"));
		Double sellingPrice=Double.parseDouble(request.getParameter("sellingPrice"));
		LocalDate recordindDate=LocalDate.parse(request.getParameter("recordindDate"));
	
		
			BookDao.saveBooks(ISBN, title, authors, publicationYear, category, purchasingPrice, sellingPrice, recordindDate);
			//out.println("save "+ ISBN);
			
			response.sendRedirect("BookList.jsp");

		
		
	}


}

package sharetalent;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private String id;
	private String pw;
	private String name;
	private String phone;
	private String email;
	private String birth;
	private String postcode;
	private String address;
	private String extraAddr;
	private String detailAddr;
	private String account;
	private String accountOwner;
	private String accountBank;

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		System.out.println("Register.doPost()");
		id = request.getParameter("user_id");
		pw = request.getParameter("user_pw");
		name = request.getParameter("user_name");
		phone = request.getParameter("user_phone");
		email = request.getParameter("user_email");
		birth = request.getParameter("user_birth");
		postcode = request.getParameter("user_postcode");

		address = request.getParameter("user_address");
		extraAddr = request.getParameter("user_extraAddress");
		detailAddr = request.getParameter("user_detailAddress");
		address = address + " " + extraAddr + " " + detailAddr;

		account = request.getParameter("user_account");
		accountOwner = request.getParameter("user_accountOwner");
		accountBank = request.getParameter("bank_select");

		
		response.setContentType("text/html; charset=UTF-8");
		
	}
}

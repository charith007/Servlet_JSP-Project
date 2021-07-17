package webProject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SignUPController")
public class SignUPController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			
			CredentialTO credential=new CredentialTO();
			credential.setUsername(request.getParameter("username"));
			credential.setName(request.getParameter("name"));
			credential.setEmail(request.getParameter("email"));
			credential.setPhnumber(request.getParameter("phnumber"));
			credential.setPassword(request.getParameter("password"));
			ConnectDAO conndao=new ConnectDAO();
			conndao.SignUpController(credential);
				RequestDispatcher rd=request.getRequestDispatcher("Register.jsp");
				rd.forward(request, response);
			
		} catch (Exception e) {
		}
	}

}

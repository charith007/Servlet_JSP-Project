package webProject;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SignINController")
public class SignINController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			CredentialTO credential=new CredentialTO();
			credential.setUsername(request.getParameter("username"));
			credential.setPassword(request.getParameter("password"));
			ConnectDAO connectdao=new ConnectDAO();
			ResultSet rs=connectdao.SignInController(credential);
			if(rs.next()) {
				RequestDispatcher rd=request.getRequestDispatcher("Home.jsp");
				rd.forward(request, response);
			}
			else {
				throw new Exception("Invalid Username and Password"); 
			}
			
		} catch (Exception e) {
			request.setAttribute("msg", e.getMessage());
			RequestDispatcher rd=request.getRequestDispatcher("SignIn.jsp");
			rd.forward(request, response);
		}
	}

}

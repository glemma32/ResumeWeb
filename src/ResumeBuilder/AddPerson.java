package ResumeBuilder;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ResumeBuilderPack.Resume;

@WebServlet("/Add")
public class AddPerson extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public AddPerson() {
        super();
        // TODO Auto-generated constructor stub
    }
    /*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}*/

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		HttpSession session = request.getSession();
		String nextURL= "/output.jsp";;
		String first= request.getParameter("first");
		String last= request.getParameter("last");
		String email= request.getParameter("email");
		String degree= request.getParameter("degree");
		String major= request.getParameter("major");
		String u_Grad= request.getParameter("u_Grad");
		String y_Grad= request.getParameter("y_Grad");
		String title= request.getParameter("title");
		String c_Name= request.getParameter("c_Name");
		String s_Date= request.getParameter("s_Date");
		String e_Date= request.getParameter("e_Date");
		String duty= request.getParameter("duty");
		String sFields= request.getParameter("sFields");
		String ratings= request.getParameter("ratings");
		
		
		
			Resume person=new Resume(first,last,email,degree,major,u_Grad,y_Grad,title,c_Name,s_Date,e_Date,duty,sFields,ratings);
			String message=person.displayResume();
			
			//nextURL ="/add.jsp";
			request.setAttribute("message", message);
	
		getServletContext().getRequestDispatcher(nextURL).forward(request,response);
		

	}

}

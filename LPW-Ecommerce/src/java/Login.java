
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {

   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {

      //Obtendo os parâmetros da requisição
      String email = request.getParameter("email");
      String senha = request.getParameter("senha");

      //Comparar com os dados de login default
      if(email.equals("admin@ifpr.edu.br") && senha.equals("admin")){
         //Salvando o seu sucesso em logar
         request.getSession().setAttribute("logado", true);

         //Redirecionar para página dos produtos
         response.sendRedirect("produtos.jsp");
      }else{
         //Redirecionar para a tela de Login
         response.sendRedirect("login.jsp");
      }
   }
}
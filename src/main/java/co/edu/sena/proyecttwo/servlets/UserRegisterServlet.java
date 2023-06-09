package co.edu.sena.proyecttwo.servlets;

import co.edu.sena.proyecttwo.model.User;
import co.edu.sena.proyecttwo.repository.UserRepositoryImpl;
import co.edu.sena.proyecttwo.repository.repository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("registerUser")

public class UserRegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //collect all form data
        String user_firstname = request.getParameter("firstName");
        String user_lastname = request.getParameter("lastName");
        String user_email = request.getParameter("email");
        String user_password = request.getParameter("password");

        //fill it up in a User Bean
        User user = new User();
        user.setUser_firstname(user_firstname);
        user.setUser_lastname(user_lastname);
        user.setUser_email(user_email);
        user.setUser_password(user_password);

        //call repository layer and save the user object to DB
        repository<User> repository = new UserRepositoryImpl();
        try {
            repository.saveObj(user);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        //todo prepare massage for user about success
        int rows =0;
        if (rows==0){
            System.out.println("Ocurrio un error¡");
        }
        else {
            System.out.println("Registro exitoso");
        }

        //todo write the massage back to the page in client browser
    }
}

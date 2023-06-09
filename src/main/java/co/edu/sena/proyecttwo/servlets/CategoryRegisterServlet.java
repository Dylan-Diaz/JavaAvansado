package co.edu.sena.proyecttwo.servlets;

import co.edu.sena.proyecttwo.model.User;
import co.edu.sena.proyecttwo.repository.UserRepositoryImpl;
import co.edu.sena.proyecttwo.repository.repository;
import jakarta.servlet.ServletException;
import co.edu.sena.proyecttwo.model.Categories;
import co.edu.sena.proyecttwo.repository.CategoryRepositoryImpl;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("registerCategories")

public class CategoryRegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String category_name = request.getParameter("category_name");

        Categories categories = new Categories();
        categories.setCategory_name(category_name);

        repository<Categories> repository = new CategoryRepositoryImpl();
        try {
            repository.saveObj(categories);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        int rows =0;
        if (rows==0){
            System.out.println("Ocurrio un error¡");
        }
        else {
            System.out.println("Registro exitoso");
        }

    }
}

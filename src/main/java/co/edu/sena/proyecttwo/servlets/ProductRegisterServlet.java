package co.edu.sena.proyecttwo.servlets;

import co.edu.sena.proyecttwo.model.User;
import co.edu.sena.proyecttwo.repository.ProductRepositoryImlp;
import co.edu.sena.proyecttwo.model.Product;
import co.edu.sena.proyecttwo.repository.UserRepositoryImpl;
import co.edu.sena.proyecttwo.repository.repository;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("registerProduct")

public class ProductRegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String product_name = request.getParameter("product_name");
        Integer product_value = Integer.valueOf(request.getParameter("product_value"));

        Product product = new Product();
        product.setProduct_name(product_name);
        product.setProduct_value(product_value);

        repository<Product> repository = new ProductRepositoryImlp();
        try {
            repository.saveObj(product);
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

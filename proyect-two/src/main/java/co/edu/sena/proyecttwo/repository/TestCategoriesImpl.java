package co.edu.sena.proyecttwo.repository;

import co.edu.sena.proyecttwo.model.Categories;
import co.edu.sena.proyecttwo.model.User;

import java.sql.SQLException;

public class TestCategoriesImpl {
    public static void main(String[] args) throws SQLException {
        repository<Categories> repository = new CategoryRepositoryImpl();
        System.out.println("========== saveObj Insert =========="); //insert
        Categories categories = new Categories();
        categories.setCategory_name("Juguete");
        repository.saveObj(categories);

        System.out.println("========== listAllObj ==========");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();
    }
}

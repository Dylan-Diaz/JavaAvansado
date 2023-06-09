package co.edu.sena.proyecttwo.repository;

import co.edu.sena.proyecttwo.model.Categories;
import co.edu.sena.proyecttwo.model.User;
import co.edu.sena.proyecttwo.util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepositoryImpl implements repository<Categories>{

    private String sql=null;
    @Override
    public List<Categories> listAllObj() throws SQLException {
        sql = "select c.category_id, c.category_name " + "from categories c order by c.category_id, c.category_name";
        List<Categories> categories = new ArrayList<>();
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Categories c = createObj(rs);
                categories.add(c);
            }

        }
        return categories;
    }

    @Override
    public Categories byIdObj(Integer id) throws SQLException {
        sql = "select c.category_id, c.category_name" + " from categories c where c.category_id=?";
        Categories categories = null;
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1,id);
            try(ResultSet rs = ps.executeQuery()){
                if (rs.next()){
                    categories = createObj(rs);
                }
            }
        }
        return categories;
    }

    @Override
    public Integer saveObj(Categories c) throws SQLException {
        int rowsAffected = 0;
        if(c.getCategory_id() != null && c.getCategory_id() > 0) {
            sql = "update categories set category_id = ?, category_name = ?" + "where category_id =?";
        }
        else{
            sql= "insert into categories (category_name)"+"values (upper(?))";
        }
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, c.getCategory_name());
            if(c.getCategory_id() != null && c.getCategory_id() > 0){
                ps.setInt(2, c.getCategory_id());
            }

            rowsAffected = ps.executeUpdate();
        }

        return rowsAffected;
    }

    @Override
    public void deleteObj(Integer id) throws SQLException {
        sql= "delete from categories where category_id =?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, id);
            ps.execute();
        }
    }

    @Override
    public Categories createObj(ResultSet rs) throws SQLException {
        Categories categories = new Categories();
        categories.setCategory_id(rs.getInt("category_id"));
        categories.setCategory_name(rs.getString("category_name"));
        return categories;
    }
}

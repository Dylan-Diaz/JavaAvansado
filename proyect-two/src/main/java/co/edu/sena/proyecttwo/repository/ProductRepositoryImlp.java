package co.edu.sena.proyecttwo.repository;

import co.edu.sena.proyecttwo.model.Product;
import co.edu.sena.proyecttwo.model.User;
import co.edu.sena.proyecttwo.util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImlp implements repository<Product>{

    private String sql=null;
    @Override
    public List<Product> listAllObj() throws SQLException {
        sql = "select p.product_id, p.product_name, p.product_value " + "from product p order by p.product_id, p.product_name, p.product_value";
        List<Product> products = new ArrayList<>();
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Product p = createObj(rs);
                products.add(p);
            }

        }
        return products;
    }

    @Override
    public Product byIdObj(Integer id) throws SQLException {
        sql = "select p.product_id, p.product_name, p.product_value " + "from product p where p.product_id=?";
        Product product = null;

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1,id);
            try(ResultSet rs = ps.executeQuery()){
                if (rs.next()){
                    product = createObj(rs);
                }
            }
        }
        return product;
    }

    @Override
    public Integer saveObj(Product product) throws SQLException {
        int rowsAffected = 0;
        if(product.getProduct_id() != null && product.getProduct_id() > 0) {
            sql = "update product set product_id = ?, product_name = ?, product_value = ? "  + "where product_id =?";
        }
        else{
            sql= "insert into product (product_name, product_value)"+"values (upper(?), upper(?))";
        }
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, product.getProduct_name());
            ps.setFloat(2, product.getProduct_value());
            if(product.getProduct_id() != null && product.getProduct_id() > 0){
                ps.setInt(3, product.getProduct_id());
            }

            rowsAffected = ps.executeUpdate();
        }

        return rowsAffected;
    }

    @Override
    public void deleteObj(Integer id) throws SQLException {
        sql= "delete from product where product_id =?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, id);
            ps.execute();
        }
    }

    @Override
    public Product createObj(ResultSet rs) throws SQLException {
        Product product = new Product();
        product.setProduct_id(rs.getInt("product_id"));
        product.setProduct_name(rs.getString("product_name"));
        product.setProduct_value(rs.getInt("product_value"));
        return product;
    }
}

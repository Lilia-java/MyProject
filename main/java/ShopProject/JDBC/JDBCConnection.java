package ShopProject.JDBC;


import ShopProject.Model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCConnection {

    private Connection connection;

    public JDBCConnection() {
        getConnection();
    }

    private void getConnection() {

        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
            connection.setAutoCommit(false);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public List<Product> executeSimpleQuery() {

        List<Product> products = new ArrayList<>();
        try {
            Statement stmt = connection.createStatement();
            String selectSql = "SELECT * FROM product";

            ResultSet resultSet = stmt.executeQuery(selectSql);

            while (resultSet.next()) {
                Product product = new Product();
                product.setId(resultSet.getInt("id"));
                product.setName(resultSet.getString("name"));
                //product.setStorage(resultSet.getString("storage"));
                product.setPrice(resultSet.getDouble("price"));
                //product.setQuentity(resultSet.getInt("quentity"));
                products.add(product);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;

    }

    public static void main(String[] args) {
        JDBCConnection jdbcConnection = new JDBCConnection();
        List<Product> result = jdbcConnection.executeSimpleQuery();
        result.forEach(System.out::println);
    }

}
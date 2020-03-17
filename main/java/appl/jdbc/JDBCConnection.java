package appl.jdbc;


import appl.model.Client;

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

    public List<Client> executeSimpleQuery() {

        List<Client> clients = new ArrayList<>();
        try {
            Statement stmt = connection.createStatement();
            String selectSql = "SELECT * FROM clients";

            ResultSet resultSet = stmt.executeQuery(selectSql);

            while (resultSet.next()) {
                Client client = new Client();
                client.setId(resultSet.getInt("id"));
                client.setName(resultSet.getString("name"));
                client.setDateBirth(resultSet.getString("dateBirth"));
                client.setGender(resultSet.getString("gender"));
                clients.add(client);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clients;

    }

    public static void main(String[] args) {
        JDBCConnection jdbcConnection = new JDBCConnection();
        List<Client> result = jdbcConnection.executeSimpleQuery();
       // result.forEach(System.out::println);
    }

}

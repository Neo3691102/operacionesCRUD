package com.ebac.modulo59;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Contexto {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/BDmodulo59";
        String user = "root";
        String password = "root";

        MysqlConnection mysqlconnection = new MysqlConnection();
        Connection connection = mysqlconnection.getConnection(url, user, password);

        Statement statement = connection.createStatement();
        String query = "SELECT * FROM tablaMotos";
        ResultSet resultSet = statement.executeQuery(query);

        while(resultSet.next()){
            System.out.println("idMoto: " + resultSet.getInt("idMoto"));
            System.out.println("marca: " + resultSet.getString("marca"));
            System.out.println("modelo: " + resultSet.getString("modelo"));
            System.out.println("Cilindraje: " + resultSet.getInt("CC") + "CC");
        }
    }
}

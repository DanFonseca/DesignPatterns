package br.com.daniel.designPattern.Factory;

import java.sql.*;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection con = new ConnectionFactory().connectionFactory();
    }
}

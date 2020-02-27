package br.com.daniel.designPattern.Factory;

import java.sql.*;


public class ConnectionFactory {
    private String tipoBanco;

    public ConnectionFactory (String tipoBranco){
        this.tipoBanco = tipoBranco;
    }

    public ConnectionFactory (){
        this.tipoBanco = "mySQL";
    }

    public Connection connectionFactory () throws SQLException {
        System.out.println(tipoBanco);
        Connection connection = DriverManager.getConnection("jdbc:"+tipoBanco+"://localhost/test","root","");
        return connection;
    }
}

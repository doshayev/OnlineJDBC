package com.jdbc.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BasicTest {
    public static void main(String[] args) throws SQLException {
        String URL = "jdbc:oracle:thin:@3.90.175.72:1521:xe";
        String username = "hr";
        String password = "hr";
        //to establish connection with a database

        Connection connection = DriverManager.getConnection(URL, username, password);



    }

}

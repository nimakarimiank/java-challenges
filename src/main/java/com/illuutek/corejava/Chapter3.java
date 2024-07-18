package com.illuutek.corejava;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Chapter3 {
    public static void main(String[] args) {
        IO();

    }
    private static void IO(){
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        DataSource dataSource = null;
        try {
            connection = dataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}

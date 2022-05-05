/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.polypro.duan1quanlynongsan.Helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcHelper {

    private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String dburl = "jdbc:sqlserver://localhost;database=QuanLyNongSan;";
    private static String taikhoan = "QLNS";
    private static String matkhau = "123";

    static {
        try {
            Class.forName(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static PreparedStatement prepareStatment(String sql, Object... args) throws SQLException {
        Connection connection = DriverManager.getConnection(dburl, taikhoan, matkhau);
        PreparedStatement pstm = null;
        if (sql.trim().startsWith("{")) {
            pstm = connection.prepareCall(sql);
        } else {
            pstm = connection.prepareStatement(sql);
        }
        for (int i = 0; i < args.length; i++) {
            pstm.setObject(i + 1, args[i]);
        }
        return pstm;
    }

    public static void update(String sql, Object... args) throws SQLException {
        PreparedStatement stmt = prepareStatment(sql, args);
        stmt.executeUpdate();
        stmt.getConnection().close();

    }

    public static ResultSet executeQuery(String sql, Object... args) throws SQLException {
        PreparedStatement stmt = prepareStatment(sql, args);
        return stmt.executeQuery();
    }
;
}

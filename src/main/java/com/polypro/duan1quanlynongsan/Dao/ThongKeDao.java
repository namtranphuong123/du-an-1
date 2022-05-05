/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.polypro.duan1quanlynongsan.Dao;

import com.polypro.duan1quanlynongsan.Helper.DateHelper;
import com.polypro.duan1quanlynongsan.Helper.JdbcHelper;
import com.polypro.duan1quanlynongsan.Model.NongSan;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author VietTech-PC
 */
public class ThongKeDao {

    public static List<Object[]> getQuaTang(String MaNV) {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = "{call sp_QuaTang(?)}";
                rs = JdbcHelper.executeQuery(sql, MaNV);
                while (rs.next()) {
                    int diem = rs.getInt("TongLuotMua");
                    String xepLoai = "10%";
                    if (diem < 0) {
                        xepLoai = " giảm 0% cho lần sau";

                    } else if (diem < 5) {
                        xepLoai = "giảm 2% cho lần mua sau ";

                    }else if (diem >= 5) {
                        xepLoai = "giảm 5% cho lần mua sau ";

                    } else if (diem < 9) {

                        xepLoai = "giảm 7% cho lần mua sau";

                    } else if (diem > 10) {
                        xepLoai = "giảm 10% cho lần mua sau ";
                    }
                    Object[] model = {
                        rs.getString("KhachHang"),
                        diem,
                        xepLoai
                    };
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return list;

    }

    ;
       public static List<Object[]> getDoanhthu(int MaNV) {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = "{call sp_ThongKeDoanhThu1 (?)}";
                rs = JdbcHelper.executeQuery(sql, MaNV);
                while (rs.next()) {
                    Object[] model = {
                        rs.getString("TenNongSan"),
                        rs.getInt("SoPhieuXuat"),
                        rs.getDouble("DoanhThu"),
                        rs.getDouble("ThapNhat"),
                        rs.getDouble("CaoNhat"),
                        rs.getDouble("TrungBinh")
                    };
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    ;

public static List<Object[]> selectHH(int MaNV) {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = "{call sp_ThongKeHH(?)}";
                rs = JdbcHelper.executeQuery(sql, MaNV);
                while (rs.next()) {

                    int a = rs.getInt("ngayconlai");
                    String giamgia = "0% ";
                    if (a <= 0) {
                        giamgia = "hết hạn";
                    } else if (a <= 20) {
                        giamgia = "giảm 25%";
                    } else if (a <= 35) {
                        giamgia = "giảm 15%";
                    } else if (a <= 45) {
                        giamgia = "giảm 10%";
                    } else if (a <= 60) {
                        giamgia = "giảm 5%";
                    }
                    Object[] model = {
                        rs.getString("manongsan"),
                        rs.getString("tennongsan"),
                        rs.getString("ngayhethan"),
                        a,
                        giamgia
                    };
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return list;

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.polypro.duan1quanlynongsan.Dao;

import com.polypro.duan1quanlynongsan.GiaoDien.Main;
import com.polypro.duan1quanlynongsan.Helper.JdbcHelper;
import com.polypro.duan1quanlynongsan.Helper.JdialogHelper;
import com.polypro.duan1quanlynongsan.Model.PhieuNhapa;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class PhieuNhapDaoa {

    private Main gd;

    public void insert(PhieuNhapa nh) {
        try {
            String sql = "INSERT INTO PhieuNhap (MaPN , NgayNhap,   SoLuong ,MaNS,MaNV) VALUES (?, ?, ?, ?, ?)";
            JdbcHelper.update(sql, nh.getMaDN(), nh.getNgayN(), nh.getSoLuong(), nh.getMaNS(), nh.getMaNV());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this.gd, "Lỗi Tồn Tại");
        }
    }

    public void update(PhieuNhapa nh) {
        try {
            String sql = "UPDATE PhieuNhap SET NgayNhap=?,  SoLuong=?, MaNs=?,MaNV=? WHERE MaPN=?";
            JdbcHelper.update(sql, nh.getNgayN(), nh.getSoLuong(),nh.getMaNS(),  nh.getMaNV(), nh.getMaDN());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this.gd, "Không Tồn Tại");
        }
    }

    public void delete(String manh) {
        try {
            int delete = JdialogHelper.comformdialog(this.gd, "Bạn có muốn Xóa DDH", "Hộp Thoại");
            if (delete == JOptionPane.YES_OPTION) {
                String sql = "delete from PhieuNhap where maPN=?";
                JdbcHelper.update(sql, manh);
                JdialogHelper.showmessager(this.gd, "Xóa Đơn Thành công", "thông báo");
            } else {
                return;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this.gd, "Không Thể Xóa Cá Thể Này");
        }
    }

    public List<PhieuNhapa> selectAll() {
        List<PhieuNhapa> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM PhieuNhap";
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                PhieuNhapa nh = new PhieuNhapa();
                nh.setMaDN(rs.getString("maPN"));
                nh.setNgayN(rs.getDate("NgayNhap"));
                nh.setSoLuong(rs.getInt("soluong"));
                nh.setMaNS(rs.getString("MaNs"));
                nh.setMaNV(rs.getString("maNV"));
                list.add(nh);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public PhieuNhapa selectById(String nh) {
        try {
            String sql = "select *from PhieuNhap where mapn=?";
            ResultSet rs = JdbcHelper.executeQuery(sql, nh);
            if (rs.next()) {
                PhieuNhapa nh1 = new PhieuNhapa();
                 nh1.setMaDN(rs.getString("maPN"));
                nh1.setNgayN(rs.getDate("NgayNhap"));
                nh1.setSoLuong(rs.getInt("soluong"));
                nh1.setMaNS(rs.getString("MaNs"));
                nh1.setMaNV(rs.getString("maNV"));

                return nh1;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    protected List<PhieuNhapa> selectBySql(String sql, Object... args) {
        List<PhieuNhapa> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    PhieuNhapa nh1 = new PhieuNhapa();
                     nh1.setMaDN(rs.getString("maPN"));
                nh1.setNgayN(rs.getDate("NgayNhap"));
                nh1.setSoLuong(rs.getInt("soluong"));
                nh1.setMaNS(rs.getString("MaNs"));
                nh1.setMaNV(rs.getString("maNV"));
                    list.add(nh1);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    public List<PhieuNhapa> selectByKeyword(String keyword) throws SQLException {
        List<PhieuNhapa> list = new ArrayList<>();
        String sql = "SELECT * FROM PhieuNhap WHERE Mapn   LIKE ?";
        ResultSet rs = JdbcHelper.executeQuery(sql, "%" + keyword + "%");
        while (rs.next()) {
            PhieuNhapa nh1 = new PhieuNhapa();
            nh1.setMaDN(rs.getString("maPN"));
                nh1.setNgayN(rs.getDate("NgayNhap"));
                nh1.setSoLuong(rs.getInt("soluong"));
                nh1.setMaNS(rs.getString("MaNs"));
                nh1.setMaNV(rs.getString("maNV"));
            list.add(nh1);
        }
        return list;
    }

    public List<PhieuNhapa> loadTable(int mkh) throws SQLException {
        List<PhieuNhapa> list = new ArrayList<>();
        String sql = "SELECT * FROM PhieuNhap ";
        ResultSet rs = JdbcHelper.executeQuery(sql, mkh);
        while (rs.next()) {
            PhieuNhapa nh1 = new PhieuNhapa();
             nh1.setMaDN(rs.getString("maPN"));
                nh1.setNgayN(rs.getDate("NgayNhap"));
                nh1.setSoLuong(rs.getInt("soluong"));
                nh1.setMaNS(rs.getString("MaNs"));
                nh1.setMaNV(rs.getString("maNV"));
            list.add(nh1);
        }
        return list;
    }
}

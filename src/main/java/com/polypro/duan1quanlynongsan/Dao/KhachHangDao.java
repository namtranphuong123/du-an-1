/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.polypro.duan1quanlynongsan.Dao;

import com.polypro.duan1quanlynongsan.GiaoDien.Main;
import com.polypro.duan1quanlynongsan.Helper.JdbcHelper;
import com.polypro.duan1quanlynongsan.Helper.JdialogHelper;
import com.polypro.duan1quanlynongsan.Model.KhachHang;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author VietTech-PC
 */
public class KhachHangDao {

    private Main gd;

    public void insert(KhachHang nh) {
        try {
            String sql = "INSERT INTO KhachHang (MaKH, tenKH, NgaySinh, GioiTinh, DiaChi, Email,SDT, NguoiThem) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            JdbcHelper.update(sql, nh.getMaKH(), nh.getHoTen(), nh.getNgaySinh(), nh.getGioiTinh(),
                    nh.getDiaChi(), nh.getEmail(), nh.getDienThoai(), nh.getMaNV());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this.gd, "Lỗi Tồn Tại");
        }
    }

    public void update(KhachHang nh) {
        try {
            String sql = "UPDATE KhachHang SET Tenkh=?, NgaySinh=?, GioiTinh=?, DiaChi=?, Email=?,SDT=?, NguoiThem=? WHERE MaKH=?";
            JdbcHelper.update(sql, nh.getHoTen(), nh.getNgaySinh(), nh.getGioiTinh(), nh.getDiaChi(), nh.getEmail(), nh.getDienThoai(),
                    nh.getMaNV(), nh.getMaKH());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this.gd, "Tồn Tại");
        }
    }

    public void delete(String manh) {
        try {
            int delete = JdialogHelper.comformdialog(this.gd, "Bạn có muốn Xóa Khách Hàng", "Hộp Thoại");
            if (delete == JOptionPane.YES_OPTION) {
                String sql = "delete from KhachHang where maKH=?";
                JdbcHelper.update(sql, manh);
                JdialogHelper.showmessager(this.gd, "Xóa Khách Hàng Thành Công", "thông báo");
            } else {
                return;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this.gd, "Không Thể Xóa Cá Thể Này");
        }
    }

    public List<KhachHang> selectAll() {
        List<KhachHang> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM KhachHang";
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                KhachHang nh = new KhachHang();
                nh.setMaKH(rs.getString("maKH"));
                nh.setHoTen(rs.getString("TenKH"));
                nh.setNgaySinh(rs.getDate("ngaysinh"));
                nh.setGioiTinh(rs.getInt("gioitinh"));
                nh.setDiaChi(rs.getString("diachi"));
                nh.setEmail(rs.getString("email"));
                nh.setDienThoai(rs.getString("sdt"));
                nh.setMaNV(rs.getString("NguoiThem"));
               

                list.add(nh);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public KhachHang selectById(String nh) {
        try {
            String sql = "select *from KhachHang where maKH=?";
            ResultSet rs = JdbcHelper.executeQuery(sql, nh);
            if (rs.next()) {
                KhachHang nh1 = new KhachHang();
                nh1.setMaKH(rs.getString("maKH"));
                nh1.setHoTen(rs.getString("TenKH"));
                nh1.setNgaySinh(rs.getDate("ngaysinh"));
                nh1.setGioiTinh(rs.getInt("gioitinh"));
                nh1.setDiaChi(rs.getString("diachi"));
                nh1.setEmail(rs.getString("email"));
                nh1.setDienThoai(rs.getString("sdt"));
                nh1.setMaNV(rs.getString("NguoiThem"));
               
                return nh1;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
     public KhachHang selectByName(String nh) {
        try {
            String sql = "select *from KhachHang where TenKH=?";
            ResultSet rs = JdbcHelper.executeQuery(sql, nh);
            if (rs.next()) {
                KhachHang nh1 = new KhachHang();
                nh1.setMaKH(rs.getString("maKH"));
                nh1.setHoTen(rs.getString("TenKH"));
                nh1.setNgaySinh(rs.getDate("ngaysinh"));
                nh1.setGioiTinh(rs.getInt("gioitinh"));
                nh1.setDiaChi(rs.getString("diachi"));
                nh1.setEmail(rs.getString("email"));
                nh1.setDienThoai(rs.getString("sdt"));
                nh1.setMaNV(rs.getString("NguoiThem"));
               
                return nh1;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    protected List<KhachHang> selectBySql(String sql, Object... args) {
        List<KhachHang> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    KhachHang nh1 = new KhachHang();
                      nh1.setMaKH(rs.getString("maKH"));
                nh1.setHoTen(rs.getString("TenKH"));
                nh1.setNgaySinh(rs.getDate("ngaysinh"));
                nh1.setGioiTinh(rs.getInt("gioitinh"));
                nh1.setDiaChi(rs.getString("diachi"));
                nh1.setEmail(rs.getString("email"));
                nh1.setDienThoai(rs.getString("sdt"));
                nh1.setMaNV(rs.getString("NguoiThem"));
               
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

    public List<KhachHang> selectByKeyword(String keyword) throws SQLException {
        List<KhachHang> list = new ArrayList<>();
        String sql = "SELECT * FROM KhachHang WHERE TenKH LIKE ?";
        ResultSet rs = JdbcHelper.executeQuery(sql, "%" + keyword + "%");
        while (rs.next()) {
            KhachHang nh1 = new KhachHang();
              nh1.setMaKH(rs.getString("maKH"));
                nh1.setHoTen(rs.getString("TenKH"));
                nh1.setNgaySinh(rs.getDate("ngaysinh"));
                nh1.setGioiTinh(rs.getInt("gioitinh"));
                nh1.setDiaChi(rs.getString("diachi"));
                nh1.setEmail(rs.getString("email"));
                nh1.setDienThoai(rs.getString("sdt"));
                nh1.setMaNV(rs.getString("NguoiThem"));
             
            list.add(nh1);
        }
        return list;
    }

    public List<KhachHang> loadTable(int mkh) throws SQLException {
        List<KhachHang> list = new ArrayList<>();
        String sql = "SELECT * FROM KhachHang  ";
        ResultSet rs = JdbcHelper.executeQuery(sql, mkh);
        while (rs.next()) {
            KhachHang nh1 = new KhachHang();
              nh1.setMaKH(rs.getString("maKH"));
                nh1.setHoTen(rs.getString("TenKH"));
                nh1.setNgaySinh(rs.getDate("ngaysinh"));
                nh1.setGioiTinh(rs.getInt("gioitinh"));
                nh1.setDiaChi(rs.getString("diachi"));
                nh1.setEmail(rs.getString("email"));
                nh1.setDienThoai(rs.getString("sdt"));
                nh1.setMaNV(rs.getString("NguoiThem"));
               
            list.add(nh1);
        }
        return list;
    }
}

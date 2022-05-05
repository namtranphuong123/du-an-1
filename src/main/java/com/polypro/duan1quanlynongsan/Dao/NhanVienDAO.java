/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.polypro.duan1quanlynongsan.Dao;

import com.polypro.duan1quanlynongsan.GiaoDien.Main;
import com.polypro.duan1quanlynongsan.Helper.JdbcHelper;
import com.polypro.duan1quanlynongsan.Helper.JdialogHelper;
import com.polypro.duan1quanlynongsan.Model.NhanVien;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL-PC
 */
public class NhanVienDAO {

    private Main gd;

    public void insert(NhanVien model) {
        try {
            String sql = "INSERT INTO NhanVien (MaNV, MatKhau, HoTen, Email,SoCMND,GhiChu,VaiTro) VALUES (?, ?, ?, ?, ?, ?, ?)";
            JdbcHelper.update(sql, model.getMaNV(), model.getMatKhau(), model.getHoTen(), model.getEmail(), model.getSoCMND(), model.getGhiChu(), model.getVaiTro());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this.gd, "Lỗi Tồn Tại");
        }
    }

    public void update(NhanVien nv) {
        try {
            String sql = "UPDATE NhanVien SET MatKhau=?, HoTen=?, Email=?,SoCMND=?,GhiChu=?, VaiTro=? WHERE MaNV=?";
            JdbcHelper.update(sql, nv.getMatKhau(), nv.getHoTen(), nv.getEmail(), nv.getSoCMND(), nv.getGhiChu(), nv.getVaiTro(), nv.getMaNV());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this.gd, "Không Tồn Tại");
        }
    }
    public void updatemk(NhanVien nv) {
        try {
            String sql = "UPDATE NhanVien SET MatKhau=? WHERE MaNV=?";
            JdbcHelper.update(sql, nv.getMatKhau(), nv.getMaNV());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this.gd, "Không Tồn Tại");
        }
    }

    public void delete(String nv) {
         try {
            int delete = JdialogHelper.comformdialog(this.gd, "Bạn có muốn Xóa Phiếu xuất", "Hộp Thoại");
            if (delete == JOptionPane.YES_OPTION) {
                String sql = "delete from NhanVien where maNV=?";
                JdbcHelper.update(sql, nv);
                JdialogHelper.showmessager(this.gd, "Xóa NV Thành công", "thông báo");
            } else {
                return;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this.gd, "Không Thể Xóa Cá Thể Này");
        }
    }

    public List<NhanVien> selectAll() {
        List<NhanVien> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM NhanVien";
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setMaNV(rs.getString("manv"));
                nv.setMatKhau(rs.getString("matkhau"));
                nv.setHoTen(rs.getString("hoten"));
                nv.setEmail(rs.getString("Email"));
                nv.setSoCMND(rs.getString("SoCMND"));
                nv.setGhiChu(rs.getString("GhiChu"));

                nv.setVaiTro(rs.getInt("vaitro"));
                list.add(nv);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public NhanVien selectById(String manv) {
        String sql = "select*from nhanvien where manv=?";
        try (ResultSet rs = JdbcHelper.executeQuery(sql, manv);) {
            if (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setMaNV((String) rs.getString("manv"));
                nv.setMatKhau(rs.getString("matkhau"));
                nv.setHoTen(rs.getString("hoten"));
                nv.setEmail(rs.getString("Email"));
                nv.setSoCMND(rs.getString("SoCMND"));
                nv.setGhiChu(rs.getString("GhiChu"));

                nv.setVaiTro(rs.getInt("vaitro"));
                return nv;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    protected List<NhanVien> selectBySql(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    NhanVien nv = new NhanVien();
                    nv.setMaNV((String) rs.getObject("manv"));
                    nv.setMatKhau(rs.getString("matkhau"));
                    nv.setHoTen(rs.getString("hoten"));
                    nv.setEmail(rs.getString("Email"));
                    nv.setSoCMND(rs.getString("SoCMND"));
                    nv.setGhiChu(rs.getString("GhiChu"));

                    nv.setVaiTro((int) rs.getObject("vaitro"));
                    list.add(nv);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    private NhanVien readFromResultSet(ResultSet rs) throws SQLException {
        NhanVien model = new NhanVien();
        model.setMaNV(rs.getString("MaNV"));
        model.setMatKhau(rs.getString("MatKhau"));
        model.setHoTen(rs.getString("HoTen"));
        model.setEmail(rs.getString("Email"));
        model.setSoCMND(rs.getString("SoCMND"));
        model.setGhiChu(rs.getString("GhiChu"));
        model.setVaiTro(rs.getInt("VaiTro"));
        return model;
    }
}

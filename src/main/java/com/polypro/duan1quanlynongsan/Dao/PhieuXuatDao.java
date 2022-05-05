/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.polypro.duan1quanlynongsan.Dao;

import com.polypro.duan1quanlynongsan.GiaoDien.Main;
import com.polypro.duan1quanlynongsan.Helper.JdbcHelper;
import com.polypro.duan1quanlynongsan.Helper.JdialogHelper;
import com.polypro.duan1quanlynongsan.Model.PhieuXuat;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class PhieuXuatDao {

    private Main gd;

    public void insert(PhieuXuat nh) {
        try {
            String sql = "INSERT INTO PhieuXuat (MaPX,NgayXuat, MaKH,   MaNS, SoLuong,DonGia, MaNguoiXuat) VALUES (?, ?, ?, ?, ?, ?, ?)";
            JdbcHelper.update(sql, nh.getMaPX(), nh.getNgayxuat(), nh.getMaKH(), nh.getMaNS(), 
                    nh.getSoLuong() ,nh.getDonGia(),nh.getMaNV());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this.gd, "Lỗi Tồn Tại");
        }
    }

    public void update(PhieuXuat nh) {
        try {
            String sql = "UPDATE PhieuXuat SET NgayXuat=?, MaKH=?,   MaNS=?, SoLuong=?,DonGia=?, MaNguoiXuat=? WHERE MaPX=?";
            JdbcHelper.update(sql,  nh.getNgayxuat(), nh.getMaKH(), nh.getMaNS(),
                    nh.getSoLuong() ,nh.getDonGia(),nh.getMaNV(), nh.getMaPX());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this.gd, "Không Tồn Tại");
        }
    }

    public void delete(String manh) {
        try {
            int delete = JdialogHelper.comformdialog(this.gd, "Bạn có muốn Xóa Phiếu xuất", "Hộp Thoại");
            if (delete == JOptionPane.YES_OPTION) {
                String sql = "delete from PhieuXuat where maPX=?";
                JdbcHelper.update(sql, manh);
                JdialogHelper.showmessager(this.gd, "Xóa Phiếu Thành công", "thông báo");
            } else {
                return;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this.gd, "Không Thể Xóa Cá Thể Này");
        }
    }

    public List<PhieuXuat> selectAll() {
        List<PhieuXuat> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM PhieuXuat";
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                PhieuXuat nh = new PhieuXuat();
                nh.setMaPX(rs.getString("maPX"));
                nh.setNgayxuat(rs.getDate("ngayxuat"));
                nh.setMaKH(rs.getString("MaKH"));
                nh.setMaNS(rs.getString("maNS"));
                nh.setSoLuong(rs.getInt("soluong"));
                nh.setDonGia(rs.getFloat("DonGia"));
                nh.setMaNV(rs.getString("MaNguoiXuat"));

                list.add(nh);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public PhieuXuat selectById(String nh) {
        try {
            String sql = "select *from PhieuXuat where maPX=?";
            ResultSet rs = JdbcHelper.executeQuery(sql, nh);
            if (rs.next()) {
                PhieuXuat nh1 = new PhieuXuat();
                nh1.setMaPX(rs.getString("maPX"));
                nh1.setNgayxuat(rs.getDate("ngayxuat"));
                nh1.setMaKH(rs.getString("MaKH"));
                nh1.setMaNS(rs.getString("maNS"));
                nh1.setSoLuong(rs.getInt("soluong"));
                nh1.setDonGia(rs.getFloat("DonGia"));
                nh1.setMaNV(rs.getString("MaNguoiXuat"));

                return nh1;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    protected List<PhieuXuat> selectBySql(String sql, Object... args) {
        List<PhieuXuat> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    PhieuXuat nh1 = new PhieuXuat();
                    nh1.setMaPX(rs.getString("maPX"));
                    nh1.setNgayxuat(rs.getDate("ngayxuat"));
                    nh1.setMaKH(rs.getString("MaKH"));
                    nh1.setMaNS(rs.getString("maNS"));
                    nh1.setSoLuong(rs.getInt("soluong"));
                    nh1.setDonGia(rs.getFloat("DonGia"));
                    nh1.setMaNV(rs.getString("MaNguoiXuat"));
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

    public List<PhieuXuat> selectByKeyword(String keyword) throws SQLException {
        List<PhieuXuat> list = new ArrayList<>();
            String sql = "SELECT * FROM PhieuXuat WHERE Mapx    LIKE ?";
        ResultSet rs = JdbcHelper.executeQuery(sql, "%" + keyword + "%");
        while (rs.next()) {
            PhieuXuat nh1 = new PhieuXuat();
            nh1.setMaPX(rs.getString("maPX"));
            nh1.setNgayxuat(rs.getDate("ngayxuat"));
            nh1.setMaKH(rs.getString("MaKH"));
            nh1.setMaNS(rs.getString("maNS"));
            nh1.setSoLuong(rs.getInt("soluong"));
            nh1.setDonGia(rs.getFloat("DonGia"));
            nh1.setMaNV(rs.getString("MaNguoiXuat"));
            list.add(nh1);
        }
        return list;
    }

    public List<PhieuXuat> loadTable(int mkh) throws SQLException {
        List<PhieuXuat> list = new ArrayList<>();
        String sql = "SELECT * FROM PhieuXuat  ";
        ResultSet rs = JdbcHelper.executeQuery(sql, mkh);
        while (rs.next()) {
            PhieuXuat nh1 = new PhieuXuat();
            nh1.setMaPX(rs.getString("maPX"));
            nh1.setNgayxuat(rs.getDate("ngayxuat"));
            nh1.setMaKH(rs.getString("MaKH"));
            nh1.setMaNS(rs.getString("maNS"));
            nh1.setSoLuong(rs.getInt("soluong"));
            nh1.setDonGia(rs.getFloat("DonGia"));
            nh1.setMaNV(rs.getString("MaNguoiXuat"));
            list.add(nh1);
        }
        return list;
    }
}

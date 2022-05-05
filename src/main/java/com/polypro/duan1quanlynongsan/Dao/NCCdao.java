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
import com.polypro.duan1quanlynongsan.Model.NhaCC;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class NCCdao {

    private Main gd;

    public void insert(NhaCC nh) {
        try {
            String sql = "INSERT INTO NhaCungCap (Mancc, tenncc, DiaChi,SDT,Email) VALUES (?, ?, ?, ?, ?)";
            JdbcHelper.update(sql, nh.getMaNCC(), nh.getTenNCC(), nh.getDiaChi(), nh.getSDT(), nh.getEmail());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this.gd, "Lỗi Tồn Tại");
        }
    }

    public void update(NhaCC nh) {
        try {
            String sql = "UPDATE NhaCungCap SET  tenncc=?, DiaChi=?,SDT=?,Email=? WHERE MaNCC=?";
            JdbcHelper.update(sql, nh.getTenNCC(), nh.getDiaChi(), nh.getSDT(), nh.getEmail(), nh.getMaNCC());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this.gd, "Tồn Tại");
        }
    }

    public void delete(String manh) {
        try {
            int delete = JdialogHelper.comformdialog(this.gd, "Bạn có muốn Xóa NCC", "Hộp Thoại");
            if (delete == JOptionPane.YES_OPTION) {
                String sql = "delete from NhaCungCap where maNCC=?";
                JdbcHelper.update(sql, manh);
                JdialogHelper.showmessager(this.gd, "Xóa NCC Thành Công", "thông báo");
            } else {
                return;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this.gd, "Không Thể Xóa Cá Thể Này");
        }
    }

    public List<NhaCC> selectAll() {
        List<NhaCC> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM NhaCungCap";
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                NhaCC nh = new NhaCC();
                nh.setMaNCC(rs.getString("mancc"));
                nh.setTenNCC(rs.getString("Tenncc"));
                nh.setDiaChi(rs.getString("diachi"));
                nh.setEmail(rs.getString("email"));
                nh.setSDT(rs.getString("sdt"));

                list.add(nh);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public NhaCC selectById(String nh) {
        try {
            String sql = "select *from NhaCungCap where maNCC=?";
            ResultSet rs = JdbcHelper.executeQuery(sql, nh);
            if (rs.next()) {
                NhaCC nh1 = new NhaCC();
                nh1.setMaNCC(rs.getString("mancc"));
                nh1.setTenNCC(rs.getString("Tenncc"));

                nh1.setDiaChi(rs.getString("diachi"));
                nh1.setEmail(rs.getString("email"));
                nh1.setSDT(rs.getString("sdt"));
                return nh1;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
     public NhaCC selectByName(String nh) {
        try {
            String sql = "select *from NhaCungCap where tenncc=?";
            ResultSet rs = JdbcHelper.executeQuery(sql, nh);
            if (rs.next()) {
                NhaCC nh1 = new NhaCC();
                nh1.setMaNCC(rs.getString("mancc"));
                nh1.setTenNCC(rs.getString("Tenncc"));

                nh1.setDiaChi(rs.getString("diachi"));
                nh1.setEmail(rs.getString("email"));
                nh1.setSDT(rs.getString("sdt"));
                return nh1;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    protected List<NhaCC> selectBySql(String sql, Object... args) {
        List<NhaCC> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    NhaCC nh1 = new NhaCC();
                    nh1.setMaNCC(rs.getString("mancc"));
                    nh1.setTenNCC(rs.getString("Tenncc"));

                    nh1.setDiaChi(rs.getString("diachi"));
                    nh1.setEmail(rs.getString("email"));
                    nh1.setSDT(rs.getString("sdt"));

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

    public List<NhaCC> selectByKeyword(String keyword) throws SQLException {
        List<NhaCC> list = new ArrayList<>();
        String sql = "SELECT * FROM NhaCungCap WHERE TenNCC LIKE ?";
        ResultSet rs = JdbcHelper.executeQuery(sql, "%" + keyword + "%");
        while (rs.next()) {
            NhaCC nh1 = new NhaCC();
            nh1.setMaNCC(rs.getString("mancc"));
            nh1.setTenNCC(rs.getString("Tenncc"));

            nh1.setDiaChi(rs.getString("diachi"));
            nh1.setEmail(rs.getString("email"));
            nh1.setSDT(rs.getString("sdt"));

            list.add(nh1);
        }
        return list;
    }

}

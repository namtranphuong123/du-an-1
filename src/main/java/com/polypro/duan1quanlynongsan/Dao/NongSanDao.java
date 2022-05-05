/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.polypro.duan1quanlynongsan.Dao;

import com.polypro.duan1quanlynongsan.GiaoDien.Main;
import com.polypro.duan1quanlynongsan.Helper.JdbcHelper;
import com.polypro.duan1quanlynongsan.Helper.JdialogHelper;
import com.polypro.duan1quanlynongsan.Model.NongSan;
import com.polypro.duan1quanlynongsan.Model.PhieuNhapa;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class NongSanDao {

    private Main gd;

    public void insert(NongSan nh) {
        try {
            String sql = "INSERT INTO NongSan (MaNS, tenNS , DonViTinh , NgaySX , ngayHan,DonGia,maNcc,NguoiTao ) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            JdbcHelper.update(sql, nh.getMaNS(), nh.getTenNS(), nh.getDVT(), nh.getNgaySX(), nh.getNgayHH(), 
                    nh.getGia(), nh.getNCC(), nh.getMaNV());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this.gd, "Lỗi Tồn Tại");
        }
    }

    public void update(NongSan nh) {
        try {
            String sql = "UPDATE NongSan SET  tenNS=?,DonViTinh=?,NgaySX=?,ngayHan=?,DonGia=?,maNcc=?,NguoiTao=? WHERE MaNS=?";
            JdbcHelper.update(sql, nh.getTenNS(), nh.getDVT(), nh.getNgaySX(), nh.getNgayHH(), 
                    nh.getGia(), nh.getNCC(), nh.getMaNV(), nh.getMaNS());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this.gd, "Tồn Tại");
        }
    }

    public void delete(String manh) {
        try {
            int delete = JdialogHelper.comformdialog(this.gd, "Bạn có muốn Xóa Nông Sản Này", "Hộp Thoại");
            if (delete == JOptionPane.YES_OPTION) {
                String sql = "delete from NongSan where maNS=?";
                JdbcHelper.update(sql, manh);
                JdialogHelper.showmessager(this.gd, "Xóa NS Thành Công", "thông báo");
            } else {
                return;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this.gd, "Không Thể Xóa Cá Thể Này");
        }
    }

    public List<NongSan> selectAll() {
        String sql = "SELECT * FROM NongSan";
        List<NongSan> list = new ArrayList<>();
        try {
            
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                NongSan nh = new NongSan();
                nh.setMaNS(rs.getString("maNS"));
                nh.setTenNS(rs.getString("TenNS"));
                nh.setDVT(rs.getString("DonViTinh"));
                nh.setNgaySX(rs.getDate("ngaySX"));
                nh.setNgayHH(rs.getDate("ngayHan"));
                nh.setGia(rs.getFloat("DonGia"));
                nh.setNCC(rs.getString("maNcc"));
                nh.setMaNV(rs.getString("nguoitao"));

                list.add(nh);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public NongSan selectById(String nh) {
        try {
            String sql = "select *from NongSan where maNS=?";
            ResultSet rs = JdbcHelper.executeQuery(sql, nh);
            if (rs.next()) {
                NongSan nh1 = new NongSan();
                nh1.setMaNS(rs.getString("maNS"));
                nh1.setTenNS(rs.getString("TenNS"));

                nh1.setDVT(rs.getString("DonViTinh"));
                nh1.setNgaySX(rs.getDate("ngaySX"));
                nh1.setNgayHH(rs.getDate("ngayHan"));
                nh1.setGia(rs.getFloat("DonGia"));
                nh1.setNCC(rs.getString("maNcc"));
                nh1.setMaNV(rs.getString("nguoitao"));
                return nh1;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
     public NongSan selectByName(String nh) {
        try {
            String sql = "select *from NongSan where tenns=?";
            ResultSet rs = JdbcHelper.executeQuery(sql, nh);
            if (rs.next()) {
                NongSan nh1 = new NongSan();
                nh1.setMaNS(rs.getString("maNS"));
                nh1.setTenNS(rs.getString("TenNS"));

                nh1.setDVT(rs.getString("DonViTinh"));
                nh1.setNgaySX(rs.getDate("ngaySX"));
                nh1.setNgayHH(rs.getDate("ngayHan"));
                nh1.setGia(rs.getFloat("DonGia"));
                nh1.setNCC(rs.getString("maNcc"));
                nh1.setMaNV(rs.getString("nguoitao"));
                return nh1;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    protected List<NongSan> selectBySql(String sql, Object... args) {
        List<NongSan> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    NongSan nh1 = new NongSan();
                    nh1.setMaNS(rs.getString("maNS"));
                    nh1.setTenNS(rs.getString("TenNS"));

                    nh1.setDVT(rs.getString("DonViTinh"));
                    nh1.setNgaySX(rs.getDate("ngaySX"));
                    nh1.setNgayHH(rs.getDate("ngayHan"));
                    nh1.setGia(rs.getFloat("DonGia"));
                    nh1.setNCC(rs.getString("maNcc"));
                    nh1.setMaNV(rs.getString("nguoitao"));

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

    public List<NongSan> selectByKeyword(String keyword) throws SQLException {
        List<NongSan> list = new ArrayList<>();
        String sql = "SELECT * FROM NongSan WHERE TenNS LIKE ?";
        ResultSet rs = JdbcHelper.executeQuery(sql, "%" + keyword + "%");
        while (rs.next()) {
            NongSan nh1 = new NongSan();
            nh1.setMaNS(rs.getString("maNS"));
            nh1.setTenNS(rs.getString("TenNS"));

            nh1.setDVT(rs.getString("DonViTinh"));
            nh1.setNgaySX(rs.getDate("ngaySX"));
            nh1.setNgayHH(rs.getDate("ngayHan"));
            nh1.setGia(rs.getFloat("DonGia"));
                    nh1.setNCC(rs.getString("maNcc"));
                    nh1.setMaNV(rs.getString("nguoitao"));

            list.add(nh1);
        }
        return list;
    }

    public List<NongSan> loadTable(int mkh) throws SQLException {
        List<NongSan> list = new ArrayList<>();
        String sql = "SELECT * FROM NongSan  ";
        ResultSet rs = JdbcHelper.executeQuery(sql, mkh);
        while (rs.next()) {
            NongSan nh1 = new NongSan();
            nh1.setMaNS(rs.getString("maNS"));
            nh1.setTenNS(rs.getString("TenNS"));

            nh1.setDVT(rs.getString("DonViTinh"));
            nh1.setNgaySX(rs.getDate("ngaySX"));
            nh1.setNgayHH(rs.getDate("ngayHan"));
            nh1.setGia(rs.getFloat("DonGia"));
                    nh1.setNCC(rs.getString("maNcc"));
                    nh1.setMaNV(rs.getString("nguoitao"));

            list.add(nh1);
        }
        return list;
    }
    
     
}

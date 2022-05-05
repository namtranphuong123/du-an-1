/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.polypro.duan1quanlynongsan.Dao;

import com.polypro.duan1quanlynongsan.Helper.JdbcHelper;
import com.polypro.duan1quanlynongsan.Model.KhachHang;
import java.io.EOFException;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 *
 * @author Admin
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({JdbcHelper.class,KhachHangDao.class
})
public class KhachHangDaoTest {
    KhachHangDao khachHangdao;
    KhachHangDao khachHangDaoSpy;
    public KhachHangDaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        khachHangdao = new KhachHangDao();
        PowerMockito.mockStatic(JdbcHelper.class);
        khachHangDaoSpy = PowerMockito.spy(new KhachHangDao());
    }
    
    @After
    public void tearDown() {
    }

  
    //mong muon nem ra mot ngoại le
    // muôn them 1 nh vao phuong thưc ínert bat buoc khong the chen du lieu null vào csdl mà phai nen ra ngoại le
    @Test(expected = Exception.class)
    public void testInsertWhitnulNh() {
        KhachHang nh = null;
        khachHangdao.insert(nh);
    }
     @Test(expected = Exception.class)
    public void testInsertWhitEmptyNh() {
        // khi new du lieu trong khach hang chua co gi thi phat sinh loi .
        KhachHang nh = new KhachHang();
        khachHangdao.insert(nh);
    }
     @Test()
    public void testInsertWhitVailidNh() {
        // khi new du lieu trong khach hang chua co gi thi phat sinh loi .
        KhachHang nh = new KhachHang();
        nh.setDiaChi("no");
        nh.setDienThoai("0362377557");
        nh.setEmail("nantran481@gmial.com");
        nh.setGioiTinh(0);
        nh.setHoTen("Trần Phương Nam");
        nh.setMaKH("KH001");
        nh.setMaNV("NV001");
        nh.setNgaySinh(null);
        khachHangdao.insert(nh);
    }

    @Test(expected = Exception.class)
    public void testUpdateWhitNulNh() {
        KhachHang nh = null;
        khachHangdao.update(nh);
    }
    @Test(expected = Exception.class)
    public void testUpdateWhitEmptyNh() {
        KhachHang nh = new KhachHang();
        khachHangdao.update(nh);
    }
     @Test()
    public void testUpdateWhitVailidNh() {
        KhachHang nh = new KhachHang();
         nh.setDiaChi("no");
        nh.setDienThoai("0362377557");
        nh.setEmail("nantran481@gmial.com");
        nh.setGioiTinh(0);
        nh.setHoTen("Trần Phương Nam");
        nh.setMaKH("KH001");
        nh.setMaNV("NV001");
        nh.setNgaySinh(null);
        khachHangdao.update(nh);
    }

    @Test(expected = Exception.class)
    public void testDeleteWhitEmptyId() {
  String manh = "";
        khachHangdao.delete(manh);
    }
    @Test(expected = Exception.class)
    public void testDeleteWhitnullId() {
  String manh = null;
        khachHangdao.delete(manh);
    }
    @Test()
    public void testDeleteWhitVailidId() {
  String manh = "KH001";
        khachHangdao.delete(manh);
    }
    @Test
    public void testSelectAll() {
        System.out.println("selectAll");
        KhachHangDao instance = new KhachHangDao();
        List<KhachHang> expResult = null;
        List<KhachHang> result = instance.selectAll();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSelectById() {
        System.out.println("selectById");
        String nh = "";
        KhachHangDao instance = new KhachHangDao();
        KhachHang expResult = null;
        KhachHang result = instance.selectById(nh);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSelectByName() {
        System.out.println("selectByName");
        String nh = "";
        KhachHangDao instance = new KhachHangDao();
        KhachHang expResult = null;
        KhachHang result = instance.selectByName(nh);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSelectBySql() {
        System.out.println("selectBySql");
        String sql = "";
        Object[] args = null;
        KhachHangDao instance = new KhachHangDao();
        List<KhachHang> expResult = null;
        List<KhachHang> result = instance.selectBySql(sql, args);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSelectByKeyword() throws Exception {
        System.out.println("selectByKeyword");
        String keyword = "";
        KhachHangDao instance = new KhachHangDao();
        List<KhachHang> expResult = null;
        List<KhachHang> result = instance.selectByKeyword(keyword);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testLoadTable() throws Exception {
        System.out.println("loadTable");
        int mkh = 0;
        KhachHangDao instance = new KhachHangDao();
        List<KhachHang> expResult = null;
        List<KhachHang> result = instance.loadTable(mkh);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}

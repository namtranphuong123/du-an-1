/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.polypro.duan1quanlynongsan.Model;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class KhachHangTest {
    
    public KhachHangTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getMaKH method, of class KhachHang.
     */
    @Test
    public void testGetMaKH() {
       
        KhachHang instance = new KhachHang();
        String expResult = null;
        String result = instance.getMaKH();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMaKH method, of class KhachHang.
     */
    @Test
    public void testSetMaKH() {
        String maKH = "KH00001";
        KhachHang instance = new KhachHang();
        instance.setMaKH(maKH);
        String expected="KH00001";
        assertEquals(expected, instance.getMaKH());
    }

    /**
     * Test of getHoTen method, of class KhachHang.
     */
    @Test
    public void testGetHoTen() {
        System.out.println("getHoTen");
        KhachHang instance = new KhachHang();
        String expResult = null;
        String result = instance.getHoTen();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of setHoTen method, of class KhachHang.
     */
    @Test
    public void testSetHoTen() {
     
        String hoTen = "Trần Phương Nam";
        KhachHang instance = new KhachHang();
        instance.setHoTen(hoTen);
      String expected="Trần Phương Nam";
        assertEquals(expected, instance.getHoTen());
    }

    /**
     * Test of getNgaySinh method, of class KhachHang.
     */
    @Test
    public void testGetNgaySinh() {
      
        KhachHang instance = new KhachHang();
        Date expResult = null;
        Date result = instance.getNgaySinh();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setNgaySinh method, of class KhachHang.
     */
    @Test
    public void testSetNgaySinh() {
        System.out.println("setNgaySinh");
        Date ngaySinh = null;
        KhachHang instance = new KhachHang();
        instance.setNgaySinh(ngaySinh);
       String expected=null;
        assertEquals(expected, instance.getMaKH());
    }

    /**
     * Test of getGioiTinh method, of class KhachHang.
     */
    @Test
    public void testGetGioiTinh() {
      
        KhachHang instance = new KhachHang();
        int expResult = 0;
        int result = instance.getGioiTinh();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setGioiTinh method, of class KhachHang.
     */
    @Test
    public void testSetGioiTinh() {
     
        int gioiTinh = 0;
        KhachHang instance = new KhachHang();
        instance.setGioiTinh(gioiTinh);
        int expected= 0 ;
        assertEquals(expected, instance.getGioiTinh());
    }
     @Test
    public void testSetGioiTinhFemale() {
     
        int gioiTinh = 1;
        KhachHang instance = new KhachHang();
        instance.setGioiTinh(gioiTinh);
        int expected= 1 ;
        assertEquals(expected, instance.getGioiTinh());
    }

    /**
     * Test of getDienThoai method, of class KhachHang.
     */
    @Test
    public void testGetDienThoai() {
     
        KhachHang instance = new KhachHang();
        String expResult = null;
        String result = instance.getDienThoai();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setDienThoai method, of class KhachHang.
     */
    @Test
    public void testSetDienThoai() {
       
        String dienThoai = "0349855922";
        KhachHang instance = new KhachHang();
        instance.setDienThoai(dienThoai);
       String expected="0349855922";
        assertEquals(expected, instance.getDienThoai());
    }
   

    /**
     * Test of getEmail method, of class KhachHang.
     */
    @Test
    public void testGetEmail() {
        
        KhachHang instance = new KhachHang();
        String expResult = null;
        String result = instance.getEmail();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of setEmail method, of class KhachHang.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "nantran481@gmail.com";
        KhachHang instance = new KhachHang();
        instance.setEmail(email);
       String expected="nantran481@gmail.com";
        assertEquals(expected, instance.getEmail());
    }

    /**
     * Test of getDiaChi method, of class KhachHang.
     */
    @Test
    public void testGetDiaChi() {

        KhachHang instance = new KhachHang();
        String expResult = null;
        String result = instance.getDiaChi();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setDiaChi method, of class KhachHang.
     */
    @Test
    public void testSetDiaChi() {
        
        String DiaChi = "44-ho quy ly";
        KhachHang instance = new KhachHang();
        instance.setDiaChi(DiaChi);
       String expected="44-ho quy ly";
        assertEquals(expected, instance.getDiaChi());
    }

    /**
     * Test of getMaNV method, of class KhachHang.
     */
    @Test
    public void testGetMaNV() {
       
        KhachHang instance = new KhachHang();
        String expResult = null;
        String result = instance.getMaNV();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setMaNV method, of class KhachHang.
     */
    @Test
    public void testSetMaNV() {
       
        String maNV = "chu";
        KhachHang instance = new KhachHang();
        instance.setMaNV(maNV);
      String expected="chu";
        assertEquals(expected, instance.getMaNV());
    }
    
}

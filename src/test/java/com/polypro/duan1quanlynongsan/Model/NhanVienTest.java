/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.polypro.duan1quanlynongsan.Model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 *
 * @author Admin
 */
public class NhanVienTest {
    
    public NhanVienTest() {
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
     * Test of getMaNV method, of class NhanVien.
     */
    @Test
    public void testGetMaNV() {
        NhanVien instance = new NhanVien();
        String expResult = null;
        String result = instance.getMaNV();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setMaNV method, of class NhanVien.
     */
    @Test
    public void testSetMaNV() {
        String maNV = "NV00001";
        NhanVien instance = new NhanVien();
        instance.setMaNV(maNV);
         String expected="NV00001";
        assertEquals(expected, instance.getMaNV());
    }

    /**
     * Test of getMatKhau method, of class NhanVien.
     */
    @Test
    public void testGetMatKhau() {
        NhanVien instance = new NhanVien();
        String expResult = null;
        String result = instance.getMatKhau();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMatKhau method, of class NhanVien.
     */
    @Test
    public void testSetMatKhau() {
        String matKhau = "123";
        NhanVien instance = new NhanVien();
        instance.setMatKhau(matKhau);
        String expected="123";
        assertEquals(expected, instance.getMatKhau());
    }

    /**
     * Test of getHoTen method, of class NhanVien.
     */
    @Test
    public void testGetHoTen() {
        NhanVien instance = new NhanVien();
        String expResult =null;
        String result = instance.getHoTen();
        assertEquals(expResult, result);
    }

    /**
     * Test of setHoTen method, of class NhanVien.
     */
    @Test
    public void testSetHoTen() {
        String hoTen = "TRAN PHUONG NAM";
        NhanVien instance = new NhanVien();
        instance.setHoTen(hoTen); 
        String expected="TRAN PHUONG NAM";
        assertEquals(expected, instance.getHoTen());
    }

    /**
     * Test of getEmail method, of class NhanVien.
     */
    @Test
    public void testGetEmail() {
        NhanVien instance = new NhanVien();
        String expResult = null;
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEmail method, of class NhanVien.
     */
    @Test
    public void testSetEmail() {
        String Email = "nantran@gmail.com";
        NhanVien instance = new NhanVien();
        instance.setEmail(Email);
         String expected="nantran@gmail.com";
        assertEquals(expected, instance.getEmail());
    }

    /**
     * Test of getSoCMND method, of class NhanVien.
     */
    @Test
    public void testGetSoCMND() {
        NhanVien instance = new NhanVien();
        String expResult = null;
        String result = instance.getSoCMND();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSoCMND method, of class NhanVien.
     */
    @Test
    public void testSetSoCMND() {
        System.out.println("setSoCMND");
        String SoCMND = "231357371";
        NhanVien instance = new NhanVien();
        instance.setSoCMND(SoCMND);
         String expected="231357371";
        assertEquals(expected, instance.getSoCMND());
    }

    

    /**
     * Test of getVaiTro method, of class NhanVien.
     */
    @Test
    public void testGetVaiTro() {
        NhanVien instance = new NhanVien();
        int expResult = 0;
        int result = instance.getVaiTro();
        assertEquals(expResult, result);
    }

    /**
     * Test of setVaiTro method, of class NhanVien.
     */
    @Test
    public void testSetVaiTro() {
        System.out.println("setVaiTro");
        int vaiTro = 0;
        NhanVien instance = new NhanVien();
        instance.setVaiTro(vaiTro);
        
         int expected=0;
        assertEquals(expected, instance.getVaiTro());
    }
      @Test
   

    /**
     * Test of getGhiChu method, of class NhanVien.
     */
  
    public void testGetGhiChu() {
        NhanVien instance = new NhanVien();
        String expResult = null;
        String result = instance.getGhiChu();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGhiChu method, of class NhanVien.
     */
    @Test
    public void testSetGhiChu() {
        System.out.println("setGhiChu");
        String GhiChu = "ok";
        NhanVien instance = new NhanVien();
        instance.setGhiChu(GhiChu);
         String expected="ok";
        assertEquals(expected, instance.getGhiChu());
        
    }

    /**
     * Test of getGioiTinh method, of class NhanVien.
     */
    @Test
    public void testGetGioiTinh() {
        NhanVien instance = new NhanVien();
        int expResult = 0;
        int result = instance.getGioiTinh();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGioiTinh method, of class NhanVien.
     */
    @Test
    public void testSetGioiTinh() {
        System.out.println("setGioiTinh");
        int GioiTinh = 1;
        NhanVien instance = new NhanVien();
        instance.setGioiTinh(GioiTinh);
         int expected=1;
        assertEquals(expected, instance.getGioiTinh());
    }
    
}

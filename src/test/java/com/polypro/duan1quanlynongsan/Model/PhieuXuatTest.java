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
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 *
 * @author Admin
 */
public class PhieuXuatTest {
    
    public PhieuXuatTest() {
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
     * Test of getMaPX method, of class PhieuXuat.
     */
    @Test
    public void testGetMaPX() {
        PhieuXuat instance = new PhieuXuat();
        String expResult = null;
        String result = instance.getMaPX();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMaPX method, of class PhieuXuat.
     */
    @Test
    public void testSetMaPX() {
        String maPX = "PX01";
        PhieuXuat instance = new PhieuXuat();
        instance.setMaPX(maPX);
        
        String expected="PX01";
        assertEquals(expected, instance.getMaPX());
    }

    /**
     * Test of getMaKH method, of class PhieuXuat.
     */
    @Test
    public void testGetMaKH() {
        PhieuXuat instance = new PhieuXuat();
        String expResult = null;
        String result = instance.getMaKH();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMaKH method, of class PhieuXuat.
     */
    @Test
    public void testSetMaKH() {
        String maKH = "KH01";
        PhieuXuat instance = new PhieuXuat();
        instance.setMaKH(maKH);
        
        String expected="KH01";
        assertEquals(expected, instance.getMaKH());
    }

    /**
     * Test of getNgayxuat method, of class PhieuXuat.
     */
    @Test
    public void testGetNgayxuat() {
        PhieuXuat instance = new PhieuXuat();
        Date expResult = null;
        Date result = instance.getNgayxuat();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNgayxuat method, of class PhieuXuat.
     */
    @Test
    public void testSetNgayxuat() {
        System.out.println("setNgayxuat");
        Date ngayxuat = null;
        PhieuXuat instance = new PhieuXuat();
        instance.setNgayxuat(ngayxuat);
        
        Date expected=null;
        assertEquals(expected, instance.getNgayxuat());
    }

    /**
     * Test of getDonGia method, of class PhieuXuat.
     */
    @Test
    public void testGetDonGia() {
        PhieuXuat instance = new PhieuXuat();
        float expResult = 0.0F;
        float result = instance.getDonGia();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setDonGia method, of class PhieuXuat.
     */
    @Test
    public void testSetDonGia() {
        float DonGia = 0.0F;
        PhieuXuat instance = new PhieuXuat();
        instance.setDonGia(DonGia);
        
       
    }

    /**
     * Test of getMaNV method, of class PhieuXuat.
     */
    @Test
    public void testGetMaNV() {
        PhieuXuat instance = new PhieuXuat();
        String expResult = null;
        String result = instance.getMaNV();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMaNV method, of class PhieuXuat.
     */
    @Test
    public void testSetMaNV() {
        String maNV = "NS01";
        PhieuXuat instance = new PhieuXuat();
        instance.setMaNV(maNV);
        String expected="NS01";
        assertEquals(expected, instance.getMaNV());
    }

    /**
     * Test of getMaNS method, of class PhieuXuat.
     */
    @Test
    public void testGetMaNS() {
        PhieuXuat instance = new PhieuXuat();
        String expResult = null;
        String result = instance.getMaNS();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMaNS method, of class PhieuXuat.
     */
    @Test
    public void testSetMaNS() {
        System.out.println("setMaNS");
        String maNS = "NS01";
        PhieuXuat instance = new PhieuXuat();
        instance.setMaNS(maNS);
        
        String expected="NS01";
        assertEquals(expected, instance.getMaNS());
    }

    /**
     * Test of getSoLuong method, of class PhieuXuat.
     */
    @Test
    public void testGetSoLuong() {
        PhieuXuat instance = new PhieuXuat();
        int expResult = 0;
        int result = instance.getSoLuong();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSoLuong method, of class PhieuXuat.
     */
    @Test
    public void testSetSoLuong() {
        int SoLuong = 0;
        PhieuXuat instance = new PhieuXuat();
        instance.setSoLuong(SoLuong);
        
        int expected=0;
        assertEquals(expected, instance.getSoLuong());
    }
    
}

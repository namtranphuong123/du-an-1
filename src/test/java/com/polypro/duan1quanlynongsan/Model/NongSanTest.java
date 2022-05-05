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
public class NongSanTest {
    
    public NongSanTest() {
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
     * Test of getMaNS method, of class NongSan.
     */
    @Test
    public void testGetMaNS() {
        NongSan instance = new NongSan();
        String expResult = null;
        String result = instance.getMaNS();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of setMaNS method, of class NongSan.
     */
    @Test
    public void testSetMaNS() {
        String MaNS = "NS001";
        NongSan instance = new NongSan();
        instance.setMaNS(MaNS);
        String expected = "NS001";
         assertEquals(expected, instance.getMaNS());
    }

    /**
     * Test of getTenNS method, of class NongSan.
     */
    @Test
    public void testGetTenNS() {
 
        NongSan instance = new NongSan();
        String expResult = null;
        String result = instance.getTenNS();
        assertEquals(expResult, result);
    
    }

    /**
     * Test of setTenNS method, of class NongSan.
     */
    @Test
    public void testSetTenNS() {
        
        String TenNS = "kk";
        NongSan instance = new NongSan();
        instance.setTenNS(TenNS);
       String expected = "kk";
         assertEquals(expected, instance.getTenNS());
    }

    /**
     * Test of getDVT method, of class NongSan.
     */
    @Test
    public void testGetDVT() {
        NongSan instance = new NongSan();
        String expResult =null;
        String result = instance.getDVT();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDVT method, of class NongSan.
     */
    @Test
    public void testSetDVT() {
      
        String DVT = "kg";
        NongSan instance = new NongSan();
        instance.setDVT(DVT);
        String expected = "kg";
         assertEquals(expected, instance.getDVT());
        
    }

    /**
     * Test of getNgaySX method, of class NongSan.
     */
    @Test
    public void testGetNgaySX() {
       
        NongSan instance = new NongSan();
        Date expResult = null;
        Date result = instance.getNgaySX();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNgaySX method, of class NongSan.
     */
    @Test
    public void testSetNgaySX() {
        System.out.println("setNgaySX");
        Date NgaySX = null;
        NongSan instance = new NongSan();
        instance.setNgaySX(NgaySX);
        String expected = null;
         assertEquals(expected, instance.getNgaySX());
    }

    /**
     * Test of getNgayHH method, of class NongSan.
     */
    @Test
    public void testGetNgayHH() {
      
        NongSan instance = new NongSan();
        Date expResult = null;
        Date result = instance.getNgayHH();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNgayHH method, of class NongSan.
     */
    @Test
    public void testSetNgayHH() {
        System.out.println("setNgayHH");
        Date NgayHH = null;
        NongSan instance = new NongSan();
        instance.setNgayHH(NgayHH);
       String expected = null;
         assertEquals(expected, instance.getNgayHH());;
    }

    /**
     * Test of getNCC method, of class NongSan.
     */
    @Test
    public void testGetNCC() {
        NongSan instance = new NongSan();
        String expResult = null;
        String result = instance.getNCC();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNCC method, of class NongSan.
     */
    @Test
    public void testSetNCC() {
        String NCC = "ncc0";
        NongSan instance = new NongSan();
        instance.setNCC(NCC);
       String expected = "ncc0";
         assertEquals(expected, instance.getNCC());
    }

    /**
     * Test of getGia method, of class NongSan.
     */
    @Test
    public void testGetGia() {
   
        NongSan instance = new NongSan();
        float expResult = 0.0F;
        float result = instance.getGia();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setGia method, of class NongSan.
     */
    @Test
    public void testSetGia() {
        System.out.println("setGia");
        float Gia = 0.0F;
        NongSan instance = new NongSan();
        instance.setGia(Gia);
     
    }
  
 
    /**
     * Test of getMaNV method, of class NongSan.
     */
    @Test
    public void testGetMaNV() {
        NongSan instance = new NongSan();
        String expResult = null;
        String result = instance.getMaNV();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMaNV method, of class NongSan.
     */
    @Test
    public void testSetMaNV() {
        String maNV = "nv01";
        NongSan instance = new NongSan();
        instance.setMaNV(maNV);
        String expected="nv01";
        assertEquals(expected, instance.getMaNV());
    }
    
}

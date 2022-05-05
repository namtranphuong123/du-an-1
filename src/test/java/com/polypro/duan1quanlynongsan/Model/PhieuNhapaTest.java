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
public class PhieuNhapaTest {
    
    public PhieuNhapaTest() {
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
     * Test of getMaDN method, of class PhieuNhapa.
     */
    @Test
    public void testGetMaDN() {
        PhieuNhapa instance = new PhieuNhapa();
        String expResult = null;
        String result = instance.getMaDN();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMaDN method, of class PhieuNhapa.
     */
    @Test
    public void testSetMaDN() {
        String maDN = "DN01";
        PhieuNhapa instance = new PhieuNhapa();
        instance.setMaDN(maDN);
        
        String expected="DN01";
        assertEquals(expected, instance.getMaDN());
        
    }

    /**
     * Test of getNgayN method, of class PhieuNhapa.
     */
    @Test
    public void testGetNgayN() {
        PhieuNhapa instance = new PhieuNhapa();
        Date expResult = null;
        Date result = instance.getNgayN();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNgayN method, of class PhieuNhapa.
     */
    @Test
    public void testSetNgayN() {
        System.out.println("setNgayN");
        Date ngayN = null;
        PhieuNhapa instance = new PhieuNhapa();
        instance.setNgayN(ngayN);
        String expected=null;
        assertEquals(expected, instance.getNgayN());
    }

    /**
     * Test of getMaNV method, of class PhieuNhapa.
     */
    @Test
    public void testGetMaNV() {
        PhieuNhapa instance = new PhieuNhapa();
        String expResult = null;
        String result = instance.getMaNV();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMaNV method, of class PhieuNhapa.
     */
    @Test
    public void testSetMaNV() {
        String maNV = "NV1";
        PhieuNhapa instance = new PhieuNhapa();
        instance.setMaNV(maNV);
        
        String expected="NV1";
        assertEquals(expected, instance.getMaNV());
    }

    /**
     * Test of getMaNS method, of class PhieuNhapa.
     */
    @Test
    public void testGetMaNS() {
        PhieuNhapa instance = new PhieuNhapa();
        String expResult = null;
        String result = instance.getMaNS();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMaNS method, of class PhieuNhapa.
     */
    @Test
    public void testSetMaNS() {
        String maNS = "NS01";
        PhieuNhapa instance = new PhieuNhapa();
        instance.setMaNS(maNS);
        
        String expected="NS01";
        assertEquals(expected, instance.getMaNS());
    }

    /**
     * Test of getSoLuong method, of class PhieuNhapa.
     */
    @Test
    public void testGetSoLuong() {
        PhieuNhapa instance = new PhieuNhapa();
        int expResult = 0;
        int result = instance.getSoLuong();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSoLuong method, of class PhieuNhapa.
     */
    @Test
    public void testSetSoLuong() {
        int SoLuong = 0;
        PhieuNhapa instance = new PhieuNhapa();
        instance.setSoLuong(SoLuong);
        
        int expected=0;
        assertEquals(expected, instance.getSoLuong());
    }
    
 
}

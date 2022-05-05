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

/**
 *
 * @author Admin
 */
public class NhaCCTest {
    
    public NhaCCTest() {
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
     * Test of getMaNCC method, of class NhaCC.
     */
    @Test
    public void testGetMaNCC() {
        NhaCC instance = new NhaCC();
        String expResult = null;
        String result = instance.getMaNCC();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setMaNCC method, of class NhaCC.
     */
    @Test
    public void testSetMaNCC() {
        String maNCC = "AH0001";
        NhaCC instance = new NhaCC();
        instance.setMaNCC(maNCC);
          String expected="AH0001";
        assertEquals(expected, instance.getMaNCC());
    }

    /**
     * Test of getTenNCC method, of class NhaCC.
     */
    @Test
    public void testGetTenNCC() {

        NhaCC instance = new NhaCC();
        String expResult = null;
        String result = instance.getTenNCC();
        assertEquals(expResult, result);
   
    }

    /**
     * Test of setTenNCC method, of class NhaCC.
     */
    @Test
    public void testSetTenNCC() {
        
        String TenNCC = "NCC";
        NhaCC instance = new NhaCC();
        instance.setTenNCC(TenNCC);
        String expected="NCC";
        assertEquals(expected, instance.getTenNCC());
    }

    /**
     * Test of getEmail method, of class NhaCC.
     */
    @Test
    public void testGetEmail() {
   
        NhaCC instance = new NhaCC();
        String expResult = null;
        String result = instance.getEmail();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setEmail method, of class NhaCC.
     */
    @Test
    public void testSetEmail() {
        String Email = "nantran481@gmail.com";
        NhaCC instance = new NhaCC();
        instance.setEmail(Email);
         String expected="nantran481@gmail.com";
        assertEquals(expected, instance.getEmail());
    }

    /**
     * Test of getSDT method, of class NhaCC.
     */
    @Test
    public void testGetSDT() {
        NhaCC instance = new NhaCC();
        String expResult = null;
        String result = instance.getSDT();
        assertEquals(expResult, result);
    
    }

    /**
     * Test of setSDT method, of class NhaCC.
     */
    @Test
    public void testSetSDT() {
        System.out.println("setSDT");
        String SDT = "0362377557";
        NhaCC instance = new NhaCC();
        instance.setSDT(SDT);
         String expected="0362377557";
        assertEquals(expected, instance.getSDT());
    }

    /**
     * Test of getDiaChi method, of class NhaCC.
     */
    @Test
    public void testGetDiaChi() {
        NhaCC instance = new NhaCC();
        String expResult = null;
        String result = instance.getDiaChi();
        assertEquals(expResult, result);
   
    }

    /**
     * Test of setDiaChi method, of class NhaCC.
     */
    @Test
    public void testSetDiaChi() {
        System.out.println("setDiaChi");
        String DiaChi = "44-ho quy ly";
        NhaCC instance = new NhaCC();
        instance.setDiaChi(DiaChi);
         String expected="44-ho quy ly";
        assertEquals(expected, instance.getDiaChi());
    }
    
}

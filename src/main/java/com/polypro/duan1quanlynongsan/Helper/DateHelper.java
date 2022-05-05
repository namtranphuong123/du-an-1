/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.polypro.duan1quanlynongsan.Helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



/**
 *
 * @author DELL-PC
 */


    public class DateHelper {
public static java.util.Date toDate(String date){
     SimpleDateFormat dateformat=new SimpleDateFormat("dd/MM/yyyy");
     try {
        
         java.util.Date date1 = dateformat.parse(date);
         return date1;
     } catch (Exception e) {
         e.printStackTrace();
     }
     return null;
 }
 public static String toDateString(Date date){
     SimpleDateFormat dateformat=new SimpleDateFormat("dd/MM/yyyy");
     String dateformatString=dateformat.format(date);
     return dateformatString;
 }
 public static String toDateStringNam(Date date){
     SimpleDateFormat dateformat=new SimpleDateFormat("yyyy");
     String dateformatString=dateformat.format(date);
     return dateformatString;
 }
 public static Date nowDate(){
     SimpleDateFormat dateformat=new SimpleDateFormat("dd/MM/yyyy");
     Date now=new Date();
     return now;
 }
    }


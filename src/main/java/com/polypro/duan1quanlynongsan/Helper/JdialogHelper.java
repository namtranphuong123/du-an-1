/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.polypro.duan1quanlynongsan.Helper;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author VietTech-PC
 */
public class JdialogHelper {
public static void showmessager(Component parent,String content,String title){
    JOptionPane.showMessageDialog(parent, content, title, JOptionPane.INFORMATION_MESSAGE);
}
public static void errordialog(Component parent,String content,String title){
    JOptionPane.showMessageDialog(parent,content, title, JOptionPane.ERROR_MESSAGE);
}
public static int comformdialog(Component parent,String content,String title){
    int choose=JOptionPane.showConfirmDialog(parent, content,title,JOptionPane.YES_NO_CANCEL_OPTION);
    return choose;
}
}

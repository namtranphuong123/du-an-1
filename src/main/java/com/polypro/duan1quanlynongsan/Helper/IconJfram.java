/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.polypro.duan1quanlynongsan.Helper;

import java.awt.Image;
import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;

/**
 *
 * @author Admin
 */
public class IconJfram {
      
    public static boolean save(File scr){
        File dst=new File("logos",scr.getName());
        if(!dst.getParentFile().exists()){
            dst.getParentFile().mkdirs();
        }
        try {
            Path from=Paths.get(scr.getAbsolutePath());
            Path to=Paths.get(dst.getAbsolutePath());
            Files.copy(from,to ,StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (Exception e) {
        }
        return false;
    };
    public static ImageIcon read(String FileName){
        File path=new File("logos",FileName);
        return new ImageIcon(path.getAbsolutePath());
    }
        public static Image resize(Image hinhanhgoc,int width,int height){
        Image resultingImage=hinhanhgoc.getScaledInstance(width,height,Image.SCALE_SMOOTH);
        return resultingImage;
    }
}

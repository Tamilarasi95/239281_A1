/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uum.__a1;

import java.io.File;

/**
 *
 * @author TAMILARASI
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        File f;
        f = new File("C:\\Users\\TAMILARASI\\Desktop\\MOBILE PROGRAMMING");
                int count = 0;
                for (File file : f.listFiles()) {
                        if (file.isFile()) {
                                count++;
                              
                        }
                }
                System.out.println("Number of files: " + count);
           
    }

    Testing(String Path) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    }

    
    

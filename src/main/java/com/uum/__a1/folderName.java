/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uum.__a1;

import java.io.File;
import java.util.LinkedList;
import static testing.Count.folder;

/**
 *
 * @author TAMILARASI
 */
public class folderName {
    
    private static folder;
     private final LinkedList<String> folderName = new LinkedList();
     
     public folderName (final files ){
        folderName.folder = folder;
    }
      public static void folderName(files) {
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
            listFilesForFolder(fileEntry);
        } else {
            System.out.println(fileEntry.getName());
        }
        }
        

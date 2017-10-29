/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author TAMILARASI
 */
public class testIssueReader {
     private final String Directory;
    private final String countIssue;
    String key = "public static void main(String args[])";
    
    public IssueReader( directory,folderName, String directory) throws IOException{
         File[] Files = folderName.Files();
        String filePath = null;
        final String filePath1 = filePath;
        for (File File : Files) {
            filePath1 = directory + "\\" +folderName.get(a);
        }
      try (BufferedReader objreader = new BufferedReader(new FileReader(filePath1))) {
                    String strCurrentLine;
                    while ((strCurrentLine = objreader.readLine()) != null) {
                         if (strCurrentLine.contains(key)){
                             int issueCount = 0;
                            issueCount++;
                        }  
                    }
        
    
      } catch (IOException e) {

  
   

   
   
   }
  
  }
}

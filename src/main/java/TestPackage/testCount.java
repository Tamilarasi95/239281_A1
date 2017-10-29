/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestPackage;

/**
 *
 * @author TAMILARASI
 */
public class testCount {
    static Testing folder;
    static IssueReader IssueReader = new IssueReader("");
    static final String Path= ("C:\\Users\\TAMILARASI\\Desktop\\MOBILE PROGRAMMING");

    public static void main(String[] args) {

        folder = new Testing(Path);
        int numberOfFile = folder.numberFile();
        int numberOfIssue;
        numberOfIssue = folder.getIssue();
        
        System.out.println("Number of Java Files = " + numberOfFile);
        System.out.println("Number of Issue = " + numberOfIssue);
    }
}
    


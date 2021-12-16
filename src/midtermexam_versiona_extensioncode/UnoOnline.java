/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author amna-
 */
public class UnoOnline {
    private User users [] = new User [50];
    
    public static void main(String[] args) {
        UnoOnline newPortal = new UnoOnline();
        newPortal.run();
    }
    
    private void run() {
        int userCount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your user name: ");
        String username = sc.nextLine();
        boolean validPassword = false;
        String password="";
        while(!validPassword) {
            System.out.println("Password has to be atleast 8 characters");
            System.out.println("Passwords has to be atleast one special character");
            System.out.println("Enter your password");
            
            password = sc.nextLine();
            int specialCharCount=0;
            for(int i = 0;i<password.length(); i++) {
                if(!(Character.isLetterOrDigit(password.charAt(i)))) {
                    specialCharCount++;
                }
            }
            if(specialCharCount>0 && password.length() > 7) {
                validPassword = true;
            }
        }
        User newUser = new User(username, password);
        users[userCount] = newUser;
        userCount++;
        System.out.println("New User Added");
        System.out.println("Username: " + username);
        System.out.println("Password: ");
    }
}
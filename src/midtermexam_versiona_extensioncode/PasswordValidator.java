/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author amna-
 */
public class PasswordValidator extends UnoOnline {
    boolean validPassword = false;
    public boolean validate(String pass) {
        
        int specialCharCount = 0;
        for(int i=0;i< pass.length(); i++) {
            if(!(Character.isLetterOrDigit(pass.charAt(i)))) {
            specialCharCount++;
        }
}
    if (specialCharCount>0 && pass.length() >7) {
        validPassword = true;
    }
    return validPassword;
    }
}

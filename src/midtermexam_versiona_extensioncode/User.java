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
public class User {
    private String name;
    private String password;
  
public User(String givenName, String givenPass) {
    name = givenName;
    password = givenPass;
}
public String getName() {
    return name;
}
public void setName(String givenName) {
    name = givenName;
}
public String getPassword() {
    return password;
}
public void setPassword(String givenPass) {
    password = givenPass;
}
}
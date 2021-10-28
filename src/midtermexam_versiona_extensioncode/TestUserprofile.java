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
    class TestUserprofile {
         public static void main(String args[]) { 
             System.out.println("Enter your name and your favourite Genre");
         }
         private String name;
         private String genre;
         private String[] genres = {"Historical", "Horror", "Fantasy", "Thriller", "Crime"};
         
         public TestUserprofile(String givenID, String givenGenre) {
             name = givenID;
             genre = givenGenre;
         }
         public String getName() {
             this.name = name;
             return null;
         }
         public void setName(String name) {
             this.name = name;
         }
         public String getGenre() {
             return genre;
         }
         public void setGenre(String genre) {
             this.genre = genre;
         }
}


         
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */
public class Logins {
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String cellPhoneNumber;
    private String role;
    
    //constructor
    public Logins(String firstname,String lastname,String username,String password,String cellphonenumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.cellPhoneNumber = cellPhoneNumber;
        this.role = role;
        
    }    
        //Getter method
        public String getUserName(){
            return username;
            
    }       //Setter method
        public void setUserName(String username){
            this.username = username;
        }
            //Instant method(nonstatic)
        public boolean checkUsername(){
            return username != null && username.contains("_")&& username.length()<=5;
        }
            
            //Void method (no return)
        public void displayFullName(){
            System.out.println(firstName + "" +lastName);
        }
            
        public static boolean isPasswordComplex(String password){
            return password.length() >= 8 &&
                    password.matches(".*[A-Z].*") && // At least one uppercase letter
                    password.matches(".*[a-z].*") && // At least one lowercase letter
                    password.matches(".*[0-9].*") && // At least one digit
                    password.matches(".*[!@#$%^&*()].*"); // At least one special character
        }
            public void displayRole(){
                System.out.println("User role:" + role);
                    
               
        
        }
    }
    


    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.personalinfo;

/**
 *
 * @author RC_Student_lab
 */
public class Registration {

    public static void main(String[] args) {

// create object mylogins
Login mylogins = new Login("Mihle", "Jantjies", "mihlejantjies", "Ch&&sec@ke99!", "+27838968976") ;

//call instant method
if(mylogins.checkUsernameFormat()) {
	System.out.println("Welcome," + mylogins.firstName + "" + mylogins.lastName + ", it is great to see you again");
}else{
	System.out.println("Username incorrect, please try again.");
}

if(mylogins.checkPasswordComplexity()){
	System.out.prinln("Welcome," + mylogins.firstName + "" + mylogins.lastName + ", it is great to see you again");
}else{
	System.out.println("password incorrect, please try again.");

if(mylogins.checkCellphoneNumber()){
	System.out.println("Cellphone number successfully added.");
}else{
	System.out.println("Cellphone number incorrectly formatted or does not contain international code.");
  
    }
}
if(mylogins.registerUser()) {
        System.out.println("The user is successfully registered");
} else if(!mylogins.checkPasswordComplexity){
        System.out.println("The password does not meet the complexity requirements.");
} else if (!mylogins.checkUserName){
        System.out.println(" the username is incorrectly formatted.");
    }
}


    public boolean LoginUser(String enteredUsername,String enteredPassword){
	return this.username.equals(enteredUsername) && this.password.equals(enteredPassword);
	 }
}

        if(mylogins.returnLoginStatus()){
        System.out.println("a successful login");
        }else{
        System.out.println(" a failed login" );
    }
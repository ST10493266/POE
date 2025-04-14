/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class LoginTest {
    private static Login log;
    
    
    public static void setUp(){
        log = new Login("","","Kyl-1","Ch&&sec@ke99!","+27838968976");
    }
    
    @Test
    public void testGetUsername(){
        log.setUsername("Kyl-1");
        assertEquals("Kyl-1",log.getUsername());
    }
    
    @Test
    public boolean isValidUsername(String username){
        assertTrue(log.isValidUsername("Kyl-1"));
        assertFalse(log.isValidUsername("Kyle!!!!!!!"));
    }
    
    @Test
    public void testGetPassword(){
        log.setPassword("Ch&&sec@ke99!");
        assertEquals("Ch&&sec@ke99!",log.getPassword());
    }
    
    @Test
    public boolean isValidPassword(String Password){
        assertTrue(log.isValidPassword("Ch&&sec@ke99!"));
        assertFalse(log.isValidPassword("password"));
    }
    
    @Test
    public void testGetCellPhoneNumber(){
        log.setCellPhoneNumber("+2783896876");
        assertEquals("+2783896876",log.getCellPhoneNumber);
    }
    
    @Test
    public boolean testCellPhoneNumber(String cellPhoneNumber){
        assertTrue(log.isValidCellPhoneNumber("+2783896876"));
        assertFalse(log.isValidCellPhoneNumber("08966553"));
    }
    
    @Test
    public void testUsername(){
        
    }
    
    public LoginsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    @Test
    public void testGetUserName() {
        System.out.println("getUserName");
        Logins instance = null;
        String expResult = "";
        String result = instance.getUserName();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetUserName() {
        System.out.println("setUserName");
        String username = "";
        Logins instance = null;
        instance.setUserName(username);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCheckUsername() {
        System.out.println("checkUsername");
        Logins instance = null;
        boolean expResult = false;
        boolean result = instance.checkUsername();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDisplayFullName() {
        System.out.println("displayFullName");
        Logins instance = null;
        instance.displayFullName();
        fail("The test case is a prototype.");
    }

    @Test
    public void testIsPasswordComplex() {
        System.out.println("isPasswordComplex");
        String password = "";
        boolean expResult = false;
        boolean result = Logins.isPasswordComplex(password);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDisplayRole() {
        System.out.println("displayRole");
        Logins instance = null;
        instance.displayRole();
        fail("The test case is a prototype.");
    }
    
}

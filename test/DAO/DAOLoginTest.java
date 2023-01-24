/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import net.sf.ehcache.search.expression.EqualTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.core.IsEqual.equalTo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pojo.TblUser;

/**
 *
 * @author USER
 */
public class DAOLoginTest {
    
    public DAOLoginTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("***** Start Testing *****");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("***** End Testing *****");
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getBy method, of class DAOLogin.
     */
    @Test
    public void testGetBy() {
        System.out.println("getBy");
        String uName = "nawa";
        String uPass = "123";
        int empty = 0;
        DAOLogin instance = new DAOLogin();
        List<TblUser> result = instance.getBy(uName, uPass);
        System.out.println(result.toArray().length);
        assertThat(result.toArray().length, is(not(nullValue())));
         
    }

    /**
     * Test of add_user method, of class DAOLogin.
     */
    @Test
    public void testAdd_user() {
        System.out.println("add_user");
        TblUser user = null;
        DAOLogin instance = new DAOLogin();
        instance.add_user(user);
     
    }
    
}

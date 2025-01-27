/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import controller.Customer;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author USER
 */
public class CustomerTest {
    
    Customer c;
   @Before
   public void setUp()throws Exception{
       c = new Customer();
   }
  @Test
  public void testgetSeatBooked(){
      assertEquals(null,c.getSeatBooked());
  }
  @Test
  public void testsetSeatBooked(){
      c.setSeatBooked("Booked"); 
      assertEquals("Booked",c.getSeatBooked());
  }
  @Test
  public void testgetFlightBooked(){
      assertEquals(null,c.getFlightBooked());
      
  }
  @Test
  public void testsetFlightBooked(){
      c.setFlightBooked(null);
      assertEquals(null,c.getFlightBooked());
      
  }
  @Test
  public void testgetSsn(){
      assertEquals(null,c.getSsn());
      
  }
  @Test
  public void testsetSsn(){
      c.setSsn("N01");
      assertEquals("N01",c.getSsn());
     
   }
  @Test
  public void testgetAge(){
      assertEquals(0,c.getAge());
      
  }
  @Test
  public void testsetAge(){
      c.setAge(15);
      assertEquals(15,c.getAge());
  }
  @Test
  public void testgetFirstName(){
      assertEquals(null,c.getFirstName());
  }
  @Test
  public void testsetFirstName(){
      c.setFirstName("Nayem");
      assertEquals("Nayem",c.getFirstName());
  }
  
  @Test
  public void testgetLastName(){
      assertEquals(null,c.getLastName());
  }
  @Test
  public void testsetLastName(){
      c.setLastName("-Ul-Islam");
      assertEquals("-Ul-Islam",c.getLastName());
  }
  @Test
  public void testgetPhNum(){
      assertEquals(null,c.getPhNum());
      
  }
  @Test
  public void setPhNum(){
      c.setPhNum("01934837774");
      assertEquals("01934837774",c.getPhNum());
  }
  
}

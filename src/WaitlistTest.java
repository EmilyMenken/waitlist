import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WaitlistTest {
  
  
  @Test
    public void testRemoveSelectStudents() {
      // Arrange
          String[] students = {"andy", "bob", "catherine", "dean", "emily"};
          Waitlist waitlist = new Waitlist(students, 5);
          Set<String> toRemove = new HashSet<>();
          toRemove.add("bob");
          toRemove.add("dean");
        
      // Act
          waitlist.removeStudents(toRemove);
        
      // Assert
          String[] expected = {"andy", "catherine", "emily", null, null};
          assertArrayEquals(expected, waitlist.getWaitlist());
          
  } //end removeSelectStudents


  @Test
    public void testNoStudentsRemoved() {
      // Arrange
          String[] students = {"andy", "bob", "catherine", "dean", "emily"};
          Waitlist waitlist = new Waitlist(students, 5);
          Set<String> toRemove = new HashSet<>();
        
      // Act
          waitlist.removeStudents(toRemove);
        
      // Assert
          String[] expected = {"andy", "bob", "catherine", "dean", "emily"};
          assertArrayEquals(expected, waitlist.getWaitlist());

  } //end noStudentsRemoved


  @Test
    public void testRemoveAllStudents() {
      // Arrange
          String[] students = {"andy", "bob", "catherine", "dean", "emily"};
          Waitlist waitlist = new Waitlist(students, 5);
          Set<String> toRemove = new HashSet<>();
          toRemove.add("andy");
          toRemove.add("bob");
          toRemove.add("catherine");
          toRemove.add("dean");
          toRemove.add("emily");
      
      // Act
          waitlist.removeStudents(toRemove);
      
      // Assert
          String[] expected = {null, null, null, null, null};
          assertArrayEquals(expected, waitlist.getWaitlist());

  }//end removeAllStudents


}//end waitlist tests
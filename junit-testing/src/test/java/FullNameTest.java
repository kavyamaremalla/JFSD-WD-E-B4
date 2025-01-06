import org.junit.demo.FullName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FullNameTest {

    @Test
    public void testGetFullName(){
        FullName fullName = new FullName();
        String result = fullName.getFullName("Peter", "Parker"); //actual code
        assertEquals("PeterParker", result);
    }

    @Test
    public void testGetFullNameWithEmptyStrings(){
        FullName FullName = new FullName();
        String actualResult = FullName.getFullName("", "");//actual result from your method
        //expecting ""
        assertEquals("", actualResult);
    }

    @Test
        public void testGetFullNameWithFirstNameEmpty() {
            FullName FullName = new FullName();
            String result = FullName.getFullName("", "Doe");
            assertEquals("Doe", result);
    }

    @Test
    public void testGetFullNameWithLastNameEmpty() {
        FullName FullName = new FullName();
        String result = FullName.getFullName("John", "");
        assertEquals("John", result);
    }

    @Test
    public void testGetFullNameWithNullFirstName() {
        FullName FullName = new FullName();
        String result = FullName.getFullName(null, "Doe");
        assertEquals("Doe", result);
    }

    @Test
    public void testGetFullNameWithNullLastName() {
        FullName FullName = new FullName();
        String result = FullName.getFullName("John", null);
        assertEquals("John", result);
    }

    @Test
    public void testGetFullNameWithBothNull() {
        FullName FullName = new FullName();
        String result = FullName.getFullName(null, null);
        assertEquals("", result);
    }
}

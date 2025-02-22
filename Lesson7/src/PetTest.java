import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetTest {

    static Pet test1;
    static Pet test1_copy;
    static Pet test1_copy_copy;
    static Pet test2;

    @BeforeAll
    static void setUp() {
        test1=new Pet(Species.CAT,"mesi",10,131,new String[]{"gemirmek","purr","quyruqsallamaq"});
        test1_copy=new Pet(Species.CAT,"mesi",10,131,new String[]{"gemirmek","purr","quyruqsallamaq"});
        test1_copy_copy=new Pet(Species.CAT,"mesi",10,131,new String[]{"gemirmek","purr","quyruqsallamaq"});
        test2=new Pet(Species.DOG,"alabas",7,69,new String[]{"gemirmek","bark","quyruqsallamaq"});
    }
    @Test
    void testToString() {
        String expected="DOG{nickname='alabas', age=7, trickLevel=69, habits=[gemirmek, bark, quyruqsallamaq], characteristics=can't fly, has 4 legs, has fur}";
        assertEquals(expected,test2.toString());
    }
    @Test
    void equalsShouldBeReflexive() {
        Pet test=new Pet(Species.CAT,"mesi",10,131,new String[]{"gemirmek","purr","quyruqsallamaq"});
        assertEquals(test,test);
    }
    @Test
    void equalsShouldBeSymmetric() {
        assertTrue(test1.equals(test1_copy) && test1_copy.equals(test1));
        assertFalse(test1.equals(test2) || test2.equals(test1));
    }
    @Test
    void equalsShouldBeTransitive() {
        assertTrue(test1.equals(test1_copy) && test1_copy.equals(test1_copy_copy) && test1.equals(test1_copy_copy));
    }
    @Test
    void equalsShouldBeConsistent() {
        assertEquals(test1,test1_copy);
        assertEquals(test1,test1_copy);
        assertEquals(test1,test1_copy);
        assertEquals(test1,test1_copy);
        assertNotEquals(test1,test2);
        assertNotEquals(test1,test2);
        assertNotEquals(test1,test2);
        assertNotEquals(test1,test2);
    }
    @Test
    void hashCodesShouldBeEqualWhenObjectsAreEqual() {
        assertEquals(test1.hashCode(),test1_copy.hashCode());
    }
    @Test
    void hashCodesMayOnlyChangeIfTheObjectChanges() {
        int hashCode1=test1.hashCode();
        int hashCode2=test1.hashCode();
        int hashCode3=test1.hashCode();
        assertEquals(hashCode1,hashCode2);
        assertEquals(hashCode1,hashCode3);
        test1.setAge(test1.getAge()+1);
        assertNotEquals(hashCode1,test1.hashCode());
    }
}
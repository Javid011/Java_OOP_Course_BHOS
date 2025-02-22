import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {
    static Human test1;
    static Human Test1_copy;
    static Human Test1_copy_copy;
    static Human test2;
    static String[][] testSchedule1;

    @BeforeAll
    static void setUp() {
        testSchedule1=new String[][]{{DayOfWeek.SUNDAY.name(),"Sleeping"},{DayOfWeek.TUESDAY.name(),"Sleeping_again"},{DayOfWeek.FRIDAY.name(),"Guess_what"}};
        test1=new Human("Insandi","Insansoyadidi",1531,10,testSchedule1);
        Test1_copy=new Human("Insandi","Insansoyadidi",1531,10,testSchedule1);
        Test1_copy_copy=new Human("Insandi","Insansoyadidi",1531);
        Test1_copy_copy.setIq(10);
        test2=new Human("YeneInsandi","Insansoyadidiyene",1531,10,testSchedule1);
    }
    @Test
    void testToString() {
        String shouldbe="Human{name='Insandi', surname='Insansoyadidi', year=1531, iq=10, schedule=[[SUNDAY, Sleeping], [TUESDAY, Sleeping_again], [FRIDAY, Guess_what]]}";
        assertEquals(shouldbe,test1.toString());
    }
    @Test
    void equalsShouldBeReflexive() {
        assertEquals(test1,test1);
    }
    @Test
    void equalsShouldBeSymmetric() {
        assertTrue(test1.equals(Test1_copy) && Test1_copy.equals(test1));
        assertFalse(test1.equals(test2) || test2.equals(test1));
    }
    @Test
    void equalsShouldBeTransitive() {
        assertTrue(test1.equals(Test1_copy) && Test1_copy.equals(Test1_copy_copy) && test1.equals(Test1_copy_copy));
    }
    @Test
    void equalsShouldBeConsistent() {
        assertEquals(test1,Test1_copy);
        assertEquals(test1,Test1_copy);
        assertEquals(test1,Test1_copy);
        assertEquals(test1,Test1_copy);
        assertNotEquals(test1,test2);
        assertNotEquals(test1,test2);
        assertNotEquals(test1,test2);
        assertNotEquals(test1,test2);
    }
    @Test
    void hashCodesShouldBeEqualWhenObjectsAreEqual() {
        assertEquals(test1.hashCode(),Test1_copy.hashCode());

    }
    @Test
    void hashCodesMayOnlyChangeIfTheObjectChanges() {
        int hashCode1=test1.hashCode();
        int hashCode2=test1.hashCode();
        int hashCode3=test1.hashCode();
        assertEquals(hashCode1,hashCode2);
        assertEquals(hashCode2,hashCode3);
        test1.setYear(test1.getYear()-5);
        int hashCode4=test1.hashCode();
        assertNotEquals(hashCode1,hashCode4);
    }
}
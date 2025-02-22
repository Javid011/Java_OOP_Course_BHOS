import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;

import static javax.swing.text.StyleConstants.Family;
import static org.junit.jupiter.api.Assertions.*;

class FamilyTest {

    static Human mother;
    static Human father;
    static Family family;
    static String[][] schedule1;
    static Human child1;
    static Human child2;
    static Human child3;

    @BeforeEach
    void setUp()
    {
        mother=new Human("Mother","Li",1700);
        father=new Human("Father","Li",1660);
        family=new Family(mother,father);
        schedule1=new String[][]{{DayOfWeek.MONDAY.name(),"1cigun"},{DayOfWeek.TUESDAY.name(),"2cigun"},{DayOfWeek.FRIDAY.name(),"5cigun"},{DayOfWeek.SUNDAY.name(),"bazargunu"}};
        child1=new Human("Child1","Li1",1709,200,schedule1);
        child2=new Human("Child2","Li2",1710);
        child3=new Human("Child3","Li3",1720);
    }

    @Test
    void testAddChild() {
        int originalChildrenCount=family.getChildren().length;
        family.addChild(child1);
        assertEquals(originalChildrenCount+1,family.getChildren().length);
        assertEquals(child1.getFamily(),family);
        assertEquals(family.getChildren()[family.countFamily()-3],child1);
    }

    @Test
    void testDeleteChildHuman() {
        family.addChild(child1);
        family.addChild(child2);
        family.addChild(child3);
        int originalChildrenCount=family.getChildren().length;
        family.deleteChild(child1);
        assertEquals(originalChildrenCount-1,family.getChildren().length);
        assertEquals(family.getChildren()[0],child2);
        assertEquals(family.getChildren()[1],child3);
        assertNull(child1.getFamily());
        family.addChild(child1);
        family.deleteChild(child3);
        assertEquals(family.getChildren()[0],child2);
        assertEquals(family.getChildren()[1],child1);
        originalChildrenCount=family.getChildren().length;
        family.deleteChild(child3);
        assertEquals(originalChildrenCount,family.getChildren().length);


    }
    @Test
    void testDeleteChildIndex() {
        family.addChild(child1);
        family.addChild(child2);
        family.addChild(child3);
        int originalChildrenCount=family.getChildren().length;

        boolean result=family.deleteChild(1);
        assertEquals(originalChildrenCount-1,family.getChildren().length);
        assertEquals(family.getChildren()[0],child1);
        assertEquals(family.getChildren()[1],child3);
        assertNull(child2.getFamily());
        assertTrue(result);

        originalChildrenCount=family.getChildren().length;
        result= family.deleteChild(2);
        assertEquals(originalChildrenCount,family.getChildren().length);
        assertFalse(result);
    }

    @Test
    void testCountFamily() {
        assertEquals(2,family.countFamily());
        family.addChild(child1);
        assertEquals(3,family.countFamily());
        family.addChild(child2);
        assertEquals(4,family.countFamily());
    }

    @Test
    void testToString() {
        family.addChild(child1);
        family.addChild(child2);
        family.setPet(new Pet(Species.CAT,"Mesi",20,20,new String[]{"eat","drink","sleep","purr"}));
        String shouldbe="Family{\n" +
                "mother=Human{name='Mother', surname='Li', year=1700, iq=-1, schedule=[]}\n" +
                "father=Human{name='Father', surname='Li', year=1660, iq=-1, schedule=[]}\n" +
                "children=[Human{name='Child1', surname='Li1', " +
                "year=1709, iq=200, schedule=[[MONDAY, 1cigun], [TUESDAY, 2cigun], [FRIDAY, 5cigun], [SUNDAY, bazargunu]]}, " +
                "Human{name='Child2', surname='Li2', year=1710, iq=-1, schedule=[]}]\n" +
                "pet=CAT{nickname='Mesi', age=20, trickLevel=20, habits=[eat, drink, sleep, purr]}\n" + "}";
        assertEquals(shouldbe,family.toString());
    }
    @Test
    void equalsShouldBeReflexive() {
        assertEquals(family, family);
    }
    @Test void equalsShouldBeSymmetric() {
        Family family2=new Family(mother,father);
        assertTrue(family.equals(family2) && family2.equals(family));
        Family family3=new Family(new Human("Anothermother","AnotherLi",2050),new Human("Anotherfather","AnotherLi",2030));
        assertFalse(family.equals(family3) || family3.equals(family));
    }
    @Test void equalsShouldBeTransitive() {
        Family family2=new Family(mother,father);
        Family family3=new Family(mother,father);
        assertTrue(family.equals(family2) && family2.equals(family3) && family.equals(family3));
    }
    @Test
    void equalsShouldBeConsistent() {
        Family family2=new Family(mother,father);
        assertEquals(family, family2);
        assertEquals(family, family2);
        assertEquals(family, family2);
        assertEquals(family, family2);
        Family family3=new Family(new Human("Anothermother","AnotherLi",2050),new Human("Anotherfather","AnotherLi",2030));
        assertNotEquals(family, family3);
        assertNotEquals(family, family3);
        assertNotEquals(family, family3);
        assertNotEquals(family, family3);
    }

    @Test
    void hashCodesShouldBeEqualWhenObjectsAreEqual() {
        Family family2=new Family(mother,father);
        assertEquals(family.hashCode(), family2.hashCode());
    }
    @Test
    void hashCodeValueMayOnlyChangeIfTheObjectChanges() {
        int hashCode1=family.hashCode();
        int hashCode2=family.hashCode();
        int hashCode3=family.hashCode();
        assertEquals(hashCode1,hashCode2);
        assertEquals(hashCode2,hashCode3);
        family.setMother(new Human("Bezdim","Day",0));
        int hashCode4=family.hashCode();
        assertNotEquals(hashCode1,hashCode4);
    }
}
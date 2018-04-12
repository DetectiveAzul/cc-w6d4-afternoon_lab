import management.Director;
import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    private Director director;

    @Before
    public void before() {
        director = new Director("Jaime", "334488SS", 28000, "Dunder Mifflin", 100000);
    }

    @Test
    public void hasAName() {
        assertEquals("Jaime", director.getName());
    }

    @Test
    public void hasANiNumber() {
        assertEquals("334488SS", director.getNiNumber());
    }

    @Test
    public void hasASalary() {
        assertEquals(28000, director.getSalary(), 0);
    }

    @Test
    public void hasADeptName() {
        assertEquals("Dunder Mifflin", director.getDeptName());
    }

    @Test
    public void canIncreaseSalary() {
        director.raiseSalary(5000);
        assertEquals(33000, director.getSalary(),0);
    }

    @Test
    public void canPayBonus() {
        assertEquals(560, director.payBonus(),0);
    }

    @Test
    public void hasABudget() {
        assertEquals(100000, director.getBudget(),0);
    }

    @Test
    public void cannotDecreaseSalary() {
        director.raiseSalary(-28000);
        assertEquals(28000, director.getSalary(), 0);
    }

    @Test
    public void canChangeName() {
        director.setName("Antonio");
        assertEquals("Antonio", director.getName());
    }

    @Test
    public void notEmptyName() {
        director.setName("");
        assertEquals("Jaime", director.getName());
    }


}

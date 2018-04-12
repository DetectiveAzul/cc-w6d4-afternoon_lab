import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    private Manager manager;

    @Before
    public void before() {
        manager = new Manager("Jaime", "334488SS", 28000, "Dunder Mifflin");
    }

    @Test
    public void hasAName() {
        assertEquals("Jaime", manager.getName());
    }

    @Test
    public void hasANiNumber() {
        assertEquals("334488SS", manager.getNiNumber());
    }

    @Test
    public void hasASalary() {
        assertEquals(28000, manager.getSalary(), 0);
    }

    @Test
    public void hasADeptName() {
        assertEquals("Dunder Mifflin", manager.getDeptName());
    }

    @Test
    public void canIncreaseSalary() {
        manager.raiseSalary(5000);
        assertEquals(33000, manager.getSalary(),0);
    }

    @Test
    public void canPayBonus() {
        assertEquals(280, manager.payBonus(),0);
    }


}

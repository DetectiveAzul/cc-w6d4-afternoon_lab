import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class TechStaffTest {
    private DatabaseAdmin dbAdmin;
    private Developer developer;

    @Before
    public void before() {
        dbAdmin = new DatabaseAdmin("Jaime", "334488SS", 28000);
        developer = new Developer("Antonio", "334488SS", 28000);
    }

    @Test
    public void hasAName() {
        assertEquals("Jaime", dbAdmin.getName());
    }

    @Test
    public void hasANiNumber() {
        assertEquals("334488SS", developer.getNiNumber());
    }

    @Test
    public void hasASalary() {
        assertEquals(28000, developer.getSalary(), 0);
    }

    @Test
    public void canIncreaseSalary() {
        dbAdmin.raiseSalary(5000);
        assertEquals(33000, dbAdmin.getSalary(),0);
    }

    @Test
    public void canPayBonus() {
        assertEquals(280, developer.payBonus(),0);
    }


}

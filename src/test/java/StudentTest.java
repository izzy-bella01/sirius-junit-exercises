import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    Student testStu = new Student(2, "Able Brown");


    @Test
    public void testGetId() {
        assertEquals(2, testStu.getId());
    }

    @Test
    public void testGetName() {
        assertEquals("Able Brown", testStu.getName());
    }

    @Test
    public void testAddGrade() {
        testStu.addGrade(89);
        testStu.addGrade(78);
        assertTrue("grade not added",testStu.grades.contains(89));
        assertTrue("grade not added",testStu.grades.contains(78));
    }

    @Test
    public void testGetGradeAverage() {
        testStu.addGrade(89);
        testStu.addGrade(78);
        assertEquals(83.5, testStu.getGradeAverage(), 0);
    }
}

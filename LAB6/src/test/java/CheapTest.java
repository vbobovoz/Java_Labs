import org.example.Cheap;
import org.example.DDirector;
import org.example.Expensive;
import org.example.Medium;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheapTest {
    @Test
    public void test_1() {
        String exp = "Cheap";
        Cheap cheap = new Cheap();
        String act = cheap.create();
        assertEquals(exp, act);
    }

    @Test
    public void test_2() {
        String exp = "Medium";
        Cheap cheapDirector = new Cheap();
        DDirector mediumDirector = new Medium(cheapDirector);
        String act = mediumDirector.create();
        assertEquals(exp, act);
    }

    @Test
    public void test_3() {
        String exp = "Expensive";
        Cheap cheapDirector = new Cheap();
        DDirector expensiveDirector = new Expensive(cheapDirector);
        String act = expensiveDirector.create();
        assertEquals(exp, act);
    }

    @Test
    public void test_4() {
        String exp = "Expensive";
        Cheap cheapDirector = new Cheap();
        DDirector mediumDirector = new Medium(cheapDirector);
        DDirector expensiveDirector = new Expensive(mediumDirector);
        String act = expensiveDirector.create();
        assertEquals(exp, act);
    }

    @Test
    public void test_5() {
        String exp = "Medium";
        Cheap cheapDirector = new Cheap();
        DDirector expensiveDirector = new Expensive(cheapDirector);
        DDirector mediumDirector = new Medium(expensiveDirector);
        String act = mediumDirector.create();
        assertEquals(exp, act);
    }
}

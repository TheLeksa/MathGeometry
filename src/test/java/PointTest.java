import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import org.etsntesla.it.Point;

public class PointTest {
    static Point A, B;

    @BeforeAll
    static void init(){
        A = new Point(3, 4);
        B = new Point(3, 6);
    }
    @Test
    void test1(){
        System.out.println("Hello Test");
        Assertions.assertEquals(5, A.Radius(), "test neuspesan");
    }
    @Test
    void test2(){
        Assertions.fail("test je neuspesan");
    }

    @Test
    void test3(){
        Assertions.assertEquals(2, A.Distance(8), "netacno");
    }
}

package unittest;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by e068636 on 1/23/2018.
 */
public class UnitTest {

    @Test
    public void sumOk() {
        int a = 1;
        int b = 2;

        MathClass mathClass = new MathClass();
        int result = mathClass.sum(1, 2);

        assertNotNull( result );
        assertTrue( result == 3 );
    }

    @Test
    public void higherWithError() {
        int a = 1;
        int b = 2;

        MathClass mathClass = new MathClass();
        int result = mathClass.higher(1, 2);

        assertTrue( result == 2 );
    }
}

class MathClass {
    int sum(int a, int b) {
        return a + b;
    }

    int module(int a) {
        return a*-1;
    }

    int higher(int a, int b) {
        if (a>b) {
            return b;
        }
        return a;
    }
}

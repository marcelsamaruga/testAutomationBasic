package unittest;

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

    @Test
    public void subtract() {
        MathClass mathClass = new MathClass();

        //
        assertTrue( false );
    }

    @Test
    public void medium() {
        MathClass mathClass = new MathClass();
        double[] values = new double[] {6, 10, 4};

        //
        assertTrue( false );
    }
}

class MathClass {
    int sum(int a, int b) {
        return a + b;
    }

    int substract(int a, int b) {
        return a - b;
    }

    double medium(double[] values) {
        double result = 0;

        for (int i=0; i<values.length; i++) {
            result += values[i];
        }

        return result / values.length;
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

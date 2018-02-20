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
        int result = mathClass.sum(a, b);

        assertNotNull( result );
        assertTrue( result == 3 );
    }

    @Test
    public void higherWithError() {
        int a = 1;
        int b = 2;

        MathClass mathClass = new MathClass();
        int result = mathClass.higher(a, b);

        assertTrue( result == 2 );
    }

    @Test
    public void subtract() {
        int a = 2;
        int b = 1;
        
        MathClass mathClass = new MathClass();
        int result = mathClass.substract(a, b);

        //
        assertTrue( result == 1 );
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
            return a;
        }
        return b;
    }
}

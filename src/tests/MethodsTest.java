package tests;

import asserts.Methods;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by User on 04.02.2018.
 */
public class MethodsTest {
    @Test
    public void isSortedArray() throws Exception
    {
        Methods methodsCall = new Methods();
        org.junit.Assert.assertEquals(5, (methodsCall.minOfTwo(5,10)));
        org.junit.Assert.assertNotSame(10, (methodsCall.minOfTwo(5,10)));
    }
}

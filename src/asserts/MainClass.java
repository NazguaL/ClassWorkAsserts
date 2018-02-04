package asserts;

import junit.framework.Assert;

/**
 * Created by User on 04.02.2018.
 */
public class MainClass {
    public static void main(String[] args)
    {
        int [] arr = {1, 2, 3, 4};
        Methods methodsCall = new Methods();
        boolean r = methodsCall.isSortedArray(arr);
        System.out.println(r);
        //Assert.assertTrue(methodsCall.isSortedArray(arr));
        //methodsCall.minOfTwo(1,2);
        //org.junit.Assert.assertSame("Not min", 5, (methodsCall.minOfTwo(5,10)));
    }

}

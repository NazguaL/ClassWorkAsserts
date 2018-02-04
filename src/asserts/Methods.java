package asserts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.log4j.Logger;
import org.junit.Assert;


/**
 * Created by User on 04.02.2018.
 */
public class Methods {
    Logger log;

    public Methods () {
        log = Logger.getLogger(String.valueOf(getClass()));
    }

    /**
     *
     * @return
     * @throws IOException
     */
    public int inputNumber() throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input number please: ");
        String s1 = reader.readLine();
        int number = Integer.parseInt(s1);
        return number;
    }

    /**
     * Метод определяет отсортирован ли массив по возрастанию
     * @param a Принимает на вход массив целочисленных значений
     * @return возвращает булево значение, если отсортирован, то истина
     */
    public boolean isSortedArray (int[] a)
    {
        try
        {
            boolean result = true;
            for (int i = 0; i < a.length -1; i++) {
                if (a[i] > a[i + 1]) {
                    result = false;
                }
            }

            return result;
        }
        catch (Exception ex)
        {
            String stackTrace = org.apache.commons.lang.exception.ExceptionUtils.getStackTrace(ex);
            log.error("Exception " + stackTrace);
            return false;
        }
    }

    public int minOfTwo (int a, int b)
    {
    try
    {
        {
            int result;
            if (a > b)
            {
                result = b;
                log.trace("B is min. B: " + b);
            }
            else
            {
                result = a;
                log.trace("A is min. A: " + a);
            }
            return result;
        }
    }
    catch (Exception ex)
    {
        String stackTrace = org.apache.commons.lang.exception.ExceptionUtils.getStackTrace(ex);
        log.error("Exception of minOfTwoMethod" + stackTrace);
        return -1;
    }
    }


}

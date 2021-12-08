import blackbox.MyMath;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BlackBoxTest {

     @Test
    public void testPower(){
        Double adjustedMax = Double.MAX_VALUE/(2-Math.pow(2,-52));

         Assertions.assertThrows(IllegalArgumentException.class, ()->MyMath.power(-3, 2));
         Assertions.assertThrows(IllegalArgumentException.class, ()->MyMath.power(Integer.MAX_VALUE, 2));
         Assertions.assertEquals(Double.NEGATIVE_INFINITY, MyMath.power(-2, Integer.MAX_VALUE));
         Assertions.assertEquals(Double.POSITIVE_INFINITY,MyMath.power(2, 1024));
         Assertions.assertEquals(adjustedMax,MyMath.power(2, 1023));
         Assertions.assertEquals(Double.POSITIVE_INFINITY,MyMath.power(-0, Integer.MIN_VALUE));
    }
}

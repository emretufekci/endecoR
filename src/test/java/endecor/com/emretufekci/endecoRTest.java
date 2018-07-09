package endecor.com.emretufekci;

import org.junit.Assert;
import org.junit.Test;

public class endecoRTest {

    @Test
    public void testOrdinalIndexOf()  {


        String str="Deneme";
        String substr="e";

        int firstAlph = endecoR.ordinalIndexOf(str,substr,1);
        int secondAlph = endecoR.ordinalIndexOf(str,substr,2);
        int thirdAlph = endecoR.ordinalIndexOf(str,substr,3);
        Assert.assertEquals(1,firstAlph);
        Assert.assertEquals(3,secondAlph);
        Assert.assertEquals(5,thirdAlph);

    }

    @Test
    public void testStr2SecretKey() {

        String secretKeyStr = "encodeR-emretufekci.com!";
        Assert.assertEquals(24,secretKeyStr.length());

    }


}
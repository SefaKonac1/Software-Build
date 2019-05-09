import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;


public class yazilimprojectTest {


    @Test
    public void testToAverage() {





        ArrayList <Integer> ornek=new ArrayList<>();
        ornek.add(3);
        ornek.add(4);
        ornek.add(5);
        float expect=(3+4+5)/3;

        yazilimproject foo = new yazilimproject(ornek);
        float result=foo.calculateAverage();
        Assert.assertEquals((int)(expect), (int)(result));

    }
}
import org.junit.Test;
import static org.junit.Assert.*;

import org.avci.flower.services.FlowerService;

/*
 * This Java source file was auto generated by running 'gradle init --type java-library'
 * by 'OA10249' at '3/22/16 5:00 PM' with Gradle 2.11
 *
 * @author OA10249, @date 3/22/16 5:00 PM
 */
public class FlowerServiceTest {
    @Test public void testSomeLibraryMethod() {
        FlowerService classUnderTest = new FlowerService();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.getTitle("Ozgur")!=null);
    }
}
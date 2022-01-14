import com.company.Building;
import org.junit.Assert;
import org.junit.Test;



public class BuldingTestProjectTests {
    @Test
    public void _01_createNewBuildingShallBuildingShallNotBeNull() {
        Building building = new Building();
        Assert.assertTrue(building != null);
    }


}
import com.company.Building;
import org.junit.Assert;
import org.junit.Test;



public class BuildingTestProjectTests {
    @Test
    public void _01_createNewBuildingShallBuildingShallNotBeNullAndIdShallBe1() {
        Building building = new Building();
        Assert.assertTrue(building != null);
        Assert.assertTrue(Building.id == 1);
    }
}
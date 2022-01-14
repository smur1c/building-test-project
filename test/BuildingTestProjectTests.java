import com.company.Building;
import org.junit.Assert;
import org.junit.Test;



public class BuildingTestProjectTests {
    @Test
    public void _01_createNewBuildingShallBuildingShallNotBeNullAndIdShallBe1() {
        Building.count = 0;
        Building building = new Building("Felix");
        Assert.assertTrue(building != null);
        Assert.assertTrue(Building.count == 1);
    }

    @Test
    public void _02_CreateTwoBuildingsAndAddToEachOfThemOneResidentIdShallBe2(){
        Building.count = 0;
        Building house = new Building("Hans");
        Building skyscraper = new Building("Hubert");

        Assert.assertTrue(Building.count == 2);
        Assert.assertTrue(house.buildingID == 1);
        Assert.assertEquals(house.initialResident, "Hans");
    }

}
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

    @Test
    public void _03_CreateOneBuildingAddMultipleResident(){
        Building.count = 0;
        Building house = new Building("Hans");

        house.addResident("Hubert");
        Assert.assertEquals(house.residents[1], "Hubert");
    }

    @Test
    public void _04_CreateOneBuildingAddMultipleResidentsAndRemoveResidentShallBeRemoved(){
        Building.count = 0;
        Building house = new Building("Hans");

        house.addResident("Hubert");
        Assert.assertEquals(house.residents[1], "Hubert");

        house.removeResident("Hubert");

        Assert.assertEquals(house.residents.length, 1);
    }

    @Test
    public void _05_CreateOneBuildingAddMultipleResidentsAddAlreadyExistingResidentWhichShallNotBeAdded(){
        Building.count = 0;
        Building house = new Building("Hans");

        house.addResident("Hans");
        Assert.assertEquals(house.residents[0], "Hans");
        Assert.assertEquals(house.residents.length, 1);
    }
    @Test
    public void _06_RemoveNotExistingResidentShallNotBesRemoved(){
        Building.count = 0;
        Building house = new Building("Hans");

        house.addResident("Lukas");
        Assert.assertEquals(house.residents[1], "Lukas");

        house.removeResident("Hubert");

        Assert.assertEquals(house.residents.length, 2);
    }

}
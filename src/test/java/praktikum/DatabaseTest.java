package praktikum;

import org.junit.Assert;
import org.junit.Test;

public class DatabaseTest {

    @Test
    public void getAvailableBunsTest() {
        Database database = new Database();
        database.availableBuns();
        Assert.assertEquals("Количество булочек отличается",3, database.availableBuns().size());
    }

    @Test
    public void getAvailableIngredientsTest() {
        Database database = new Database();
        database.availableBuns();
        Assert.assertEquals("Количество ингредиентов отличается",6, database.availableIngredients().size());
    }




}
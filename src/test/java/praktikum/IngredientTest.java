package praktikum;

import org.junit.Assert;
import org.junit.Test;


public class IngredientTest {

    @Test
    public void getIngredientNameTest() {
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "Соус", 10);
        Assert.assertEquals("Имя не совпадает", "Соус", ingredient.getName());
    }

    @Test
    public void getIngredientPriceTest() {
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "Соус", 10);
        Assert.assertEquals("Цена не совпадает", 10, ingredient.getPrice(), 0);
    }

    @Test
    public void getIngredientTypeTest() {
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "Соус", 10);
        Assert.assertEquals("Тип не совпадает", "SAUCE", ingredient.getType().toString());

    }
}
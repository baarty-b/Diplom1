package praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class BurgerTest {

    @Mock
    Burger burger;

    @Mock
    Ingredient ingredient;

    @Test
    public void getPriceBurgerTest() {
        Bun bun = new Bun("Булочка", 35);
        Ingredient ingredientOne = new Ingredient(IngredientType.SAUCE, "Соус", 10);
        Ingredient ingredientTwo = new Ingredient(IngredientType.FILLING, "Мясо", 50);
        Ingredient ingredientThree = new Ingredient(IngredientType.FILLING, "Ананас", 15);

        Burger burger = new Burger();
        burger.setBuns(bun);
        burger.addIngredient(ingredientOne);
        burger.addIngredient(ingredientTwo);
        burger.addIngredient(ingredientThree);
        burger.moveIngredient(0, 1);
        burger.removeIngredient(0);

        Assert.assertEquals(95, burger.getPrice(), 0);
    }

    @Test
    public void verifyMoveIngredient() {
        ingredient = new Ingredient(IngredientType.SAUCE, "Соус", 10);
        burger.addIngredient(ingredient);
        burger.moveIngredient(0, 1);
        Mockito.verify(burger).moveIngredient(0, 1);
    }

    @Test
    public void verifyDeleteIngredient() {
        ingredient = new Ingredient(IngredientType.SAUCE, "Соус", 10);
        burger.addIngredient(ingredient);
        burger.removeIngredient(0);
        Mockito.verify(burger).removeIngredient(0);
    }


    @Test
    public void verifyAddIngredient() {
        ingredient = new Ingredient(IngredientType.SAUCE, "Соус", 10);
        burger.addIngredient(ingredient);
        Mockito.verify(burger).addIngredient(ingredient);
    }

    @Test
    public void verifyIngredientTimes() {
        burger.addIngredient(ingredient);
        burger.addIngredient(ingredient);
        burger.addIngredient(ingredient);
        Mockito.verify(burger, Mockito.times(3)).addIngredient(ingredient);
    }


    @Test
    public void getReceiptTest() {
        Bun bun = new Bun("Булочка", 35);

        Ingredient ingredientOne = new Ingredient(IngredientType.SAUCE, "Соус", 10);
        Ingredient ingredientTwo = new Ingredient(IngredientType.FILLING, "Мясо", 50);
        Ingredient ingredientThree = new Ingredient(IngredientType.FILLING, "Ананас", 15);

        Burger burger = new Burger();
        burger.setBuns(bun);
        burger.addIngredient(ingredientOne);
        burger.addIngredient(ingredientTwo);
        burger.addIngredient(ingredientThree);
        burger.moveIngredient(0, 1);
        burger.removeIngredient(0);

        Assert.assertNotNull(burger.getReceipt());
    }


}
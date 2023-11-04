package praktikum;

import org.junit.Assert;
import org.junit.Test;

public class BunTest {
    @Test
    public void getBunNameTest() {
        Bun bun = new Bun("Булочка", 35);
        Assert.assertEquals("Имя не совпадает","Булочка", bun.getName());
    }

    @Test
    public void getBunPriceTest() {
        Bun bun = new Bun("Булочка", 35);
        Assert.assertEquals("Цена не совпадает",35, bun.getPrice(),0);
    }
}
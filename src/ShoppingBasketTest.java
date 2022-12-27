import org.junit.Test;
import pg.TDD.Item;
import pg.TDD.PasswordValidator;
import pg.TDD.ShoppingBasket;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ShoppingBasketTest {
    @Test
    public void totalOfEmptyBasket(){
        ShoppingBasket basket=new ShoppingBasket(new ArrayList<>());
        assertEquals(0.0,basket.getTotal(),0.0);
    }

    @Test
    public void totalOfSingleItem(){
        ShoppingBasket basket=new ShoppingBasket(Arrays.asList(new Item(100.0,1)));
        assertEquals(100.0,basket.getTotal(),0.0);
    }

    @Test
    public void passwordValidator(){
       // PasswordValidator pv=new PasswordValidator();
        assertEquals(true,PasswordValidator.isValid("38Nv5"));
    }
}

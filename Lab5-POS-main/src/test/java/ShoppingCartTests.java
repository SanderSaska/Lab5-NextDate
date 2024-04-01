import ee.ut.math.tvt.salessystem.logic.ShoppingCart;
import org.junit.Test;
import static org.junit.Assert.*;
import ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO;
import ee.ut.math.tvt.salessystem.dao.SalesSystemDAO;
import ee.ut.math.tvt.salessystem.dataobjects.SoldItem;
import ee.ut.math.tvt.salessystem.dataobjects.StockItem;
import java.util.List;

public class ShoppingCartTests {

	@Test(timeout = 4000)
	public void testGetAll() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    ShoppingCart shoppingCart0 = new ShoppingCart(inMemorySalesSystemDAO0);
	    List<SoldItem> list0 = shoppingCart0.getAll();
	    assertTrue(list0.isEmpty());
	}

	@Test(timeout = 4000)
	public void testSubmitCurrentPurchase() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    ShoppingCart shoppingCart0 = new ShoppingCart(inMemorySalesSystemDAO0);
	    shoppingCart0.addItem((SoldItem) null);
	    shoppingCart0.submitCurrentPurchase();
	}

	@Test(timeout = 4000)
	public void testCancelCurrentPurchase() throws Throwable {
	    ShoppingCart shoppingCart0 = new ShoppingCart((SalesSystemDAO) null);
	    shoppingCart0.cancelCurrentPurchase();
	}

	@Test(timeout = 4000)
	public void testAddItemWithSoldItemWhereGetSumIsZero() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    ShoppingCart shoppingCart0 = new ShoppingCart(inMemorySalesSystemDAO0);
	    SoldItem soldItem0 = new SoldItem();
	    Long long0 = new Long(1360L);
	    StockItem stockItem0 = new StockItem();
	    soldItem0.setId(long0);
	    SoldItem soldItem1 = new SoldItem(stockItem0, 0);
	    shoppingCart0.addItem(soldItem0);
	    shoppingCart0.addItem(soldItem1);
	    assertEquals(0.0, soldItem1.getPrice(), 0.01);
	}

	@Test(timeout = 4000)
	public void testAddItemWithSoldItemWhereGetPriceIsZero() throws Throwable {
	    ShoppingCart shoppingCart0 = new ShoppingCart((SalesSystemDAO) null);
	    SoldItem soldItem0 = new SoldItem();
	    Long long0 = new Long(0L);
	    soldItem0.setId(long0);
	    shoppingCart0.addItem(soldItem0);
	    // Undeclared exception!
	    shoppingCart0.addItem(soldItem0);
	}

}
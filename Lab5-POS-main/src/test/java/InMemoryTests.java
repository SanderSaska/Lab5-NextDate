import ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO;
import org.junit.Test;
import static org.junit.Assert.*;
import ee.ut.math.tvt.salessystem.dataobjects.SoldItem;
import ee.ut.math.tvt.salessystem.dataobjects.StockItem;
import java.util.List;

public class InMemoryTests {

	@Test(timeout = 4000)
	public void testBeginTransaction() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    inMemorySalesSystemDAO0.beginTransaction();
	}

	@Test(timeout = 4000)
	public void testRollbackTransaction() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    inMemorySalesSystemDAO0.rollbackTransaction();
	}

	@Test(timeout = 4000)
	public void testCommitTransaction() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    inMemorySalesSystemDAO0.commitTransaction();
	}

	@Test(timeout = 4000)
	public void testFindStockItems() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    List<StockItem> list0 = inMemorySalesSystemDAO0.findStockItems();
	    assertFalse(list0.isEmpty());
	}

	@Test(timeout = 4000)
	public void testFindStockItemReturningNull() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    StockItem stockItem0 = inMemorySalesSystemDAO0.findStockItem(0L);
	    assertNull(stockItem0);
	}

	@Test(timeout = 4000)
	public void testSaveStockItem() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    Long long0 = new Long(0L);
	    StockItem stockItem0 = new StockItem(long0, "", "", 0L, (-1));
	    inMemorySalesSystemDAO0.saveStockItem(stockItem0);
	    StockItem stockItem1 = inMemorySalesSystemDAO0.findStockItem(0L);
	    assertEquals((-1), stockItem1.getQuantity());
	    assertNotNull(stockItem1);
	}

	@Test(timeout = 4000)
	public void testSaveSoldItem() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    SoldItem soldItem0 = new SoldItem();
	    inMemorySalesSystemDAO0.saveSoldItem(soldItem0);
	    assertNull(soldItem0.getName());
	}

}
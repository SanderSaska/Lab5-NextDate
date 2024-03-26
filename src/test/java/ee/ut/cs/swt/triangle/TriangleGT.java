package ee.ut.cs.swt.triangle;

import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleGT {

	@Test(timeout = 4000)
	public void testGetArea() throws Throwable {
	    Triangle triangle0 = new Triangle(1862, 1862, 1862);
	    double double0 = triangle0.getArea();
	    assertEquals(5586, triangle0.getPerimeter());
	    assertEquals(Double.NaN, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testIsScalene0() throws Throwable {
	    Triangle triangle0 = new Triangle(1886, 1886, 1886);
	    boolean boolean0 = triangle0.isScalene();
	    assertFalse(boolean0);
	    assertEquals(38332.81376314554, triangle0.getArea(), 0.01);
	}

	@Test(timeout = 4000)
	public void testIsScalene1() throws Throwable {
	    Triangle triangle0 = new Triangle(3583, 1886, 1886);
	    boolean boolean0 = triangle0.isScalene();
	    assertFalse(boolean0);
	    assertEquals(24390.225706212725, triangle0.getArea(), 0.01);
	}

	@Test(timeout = 4000)
	public void testIsScalene2() throws Throwable {
	    Triangle triangle0 = new Triangle(1, (-304), 1);
	    boolean boolean0 = triangle0.isScalene();
	    assertEquals((-302), triangle0.getPerimeter());
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testIsRightAngled() throws Throwable {
	    Triangle triangle0 = new Triangle(0, 0, 0);
	    boolean boolean0 = triangle0.isRightAngled();
	    assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testIsIsoscelesReturningFalse() throws Throwable {
	    Triangle triangle0 = new Triangle(1, (-294), 1);
	    triangle0.setSideLengths((-294), 2, 1);
	    boolean boolean0 = triangle0.isIsosceles();
	    assertEquals("-294,2,1", triangle0.getSideLengths());
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testIsEquilateralReturningTrue() throws Throwable {
	    Triangle triangle0 = new Triangle(1886, 1886, 1886);
	    boolean boolean0 = triangle0.isEquilateral();
	    assertTrue(boolean0);
	    assertEquals("1886,1886,1886", triangle0.getSideLengths());
	}

	@Test(timeout = 4000)
	public void testIsEquilateralReturningFalse() throws Throwable {
	    Triangle triangle0 = new Triangle(3583, 1886, 1886);
	    boolean boolean0 = triangle0.isEquilateral();
	    assertFalse(boolean0);
	    assertEquals(7355, triangle0.getPerimeter());
	}

	@Test(timeout = 4000)
	public void testClassify0() throws Throwable {
	    Triangle triangle0 = new Triangle(1865, 1886, 1886);
	    String string0 = triangle0.classify();
	    assertEquals("scalene", string0);
	    assertEquals(23862.43843365552, triangle0.getArea(), 0.01);
	}

	@Test(timeout = 4000)
	public void testIsIsosceles2() throws Throwable {
	    Triangle triangle0 = new Triangle(1, (-294), 1);
	    boolean boolean0 = triangle0.isIsosceles();
	    assertEquals("1,-294,1", triangle0.getSideLengths());
	    assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testClassify1() throws Throwable {
	    Triangle triangle0 = new Triangle((-2420), (-2420), (-2420));
	    String string0 = triangle0.classify();
	    assertEquals("impossible", string0);
	    assertEquals("-2420,-2420,-2420", triangle0.getSideLengths());
	}

	@Test(timeout = 4000)
	public void testIsScaleneReturningTrue() throws Throwable {
	    Triangle triangle0 = new Triangle(1, (-304), 1);
	    Triangle triangle1 = triangle0.setSideLengths((-304), (-3), 1);
	    boolean boolean0 = triangle1.isScalene();
	    assertEquals((-306), triangle0.getPerimeter());
	    assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testGetSideLengths() throws Throwable {
	    Triangle triangle0 = new Triangle(1886, 1886, 1886);
	    String string0 = triangle0.getSideLengths();
	    assertEquals("1886,1886,1886", string0);
	}

	@Test(timeout = 4000)
	public void testClassify2() throws Throwable {
	    Triangle triangle0 = new Triangle(1, 1, 1865);
	    String string0 = triangle0.classify();
	    assertEquals("isossceles", string0);
	    assertEquals("1,1,1865", triangle0.getSideLengths());
	}

	@Test(timeout = 4000)
	public void testIsIsosceles0() throws Throwable {
	    Triangle triangle0 = new Triangle(1886, 1886, 1886);
	    boolean boolean0 = triangle0.isIsosceles();
	    assertTrue(boolean0);
	    assertEquals(38332.81376314554, triangle0.getArea(), 0.01);
	}

	@Test(timeout = 4000)
	public void testClassify3() throws Throwable {
	    Triangle triangle0 = new Triangle(1886, 1886, 1886);
	    String string0 = triangle0.classify();
	    assertEquals("equilateral", string0);
	}

	@Test(timeout = 4000)
	public void testIsIsosceles1() throws Throwable {
	    Triangle triangle0 = new Triangle(1865, 3, 3);
	    boolean boolean0 = triangle0.isIsosceles();
	    assertEquals(24540.678393231105, triangle0.getArea(), 0.01);
	    assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testGetAreaReturningNegative() throws Throwable {
	    Triangle triangle0 = new Triangle(0, 0, 0);
	    double double0 = triangle0.getArea();
	    assertTrue(triangle0.isRightAngled());
	    assertEquals((-1.0), double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testClassify4() throws Throwable {
	    Triangle triangle0 = new Triangle(2, (-1), (-1));
	    String string0 = triangle0.classify();
	    assertEquals("impossible", string0);
	    assertEquals(0, triangle0.getPerimeter());
	}

	@Test(timeout = 4000)
	public void testClassify5() throws Throwable {
	    Triangle triangle0 = new Triangle(1886, 1886, (-2533));
	    String string0 = triangle0.classify();
	    assertEquals("impossible", string0);
	    assertEquals(1239, triangle0.getPerimeter());
	}

}
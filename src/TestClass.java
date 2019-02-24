import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestClass {

ArrayList <ShoppingCart> carts = new ArrayList <ShoppingCart>();
	
	@Test
	public void test1() {
		ShoppingCart cart = new ShoppingCart(1);
		carts.add(cart);
		assertTrue(cart.count == 0);
		assertTrue(cart.value == 0);
	}
	
	@Test
	public void test2() {
		ShoppingCart cart = new ShoppingCart(2);
		carts.add(cart);
		cart.addBook("java",1);
		assertTrue(cart.count == 1);
		assertTrue(cart.value == 127);
	}
	
	@Test
	public void test3() {
		ShoppingCart cart = new ShoppingCart(3);
		carts.add(cart);
		cart.addBook("java",1);
		assertTrue(cart.count == 1);
		assertTrue(cart.value == 127);
		cart.addBook("web",1);
		assertTrue(cart.count == 2);
		assertTrue(cart.value == 227);
	}
}
